package aardvark.node;

import aardvark.local.AardvarkStackFrame;

public interface AardvarkStatementNode {
    void executeVoid(AardvarkStackFrame frame);
}
