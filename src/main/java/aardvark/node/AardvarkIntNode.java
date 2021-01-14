package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

public class AardvarkIntNode implements AardvarkExpressionNode{
    private int value;

    public AardvarkIntNode(int value) {
        this.value = value;
    }

    @Override
    public Object executeGeneric(AardvarkStackFrame ignored) {
        return value;
    }

    @Override
    public AardvarkTyped getType() {
        return AardvarkTyped.I32Type.getInstance();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
