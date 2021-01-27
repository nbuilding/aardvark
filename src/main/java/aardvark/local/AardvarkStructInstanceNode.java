package aardvark.local;

import aardvark.AardvarkException;
import aardvark.node.AardvarkExpressionNode;
import aardvark.type.AardvarkTyped;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.stream.Collectors;

public class AardvarkStructInstanceNode implements AardvarkExpressionNode {
    AardvarkStructNode struct;
    private WeakHashMap<String, AardvarkExpressionNode> values;
    Map<String, AardvarkLocal> evaluated;
    boolean isPlaceholder = false;

    public AardvarkStructInstanceNode(Map<String, AardvarkExpressionNode> values, AardvarkStructNode struct) {
        this.values = new WeakHashMap<>(values);
        this.evaluated = new WeakHashMap<>();
        this.struct = struct;

        List<AardvarkTyped> shape =
                values.values().stream().map(AardvarkExpressionNode::getType).collect(Collectors.toList());
        if (!struct.shape.doesConformToShape(shape))
            throw new AardvarkException("Struct %s expected shape %s, but you gave %s", struct.name,
                    struct.shape.toString(), shape.toString());

        // make placeholder pointers
        values.forEach((key, value) -> evaluated.put(key, new AardvarkLocal(key, null, value.getType())));
    }

    public AardvarkStructInstanceNode(boolean isPlaceholder, Map<String, AardvarkExpressionNode> values,
                                      AardvarkStructNode struct) {
        this(values, struct);
        this.isPlaceholder = isPlaceholder;
    }

    public AardvarkStructInstanceNode executeGeneric(AardvarkStackFrame frame) {
        values.forEach((key, value) -> evaluated.get(key).setValue(value.executeGeneric(frame)));
        return this;
    }

    public AardvarkLocal referenceVariable(String name) {
        if(this.isPlaceholder)
            throw new AardvarkException("Tried to reference placeholder struct instance.");
        return evaluated.get(name);
    }

    public AardvarkTyped getType() {
        return struct;
    }

    @Override
    public String toString() {
        return this.hashCode() + values.toString() + evaluated.toString();
    }
}
