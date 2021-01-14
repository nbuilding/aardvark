package aardvark.node;

import aardvark.local.AardvarkStackFrame;
import aardvark.type.AardvarkTyped;

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
    }
}
