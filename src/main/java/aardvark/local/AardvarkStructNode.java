package aardvark.local;

import aardvark.node.AardvarkFunctionNode;
import aardvark.type.AardvarkTyped;

import java.util.ArrayList;

public class AardvarkStructNode implements AardvarkTyped {
    public Shape shape;
    ArrayList<AardvarkTrait> implementedTraits;
    public AardvarkStackFrame frame;
    public String name;

    public AardvarkStructNode(AardvarkStackFrame frame, Shape shape, String name) {
        this.shape = shape;
        this.implementedTraits = new ArrayList<>();
        this.frame = frame;
        this.frame.makePlaceholders(this.shape);
        this.name = name;
    }

    public void setImplements(AardvarkTrait trait) {
        this.implementedTraits.add(trait);
    }

    protected AardvarkFunctionNode getFunction(String name) {
        return this.frame.accessFunction(name);
    }

    @Override
    public boolean canBe(Object value) {
        return implementedTraits.contains(value);
    }

    @Override
    public boolean isAlgebraic() {
        return true;
    }
}
