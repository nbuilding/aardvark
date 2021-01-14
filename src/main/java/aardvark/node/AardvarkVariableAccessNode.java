package aardvark.node;

import aardvark.local.AardvarkLocal;
import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

public class AardvarkVariableAccessNode implements AardvarkExpressionNode {
    public AardvarkVariableAccessNode(String varName, AardvarkTyped type) {
        this.varName = varName;
        this.type = type;
    }

    private String varName;
    AardvarkTyped type;

    @Override
    public AardvarkLocal executeGeneric(AardvarkStackFrame frame) {
        return frame.accessVariable(varName);
    }

    @Override
    public AardvarkTyped getType() {
        return type;
    }
}
