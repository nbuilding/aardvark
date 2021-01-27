package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

public class AardvarkVariableAccessNode implements AardvarkExpressionNode {
    public AardvarkVariableAccessNode(String varName, AardvarkTyped type) {
        this.varName = varName;
        this.type = type;
    }

    private final String varName;
    AardvarkTyped type;

    @Override
    public Object executeGeneric(AardvarkStackFrame frame) {
        return frame.accessVariable(varName);
    }

    @Override
    public AardvarkTyped getType() {
        return type;
    }
}
