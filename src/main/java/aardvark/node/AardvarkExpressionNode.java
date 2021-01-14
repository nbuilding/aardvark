package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

public interface AardvarkExpressionNode extends AardvarkStatementNode {
    @Override
    default void executeVoid(AardvarkStackFrame frame)  {
        executeGeneric(frame);
    };

    Object executeGeneric(AardvarkStackFrame frame);
    AardvarkTyped getType();
}
