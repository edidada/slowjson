package json.bean;

/**
 * @description:
 * @author: WuCheng
 * @create: 2020-04-30 15:05
 **/

public class BoolNode extends JsonNode {
    private final boolean value;

    public BoolNode(boolean value){

        this.value = value;
    }
    public static BoolNode valueOf(boolean value) {
        return new BoolNode(value);
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.BOOL;
    }
}
