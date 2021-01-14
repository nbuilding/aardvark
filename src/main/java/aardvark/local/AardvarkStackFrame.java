package aardvark.local;

import aardvark.AardvarkException;
import aardvark.node.AardvarkBuiltin;
import aardvark.node.AardvarkFunctionNode;
import aardvark.node.AardvarkVariableAccessNode;
import aardvark.type.AardvarkTyped;

import java.util.HashMap;
import java.util.WeakHashMap;

public class AardvarkStackFrame {
    public static AardvarkStackFrame builtinFrame = new AardvarkStackFrame();

    static {
        AardvarkBuiltin.init();
    }

    private WeakHashMap<String, AardvarkLocal> locals;
    private WeakHashMap<String, AardvarkFunctionNode> functions;
    private WeakHashMap<String, AardvarkStructNode> structs;
    private WeakHashMap<String, AardvarkTrait> traits;
    private AardvarkStackFrame parent;

    private AardvarkStackFrame(AardvarkStackFrame parent) {
        this.parent = parent;
        this.locals = new WeakHashMap<>();
        this.functions = new WeakHashMap<>();
        this.structs = new WeakHashMap<>();
        this.traits = new WeakHashMap<>();
    }

    private AardvarkStackFrame() {
        this.locals = new WeakHashMap<>();
        this.functions = new WeakHashMap<>();
        this.structs = new WeakHashMap<>();
        this.traits = new WeakHashMap<>();
    }

    public static AardvarkStackFrame createRootFrame() {
        return builtinFrame.createChildFrame();
    }

    public AardvarkLocal accessVariable(String name) {
        AardvarkLocal localFromThisStackFrame = locals.get(name);

        if (localFromThisStackFrame != null) {
            assert name.equals(localFromThisStackFrame.name);

            if (localFromThisStackFrame.value instanceof AardvarkVariableAccessNode) {
                return ((AardvarkVariableAccessNode) localFromThisStackFrame.value).executeGeneric(this);
            }
            return localFromThisStackFrame;
        } else if (parent != null) {
            return parent.accessVariable(name);
        } else {
            throw new AardvarkException("Could not access variable %s", name);
        }
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
        locals.put(name, new AardvarkLocal(name, value, type));
    }

    public void createStruct(String name, AardvarkStructNode structNode) {
        this.structs.put(name, structNode);
    }

    public void defineFunction(String name, AardvarkFunctionNode function) {
        if (functions.containsKey(name))
            throw new AardvarkException("Function %s already defined", name);

        functions.put(name, function);
    }

    public void implementTrait(AardvarkStructNode node, AardvarkTrait trait,
                               HashMap<String, AardvarkFunctionNode> functions) {
        if (node.implementedTraits.contains(trait))
            throw new AardvarkException("Cannot reimplement trait");
        if (!trait.canBe(functions))
            throw new AardvarkException("Signature of trait and implementation do not match.");

        assert this.traits.containsValue(trait);

        node.frame.functions.putAll(functions);
        node.setImplements(trait);
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
}
