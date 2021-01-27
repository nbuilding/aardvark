package aardvark.local;

public interface StackFrame {
    AardvarkLocal referenceVariable(String name);
    AardvarkLocal referenceType(String name);
}
