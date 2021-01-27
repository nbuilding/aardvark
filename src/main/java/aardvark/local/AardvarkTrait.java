package aardvark.local;

import aardvark.node.AardvarkFunctionNode;
import aardvark.type.AardvarkTyped;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class AardvarkTrait implements AardvarkTyped {

    Map<String, FunctionSignature> functions;
    AardvarkStackFrame frame;

    public AardvarkTrait(AardvarkStackFrame frame, Map<String, FunctionSignature> functions) {
        this.functions = functions;
        this.frame = frame;
    }

    public AardvarkTrait(AardvarkStackFrame frame) {
        this.frame = frame;
    }

    @Override
    public boolean canBe(Object value) {
        Map<String, AardvarkFunctionNode>  functionsCmp = (Map<String, AardvarkFunctionNode>) value;

        AtomicBoolean ok = new AtomicBoolean(true);
        functions.forEach((name, func) -> {
            if(!functionsCmp.containsKey(name) || !functionsCmp.get(name).canBe(func))
                ok.set(false);
        });

        if(functionsCmp.size() != functions.size())
            ok.set(false);

        return ok.get();
    }

    public void setFunctions(Map<String, FunctionSignature> functions) {
        this.functions = functions;
    }
}
