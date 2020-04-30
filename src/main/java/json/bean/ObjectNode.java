package json.bean;

import java.util.LinkedHashMap;
import java.util.Map;

public class ObjectNode extends JsonNode {

    private Map<String, JsonNode> _children;

    public ObjectNode() {
        _children = new LinkedHashMap<>();
    }

    @Override
    public boolean isObject() {
        return true;
    }

    @Override
    public NodeType getNodeType() {
        return null;
    }

    public JsonNode get(String key) {
        return _children.get(key);
    }

    public void set(String key, JsonNode value) {
        _children.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append('{');
        _children.forEach((k, v) -> buf.append(k).append(": ").append(v).append(","));
        if (!_children.isEmpty()) {
            buf.deleteCharAt(buf.length() - 1);
        }
        buf.append('}');
        return buf.toString();
    }
}