package json.bean;

/**
 * @description:
 * @author: WuCheng
 * @create: 2020-04-30 15:08
 **/

public class DoubleNode extends JsonNode{
    private double value;

    public DoubleNode(){
        this.value = 0d;
    }

    public DoubleNode(double value){
        this.value = value;
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.DOUBLE;
    }
}
