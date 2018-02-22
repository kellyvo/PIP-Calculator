package nodes;

/**
 * Multiplication Node
 * @author Kelly Vo kdv6978
 * @class CSCI 142 Johnson
 */
public class MultiplicationNode extends BinaryOperatorNode {
    /**
     * Constructor that sets the left/right children and sets the operator to
     * the string * The precedence is set to MULT_DIVIDE
     * @param left - the PIPCalcNode representing the left child
     * @param right - the PIPCalcNode representing the right child
     */
    public MultiplicationNode(PIPCalcNode left, PIPCalcNode right){
        super(left, right, Precedence.MULT_DIVIDE, "*");
    }

    /**
     * Evaluates the node to determine its integer value
     * @return the integer value of this node
     */
    public int evaluate(){
        return this.leftChild.evaluate() * this.rightChild.evaluate();
    }
}
