package aardvark.local;

import aardvark.node.AardvarkExpressionNode;
import aardvark.type.AardvarkTyped;

import java.util.Random;

public class AardvarkLocal implements AardvarkExpressionNode {
    AardvarkTyped type;
    String name;
    Object value;
    int id = new Random().nextInt();

    public AardvarkLocal(String name, Object value, AardvarkTyped type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    @Override
    public Object executeGeneric(AardvarkStackFrame frame) {
        if (value instanceof AardvarkLocal)
            return ((AardvarkLocal) value).executeGeneric(frame);
        return value;
    }

    public AardvarkTyped getType() {
        return type;
    }

    public void setValue(Object newValue) {
        if (value instanceof AardvarkLocal)
            ((AardvarkLocal) value).setValue(newValue);
        this.value = newValue;

    }

    // TODO implement drop trait
    public void drop() {
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("dropped " + name);
    }


    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}