package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.local.AardvarkTrait;
import aardvark.local.FunctionSignature;
import aardvark.local.Shape;
import aardvark.type.AardvarkTyped;

import java.util.Arrays;
import java.util.Collections;

public class AardvarkBuiltin {
    public static void init() {
        AardvarkFunctionNode.addBuiltin("println", new AardvarkExpressionNode() {
            @Override
            public void executeVoid(AardvarkStackFrame frame) {
                System.out.println(frame.accessVariable("args").value);
            }

            @Override
            public Object executeGeneric(AardvarkStackFrame frame) {
                executeVoid(frame);
                return null;
            }

            @Override
            public AardvarkTyped getType() {
                return null;
            }
        });

        AardvarkTrait eqTrait = new AardvarkTrait(AardvarkStackFrame.builtinFrame.createChildFrame());
        eqTrait.setFunctions(Collections.singletonList(new FunctionSignature(
                Collections.singletonList(eqTrait), AardvarkTyped.BooleanType.getInstance()
        )));
        AardvarkStackFrame.builtinFrame.defineTrait("eq", eqTrait);

        AardvarkStackFrame.builtinFrame.giveSingleFnTraitToOther("i32", "eq", new AardvarkFunctionNode(AardvarkStackFrame.builtinFrame
                , "eq", new AardvarkReturnNode[]{new AardvarkReturnNode(new AardvarkExpressionNode() {
            @Override
            public Object executeGeneric(AardvarkStackFrame frame) {
                return frame.accessVariable("left").value == frame.accessVariable("right").value;
            }

            @Override
            public AardvarkTyped getType() {
                return AardvarkTyped.BooleanType.getInstance();
            }
        })}, new Shape(Arrays.asList("left", "right"), Arrays.asList(eqTrait, eqTrait))));
    }
}
