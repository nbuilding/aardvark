package aardvark.node.primitive;

import aardvark.local.AardvarkStackFrame;
import aardvark.node.AardvarkExpressionNode;
import aardvark.type.AardvarkTyped;

public class AardvarkEqualsNode implements AardvarkExpressionNode {
    AardvarkExpressionNode left;
    AardvarkExpressionNode right;

    public AardvarkEqualsNode(AardvarkExpressionNode left, AardvarkExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object executeGeneric(AardvarkStackFrame frame) {
        return left.executeGeneric(frame) == right.executeGeneric(frame);
    }

    @Override
    public AardvarkTyped getType() {
        return AardvarkTyped.BooleanType.getInstance();
    }


}
