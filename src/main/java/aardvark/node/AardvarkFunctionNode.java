package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.local.FunctionSignature;
import aardvark.local.Shape;
import aardvark.type.AardvarkTyped;

import java.util.Collections;
import java.util.List;

public class AardvarkFunctionNode {

    AardvarkStatementNode[] nodes;
    AardvarkStackFrame frame;
    Shape shape;
    AardvarkTyped type;

    public AardvarkFunctionNode(AardvarkStackFrame frame, AardvarkStatementNode[] nodes, Shape parameters) {
        this.frame = frame;
        this.nodes = nodes;
        this.shape = parameters;
    }

    public AardvarkFunctionNode(AardvarkStackFrame frame, AardvarkStatementNode[] nodes, AardvarkTyped type,
                                Shape parameters) {
        this.frame = frame;
        this.nodes = nodes;
        this.shape = parameters;
        this.type = type;
    }

    public static void addBuiltin(String functionName, AardvarkExpressionNode expressionNode) {
        AardvarkStackFrame.builtinFrame.defineFunction(functionName, new AardvarkFunctionNode(AardvarkStackFrame.builtinFrame,
                new AardvarkExpressionNode[]{expressionNode}, new Shape.AnyShape(Collections.singletonList(
                "args"), Collections.singletonList(AardvarkTyped.AnyType.getInstance()))));
    }

    public AardvarkStackFrame getFrame() {
        return frame;
    }

    Shape getShape() {
        return this.shape;
    }

    public AardvarkTyped getType() {
        return type;
    }

    public boolean canBe(FunctionSignature signature) {
        List<AardvarkTyped> sigTypes = signature.getParamTypes();
        List<AardvarkTyped> ourTypes = shape.getParamTypes();

        for (int i = 0; i < sigTypes.size(); i++) {
            if(!sigTypes.get(i).canBe(ourTypes.get(i)))
                return false;
        }

        if(!signature.getReturnType().canBe(this.getType()))
            return false;
        return true;
    }
}
