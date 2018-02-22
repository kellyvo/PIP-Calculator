package nodes;

/**
 * Node representing the not equals operator
 * @author Kelly Vo kdv6978
 * @class CSCI 142 Johnson
 */
public class NotEqualityNode extends BooleanOperatorNode {
    /**
     * Constructor that sets the left/right children and sets the operator to
     * the string !=
     * @param left - the PIPCalcNode representing the left child
     * @param right - the PIPCalcNode representing the right child
     */
    public NotEqualityNode(PIPCalcNode left, PIPCalcNode right){
        super(left, right, "!=");
    }

    /**
     * Evaluates the node to determine its integer value 1 for true, zero for
     * false
     * @return the integer value of this node
     */
    public int evaluate(){
        if(this.leftChild.evaluate() != this.rightChild.evaluate()){
            return 1;
        } else {
            return 0;
        }
    }
}
