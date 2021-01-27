package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.local.FunctionSignature;
import aardvark.local.Shape;
import aardvark.type.AardvarkTyped;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AardvarkFunctionNode {

    AardvarkStatementNode[] nodes;
    AardvarkStackFrame frame;
    Shape shape;
    AardvarkTyped type;
    String name;

    public AardvarkFunctionNode(AardvarkStackFrame frame, String name, AardvarkStatementNode[] nodes,
                                Shape parameters) {
        this.frame = frame;
        this.nodes = nodes;
        this.shape = parameters;
        this.name = name;
    }

    public AardvarkFunctionNode(AardvarkStackFrame frame, String name, AardvarkStatementNode[] nodes,
                                AardvarkTyped type,
                                Shape parameters) {
        this.frame = frame;
        this.nodes = nodes;
        this.shape = parameters;
        this.type = type;
        this.name = name;
    }

    public static void addBuiltin(String functionName, AardvarkExpressionNode expressionNode) {
        AardvarkStackFrame.builtinFrame.defineFunction(functionName,
                new AardvarkFunctionNode(AardvarkStackFrame.builtinFrame, functionName,
                new AardvarkExpressionNode[]{expressionNode}, new Shape.AnyShape(Collections.singletonList(
                "args"), Collections.singletonList(AardvarkTyped.AnyType.getInstance()))));
    }

    public AardvarkStackFrame getFrame() {
        return frame;
    }

    Shape getShape() {
        return this.shape;
    }

    public String getName() {
        return name;
    }

    public AardvarkTyped getType() {
        return type;
    }

    public boolean canBe(FunctionSignature signature) {
        List<AardvarkTyped> sigTypes = signature.getParamTypes();
        List<AardvarkTyped> ourTypes = shape.getParamTypes();

        for (int i = 0; i < sigTypes.size(); i++) {
            if (!sigTypes.get(i).canBe(ourTypes.get(i))) {
                return false;
            }
        }

        return signature.getReturnType() == null && this.getType() == null || signature.getReturnType().canBe(this.getType());
    }

    @Override
    public String toString() {
        return "AardvarkFunctionNode{" +
               ", frame=" + frame +
               ", shape=" + shape +
               ", type=" + type +
               ", name='" + name + '\'' +
               '}';
    }
}
