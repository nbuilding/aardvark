package aardvark.node;

import aardvark.local.AardvarkStackFrame;

public class AardvarkFor implements AardvarkStatementNode {
    AardvarkStatementNode[] nodes;
    AardvarkStackFrame frame;
    AardvarkVariableDeclaration declaration;
    AardvarkExpressionNode predicate;
    AardvarkStackFrame eachTime;

    public AardvarkFor(AardvarkStackFrame frame, AardvarkVariableDeclaration declaration, AardvarkExpressionNode predicate, AardvarkStackFrame eachTime, AardvarkStatementNode[] nodes) {
        this.frame = frame;
        this.nodes = nodes;
        this.declaration = declaration;
        this.predicate = predicate;
        this.eachTime = eachTime;

    }

    public AardvarkStackFrame getFrame() {
        return frame;
    }

    @Override
    public void executeVoid(AardvarkStackFrame frame) {

    }
}
