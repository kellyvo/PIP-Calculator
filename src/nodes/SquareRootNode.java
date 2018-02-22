package nodes;

/**
 * Square Root PIPCalcNode
 * @author Kelly Vo kdv6978
 * @class CSCI 142 Johnson
 */
public class SquareRootNode extends UnaryOperatorNode{
    /**
     * Constructor that sets the left child and sets the operator to the
     * string @ The precedence is set to POWER
     * @param child - PIPCalcNode that is the child of this node
     */
    public SquareRootNode(PIPCalcNode child){
        super(child, Precedence.POWER, "@");
    }

    /**
     * Evaluates the node to determine its integer value Errors if the child
     * evaluates to a negative number
     * @return the integer value of this node
     */
    public int evaluate(){
        return (int) Math.sqrt(this.child.evaluate());
    }
}
