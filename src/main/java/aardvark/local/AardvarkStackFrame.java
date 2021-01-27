package aardvark.local;

import aardvark.AardvarkException;
import aardvark.node.AardvarkBuiltin;
import aardvark.node.AardvarkFunctionNode;
import aardvark.node.AardvarkVariableAccessNode;
import aardvark.type.AardvarkTyped;

import java.util.*;

public class AardvarkStackFrame {
    public static AardvarkStackFrame builtinFrame = new AardvarkStackFrame();

    static {
        AardvarkBuiltin.init();
    }

    public WeakHashMap<String, AardvarkLocal> locals;
    private WeakHashMap<String, AardvarkFunctionNode> functions;
    private WeakHashMap<String, AardvarkStructNode> structs;
    private WeakHashMap<String, AardvarkTrait> traits;
    public WeakHashMap<String, Map<String, AardvarkFunctionNode>> otherImpls;
    private AardvarkStackFrame parent;
    private AardvarkTyped pointerToThisType;

    public void setPointerToThisType(AardvarkTyped pointerToThisType) {
        this.pointerToThisType = pointerToThisType;
    }

    private AardvarkStackFrame(AardvarkStackFrame parent) {
        this();
        this.parent = parent;
    }

    private AardvarkStackFrame() {
        this.locals = new WeakHashMap<>();
        this.functions = new WeakHashMap<>();
        this.structs = new WeakHashMap<>();
        this.traits = new WeakHashMap<>();
        this.otherImpls = new WeakHashMap<>();
    }

    public static AardvarkStackFrame createRootFrame() {
        return builtinFrame.createChildFrame();
    }

    public AardvarkLocal accessVariable(String name) {
        if(name.contains(".")) {
            List<String> derefPath = new ArrayList<>(List.of(name.split("\\.")));
            System.out.println(this);

            String scopeName = derefPath.get(0);

            derefPath.remove(0);
            return ((AardvarkStructInstanceNode)this.locals.get(scopeName).value).referenceVariable(derefPath.get(0));
        }

        AardvarkLocal localFromThisStackFrame = locals.get(name);

        if (localFromThisStackFrame != null) {
            assert name.equals(localFromThisStackFrame.name);

            return localFromThisStackFrame;
        } else if (parent != null) {
            return parent.accessVariable(name);
        } else {
            throw new AardvarkException("Could not access variable %s", name);
        }
    }

    public boolean hasVariable(String name) {
        if(locals.get(name) != null)
            return true;
        else if(parent != null)
            return parent.hasVariable(name);
        else
            return false;
    }

    public AardvarkFunctionNode accessFunction(String name) {
        AardvarkFunctionNode localFromThisStackFrame = functions.get(name);

        if (localFromThisStackFrame != null) {
            return localFromThisStackFrame;
        } else if (parent != null) {
            return parent.accessFunction(name);
        } else {
            throw new AardvarkException("Could not access function %s", name);
        }
    }

    public AardvarkStructNode accessStruct(String name) {
        AardvarkStructNode localFromThisStackFrame = structs.get(name);

        if (localFromThisStackFrame != null) {
            return localFromThisStackFrame;
        } else if (parent != null) {
            return parent.accessStruct(name);
        } else {
            throw new AardvarkException("Could not access struct %s", name);
        }
    }

    public AardvarkTrait accessTrait(String name) {
        AardvarkTrait localFromThisStackFrame = traits.get(name);

        if (localFromThisStackFrame != null) {
            return localFromThisStackFrame;
        } else if (parent != null) {
            return parent.accessTrait(name);
        } else {
            throw new AardvarkException("Could not access trait %s", name);
        }
    }

    public AardvarkTyped accessType(String name) {
        if(name.equals("Self") && this.pointerToThisType != null)
            return this.pointerToThisType;

        try {
            return accessStruct(name);
        } catch (AardvarkException ignored) { }

        try {
            return accessTrait(name);
        } catch (AardvarkException ignored) {
            return null;
        }
    }

    public void createVariable(String name, Object value, AardvarkTyped type) {
        if(hasVariable(name))
            throw new AardvarkException("Internal error: variable %s is already defined.", name);
        locals.put(name, new AardvarkLocal(name, value, type));
    }

    public void createOrReset(String name, Object value, AardvarkTyped type) {
        if(this.hasVariable(name))
            this.accessVariable(name).setValue(value);
        else
            this.createVariable(name, value, type);
    }

    public void createStruct(String name, AardvarkStructNode structNode) {
        this.structs.put(name, structNode);
    }

    public void defineFunction(String name, AardvarkFunctionNode function) {
        if (functions.containsKey(name))
            throw new AardvarkException("Function %s already defined", name);
        functions.put(name, function);
    }

    public void implementTraitForStruct(AardvarkStructNode node, AardvarkTrait trait,
                                        Map<String, AardvarkFunctionNode> functions) {

        if (node.implementedTraits.contains(trait))
            throw new AardvarkException("Cannot reimplement trait");
        if (!trait.canBe(functions))
            throw new AardvarkException("Signature of trait and implementation do not match.");

        assert this.traits.containsValue(trait);

        node.frame.functions.putAll(functions);
        node.setImplements(trait);
    }

    public void giveSingleFnTraitToOther(String name, String traitName, AardvarkFunctionNode functionNode) {
        this.otherImpls.computeIfAbsent(name, k -> new HashMap<>());
        this.otherImpls.get(name).put(traitName, functionNode);
    }

    public AardvarkFunctionNode getOtherImpl(String traitName, String functionName) {
        var fromThisScope = this.otherImpls.get(traitName);
        if(fromThisScope != null && fromThisScope.get(functionName) != null) return fromThisScope.get(functionName);
        else if(parent != null) return parent.getOtherImpl(traitName, functionName);
        else return null;
    }


    public void defineTrait(String name, AardvarkTrait trait) {
        this.traits.put(name, trait);
    }

    public void makePlaceholders(Shape shape) { // this is VERY janky, and is used to we can typecheck functions and
        // stuff
        var variableNames = shape.getParamNames();
        var variableTypes = shape.getParamTypes();

        for (int i = 0; i < variableNames.size(); i++) {
            this.createVariable(variableNames.get(i), null, variableTypes.get(i));
        }
    }

    public AardvarkStackFrame createChildFrame() {
        return new AardvarkStackFrame(this);
    }

    @Override
    public String toString() {
        return parent == null ? "" : (parent.toString() + " ---->") + "AardvarkStackFrame{" +
               "locals=" + locals +
               '}';
    }
}
