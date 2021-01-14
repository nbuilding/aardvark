package aardvark.local;

import aardvark.node.AardvarkFunctionNode;
import aardvark.type.AardvarkTyped;

import java.util.List;

public class AardvarkTrait implements AardvarkTyped {

    List<FunctionSignature> functions;
    AardvarkStackFrame frame;

    public AardvarkTrait(AardvarkStackFrame frame, List<FunctionSignature> functions) {
        this.functions = functions;
        this.frame = frame;
    }

    @Override
    public boolean canBe(Object value) {
        List<AardvarkFunctionNode> functionsCmp = (List<AardvarkFunctionNode>) value;
        for (int i = 0; i < functions.size(); i++) {
            if(!functionsCmp.get(i).canBe(functions.get(i)))
                return false;
        }

        return true;
    }
}
