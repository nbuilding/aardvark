package aardvark.local;

import aardvark.AardvarkException;
import aardvark.node.AardvarkExpressionNode;
import aardvark.type.AardvarkTyped;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AardvarkStructInstanceNode implements AardvarkExpressionNode {
    AardvarkStructNode struct;
    WeakHashMap<String, AardvarkExpressionNode> values;
    Map<String, Object> evaluated;

    public AardvarkStructInstanceNode(Map<String, AardvarkExpressionNode> values, AardvarkStructNode struct) {
        this.values = new WeakHashMap<>(values);
        this.struct = struct;

        List<AardvarkTyped> shape =
                values.values().stream().map(AardvarkExpressionNode::getType).collect(Collectors.toList());
        if(!struct.shape.doesConformToShape(shape))
            throw new AardvarkException("Struct %s expected shape %s, but you gave %s", struct.name, struct.shape.toString(), shape.toString());
    }

    public AardvarkStructInstanceNode executeGeneric(AardvarkStackFrame frame) {
        this.evaluated = values.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().executeGeneric(frame)));
        return this;
    }

    public Object referenceVariable(String name) {
        return evaluated.get(name);
    }

    public AardvarkTyped getType() {
        return struct;
    }

    @Override
    public String toString() {
        return evaluated.toString();
    }
}
