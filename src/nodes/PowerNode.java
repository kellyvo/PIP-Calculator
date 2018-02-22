package nodes;

/**
 * Power Node
 * @author Kelly Vo kdv6978]
 * @class CSCI 142 Johnson
 */
public class PowerNode extends BinaryOperatorNode{
    /**
     * Constructor that sets the left/right children and sets the operator to
     * the string ^ The precedence is set to POWER
     * @param left - the PIPCalcNode representing the base
     * @param right - the PIPCalcNode representing the power
     */
    public PowerNode(PIPCalcNode left, PIPCalcNode right){
        super(left, right, Precedence.POWER, "^");
    }

    /**
     * Evaluates the node to determine its integer value
     * @return the integer value of this node
     */
    public int evaluate(){
        return (int) Math.pow(this.leftChild.evaluate(), this.rightChild.evaluate());
    }
}
