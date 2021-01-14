package aardvark.local;

import aardvark.type.AardvarkTyped;

public class AardvarkLocal {
    public AardvarkTyped getType() {
        return type;
    }

    AardvarkTyped type;

    public AardvarkLocal(String name, Object value, AardvarkTyped type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    String name;
    public Object value;
    int references = 0;

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
