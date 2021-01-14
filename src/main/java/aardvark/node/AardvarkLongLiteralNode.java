package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

public class AardvarkLongLiteralNode implements AardvarkExpressionNode {
    private long value;

    public AardvarkLongLiteralNode(long value) {
        this.value = value;
    }

    @Override
    public Object executeGeneric(AardvarkStackFrame ignored) {
        return value;
    }

    @Override
    public AardvarkTyped getType() {
        return AardvarkTyped.LongType.getInstance();
    }

}
