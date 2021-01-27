package aardvark.local;

import aardvark.type.AardvarkTyped;

import java.util.List;

public class FunctionSignature {
    List<AardvarkTyped> paramTypes;
    AardvarkTyped returnType;
    String name;

    public FunctionSignature(List<AardvarkTyped> paramTypes, AardvarkTyped returnType, String name) {
        this.paramTypes = paramTypes;
        this.returnType = returnType;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AardvarkTyped getReturnType() {
        return returnType;
    }

    public List<AardvarkTyped> getParamTypes() {
        return paramTypes;
    }

    @Override
    public String toString() {
        return "FunctionSignature{" +
               "paramTypes=" + paramTypes +
               ", returnType=" + returnType +
               ", name='" + name + '\'' +
               '}';
    }
}
