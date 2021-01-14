package aardvark.local;

import aardvark.type.AardvarkTyped;

import java.util.List;

public class FunctionSignature {
    List<AardvarkTyped> paramTypes;
    AardvarkTyped returnType;

    public FunctionSignature(List<AardvarkTyped> paramTypes, AardvarkTyped returnType) {
        this.paramTypes = paramTypes;
        this.returnType = returnType;
    }

    public AardvarkTyped getReturnType() {
        return returnType;
    }

    public List<AardvarkTyped> getParamTypes() {
        return paramTypes;
    }
}
