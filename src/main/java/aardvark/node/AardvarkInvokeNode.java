package aardvark.node;

import aardvark.AardvarkException;
import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class AardvarkInvokeNode implements AardvarkExpressionNode {
    AardvarkFunctionNode functionNode;
    AardvarkExpressionNode[] parameters;

    public AardvarkInvokeNode(AardvarkFunctionNode functionNode,  AardvarkExpressionNode... parameters) {
        this.functionNode = functionNode;
        this.parameters = parameters;
    }

    public Object executeGeneric(AardvarkStackFrame callerFrame) {

        LinkedList<AardvarkTyped> expectedSignature = Arrays.stream(parameters)
                .map(AardvarkExpressionNode::getType)
                .collect(Collectors.toCollection(LinkedList::new));
        if(!functionNode.getShape().doesConformToShape(expectedSignature)) {
            throw new AardvarkException("Parameters do not match function signature. Expected: %s, Received: %s", this.functionNode.getShape().getParamTypes(), expectedSignature);
        }
        AardvarkStackFrame frame = functionNode.getFrame().createChildFrame();

        var parameterNames = functionNode.getShape().getParamNames();
        var parameterTypes = functionNode.getShape().getParamTypes();

        for (int i = 0; i < parameterNames.size(); i++) {
            Object value = parameters[i].executeGeneric(callerFrame);
            frame.createVariable(parameterNames.get(i), value, parameterTypes.get(i));
        }


        for (AardvarkStatementNode node : functionNode.nodes) {
            if(node.getClass() == AardvarkReturnNode.class) {
                return ((AardvarkReturnNode) node).executeGeneric(frame);
            }
            node.executeVoid(frame);
        }
        return null;
    }

    public AardvarkTyped getType() {
        return this.functionNode.getType();
    }
}
