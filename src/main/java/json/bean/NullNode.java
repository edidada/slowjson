package json.bean;

/**
 * @description:
 * @author: WuCheng
 * @create: 2020-04-30 15:08
 **/

public class NullNode extends JsonNode{
    private NullNode(){

    }
    public static NullNode getInstance() {
        return new NullNode();
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.NULL;
    }
}
