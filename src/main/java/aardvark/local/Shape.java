package aardvark.local;

import aardvark.type.AardvarkTyped;

import java.util.List;

public class Shape {
    List<String> paramNames;
    List<AardvarkTyped> paramTypes;

    public Shape(List<String> paramNames, List<AardvarkTyped> paramTypes) {
        this.paramNames = paramNames;
        this.paramTypes = paramTypes;
    }

    @Override
    public String toString() {
        return paramTypes.toString();
    }

    public List<String> getParamNames() {
        return paramNames;
    }

    public List<AardvarkTyped> getParamTypes() {
        return paramTypes;
    }

    public boolean doesConformToShape(List<AardvarkTyped> inputs) {
        if (inputs.size() != this.paramTypes.size())
            return false;
        for (int i = 0; i < this.paramTypes.size(); i++) {
            if (!(inputs.get(i).canBe(this.paramTypes.get(i))
                  || this.paramTypes.get(i).equals(inputs.get(i))))
                return false;

        }

        return true;
    }

    public static class AnyShape extends Shape {

        public AnyShape(List<String> paramNames, List<AardvarkTyped> paramTypes) {
            super(paramNames, paramTypes);
        }


        @Override
        public boolean doesConformToShape(List<AardvarkTyped> inputs) {
            return true;
        }
    }
}
