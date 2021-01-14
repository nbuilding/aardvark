package aardvark.node.primitive;

import aardvark.local.AardvarkStackFrame;
import aardvark.node.AardvarkExpressionNode;
import aardvark.type.AardvarkTyped;

public class AardvarkBooleanNode implements AardvarkExpressionNode {
    public boolean value;

    public AardvarkBooleanNode(boolean value) {
        this.value = value;
    }

    @Override
    public Object executeGeneric(AardvarkStackFrame ignored) {
        return value;
    }

    @Override
    public AardvarkTyped getType() {
        return AardvarkTyped.BooleanType.getInstance();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
