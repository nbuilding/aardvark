package aardvark.node;

import aardvark.local.AardvarkStackFrame;

public class AardvarkVariableMutation implements AardvarkStatementNode {
    final String variableName;
    final AardvarkExpressionNode value;

    public AardvarkVariableMutation(String variableName, AardvarkExpressionNode value) {
        this.variableName = variableName;
        this.value = value;
    }

    @Override
    public void executeVoid(AardvarkStackFrame frame) {
        frame.accessVariable(variableName).setValue(value.executeGeneric(frame));
    }
}
