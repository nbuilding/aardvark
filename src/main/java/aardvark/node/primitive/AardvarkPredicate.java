package aardvark.node.primitive;

import aardvark.local.AardvarkStackFrame;
import aardvark.node.AardvarkExpressionNode;
import aardvark.type.AardvarkTyped;

public class AardvarkPredicate implements AardvarkExpressionNode {
    AardvarkExpressionNode left, right;
    String traitName;
    AardvarkStackFrame frame;

    public AardvarkPredicate(AardvarkStackFrame frame, AardvarkExpressionNode left, AardvarkExpressionNode right, String traitName) {
        this.left = left;
        this.right = right;
        this.traitName = traitName;
        this.frame = frame;
    }

    @Override
    public Object executeGeneric(AardvarkStackFrame frame) {
        return null;
    }

    @Override
    public AardvarkTyped getType() {
        return AardvarkTyped.BooleanType.getInstance();
    }
}
