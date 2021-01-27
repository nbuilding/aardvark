package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

public class AardvarkAddNode implements AardvarkExpressionNode {
    AardvarkExpressionNode left, right;
    
    @Override
    public Object executeGeneric(AardvarkStackFrame frame) {
        return null;
    }

    @Override
    public AardvarkTyped getType() {
        return null;
    }
}
