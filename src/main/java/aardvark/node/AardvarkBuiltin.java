package aardvark.node;

import aardvark.local.*;
import aardvark.node.primitive.AardvarkBooleanNode;
import aardvark.type.AardvarkTyped;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.BiFunction;

public class AardvarkBuiltin {
    public static void init() {
        AardvarkFunctionNode.addBuiltin("println", new AardvarkExpressionNode() {
            @Override
            public void executeVoid(AardvarkStackFrame frame) {
                System.out.println(frame.accessVariable("args").executeGeneric(frame));
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

        AardvarkFunctionNode.addBuiltin("inc", new AardvarkExpressionNode() {
            @Override
            public Object executeGeneric(AardvarkStackFrame frame) {
                AardvarkLocal var = frame.accessVariable("args");
                var.setValue((Integer)var.executeGeneric(frame) + 1);
                return null;
            }

            @Override
            public AardvarkTyped getType() {
                return null;
            }
        });

        defineI32Predicate(Integer::equals, "eq");
        defineI32Predicate((a, b) -> a < b, "le");
        defineI32Predicate((a, b) -> a > b, "ge");
        defineI32Predicate((a, b) -> a <= b, "leq");
        defineI32Predicate((a, b) -> a >= b, "geq");
        defineI32Predicate((a, b) -> !a.equals(b), "neq");

        defineI32Fn(Integer::sum, "add");
        defineI32Fn((a, b) -> a - b, "sub");
        defineI32Fn((a, b) -> a * b, "mul");
        defineI32Fn((a, b) -> a / b, "div");
    }

    static void defineI32Predicate(BiFunction<Integer, Integer, Boolean> fn, String name) {
        AardvarkTrait trait = new AardvarkTrait(AardvarkStackFrame.builtinFrame.createChildFrame());
        trait.setFunctions(Collections.singletonMap(name, new FunctionSignature(
                Collections.singletonList(trait), AardvarkTyped.BooleanType.getInstance(), name
        )));
        AardvarkStackFrame.builtinFrame.defineTrait(name, trait);

        AardvarkStackFrame.builtinFrame.giveSingleFnTraitToOther("i32", name,
                new AardvarkFunctionNode(AardvarkStackFrame.builtinFrame
                , name, new AardvarkReturnNode[]{new AardvarkReturnNode(new AardvarkExpressionNode() {
            @Override
            public Object executeGeneric(AardvarkStackFrame frame) {
                return new AardvarkBooleanNode(fn.apply((int) frame.accessVariable("left").executeGeneric(frame),
                        (int) frame.accessVariable("right").executeGeneric(frame)));
            }

            @Override
            public AardvarkTyped getType() {
                return AardvarkTyped.BooleanType.getInstance();
            }
        })}, new Shape(Arrays.asList("left", "right"), Arrays.asList(trait, trait))));
    }

    static void defineI32Fn(BiFunction<Integer, Integer, Integer> fn, String name) {
        AardvarkTrait trait = new AardvarkTrait(AardvarkStackFrame.builtinFrame.createChildFrame());
        trait.setFunctions(Collections.singletonMap(name, new FunctionSignature(
                Collections.singletonList(trait), AardvarkTyped.BooleanType.getInstance(), name
        )));
        AardvarkStackFrame.builtinFrame.defineTrait(name, trait);

        AardvarkStackFrame.builtinFrame.giveSingleFnTraitToOther("i32", name,
                new AardvarkFunctionNode(AardvarkStackFrame.builtinFrame
                        , name, new AardvarkReturnNode[]{new AardvarkReturnNode(new AardvarkExpressionNode() {
                    @Override
                    public Object executeGeneric(AardvarkStackFrame frame) {
                        return new AardvarkIntNode(fn.apply((int) frame.accessVariable("left").executeGeneric(frame),
                                (int) frame.accessVariable("right").executeGeneric(frame)));
                    }

                    @Override
                    public AardvarkTyped getType() {
                        return AardvarkTyped.I32Type.getInstance();
                    }
                })}, new Shape(Arrays.asList("left", "right"), Arrays.asList(trait, trait))));
    }
}
