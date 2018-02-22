package nodes;

/**
 * Absolute Value PIPCalcNode
 * @author Kelly Vo kdv6978
 * @class CSCI 142 Johnson
 */
public class AbsValueNode extends UnaryOperatorNode {
    /**
     * Constructor that sets the left child and sets the operator to the string |
     * The precedence is set to MULT_DIVIDE.
     * @param child - PIPCalcNode that is the child of this node
     */
    public AbsValueNode(PIPCalcNode child){
        super(child, Precedence.MULT_DIVIDE, "|");
    }
    /**
     * Evaluates the node to determine its integer value
     * @return the integer value of this node
     */
    public int evaluate(){
        return Math.abs(this.child.evaluate());
    }
}
