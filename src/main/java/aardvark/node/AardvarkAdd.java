package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

public class AardvarkAdd implements AardvarkExpressionNode {
    private AardvarkTyped type;
    private AardvarkExpressionNode l1, l2;

    public AardvarkAdd(AardvarkExpressionNode l1, AardvarkExpressionNode l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public Object executeGeneric(AardvarkStackFrame frame) {
        return (int)l1.executeGeneric(frame) + (int)l2.executeGeneric(frame);
    }

    @Override
    public AardvarkTyped getType() {
        return AardvarkTyped.LongType.getInstance();
    }
}
