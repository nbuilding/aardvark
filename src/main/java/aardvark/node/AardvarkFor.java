package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.node.primitive.AardvarkBooleanNode;

public class AardvarkFor implements AardvarkStatementNode {
    AardvarkStatementNode[] nodes;
    AardvarkStackFrame frame;
    AardvarkStatementNode declaration;
    AardvarkExpressionNode predicate;
    AardvarkStatementNode eachTime;

    public AardvarkFor(AardvarkStackFrame frame, AardvarkStatementNode declaration, AardvarkExpressionNode predicate, AardvarkStatementNode eachTime, AardvarkStatementNode[] nodes) {
        this.frame = frame.createChildFrame();
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
        declaration.executeVoid(frame);
        while(((AardvarkBooleanNode) predicate.executeGeneric(frame)).value) {
            for (AardvarkStatementNode node : nodes) {
                node.executeVoid(frame);
            }
            eachTime.executeVoid(frame);
        }
    }
}
