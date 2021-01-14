package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

public class AardvarkReturnNode implements AardvarkExpressionNode {
    private AardvarkExpressionNode value;
    public AardvarkReturnNode(AardvarkExpressionNode value) {
        this.value = value;
    }

    @Override
    public Object executeGeneric(AardvarkStackFrame frame) {
        return value.executeGeneric(frame);
    }

    @Override
    public AardvarkTyped getType() {
        return value.getType();
    }
}
