package aardvark.local;

import aardvark.type.AardvarkTyped;

import java.util.List;

public class Shape {
    public Shape(List<String> paramNames, List<AardvarkTyped> paramTypes) {
        this.paramNames = paramNames;
        this.paramTypes = paramTypes;
    }

    public List<String> getParamNames() {
        return paramNames;
    }

    public List<AardvarkTyped> getParamTypes() {
        return paramTypes;
    }

    List<String> paramNames;
    List<AardvarkTyped> paramTypes;

    public boolean doesConformToShape(List<AardvarkTyped> inputs) {
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
