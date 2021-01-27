package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

public class AardvarkVariableDeclaration implements AardvarkStatementNode {
    String variableName;
    AardvarkExpressionNode value;
    AardvarkTyped type;

    public AardvarkVariableDeclaration(String variableName, AardvarkExpressionNode value) {
        this.variableName = variableName;
        this.value = value;
        this.type = value.getType();
    }

    @Override
    public void executeVoid(AardvarkStackFrame frame) {
        frame.createOrReset(variableName, value.executeGeneric(frame), type);
    }
}
