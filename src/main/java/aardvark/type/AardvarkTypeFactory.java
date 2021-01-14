package aardvark.type;

import aardvark.local.AardvarkStackFrame;

public class AardvarkTypeFactory {
    public static AardvarkTyped getType(String typeName, AardvarkStackFrame frame) {
        AardvarkTyped type = frame.accessType(typeName);
        if (type != null)
            return type;


        return switch (typeName) {
            case "i32" -> AardvarkTyped.I32Type.getInstance();
            case "l64" -> AardvarkTyped.LongType.getInstance();
            default -> throw new IllegalStateException("Unknown type: " + typeName);
        };
    }
}
