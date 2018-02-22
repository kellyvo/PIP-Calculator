package nodes;

/**
 * Abstract class to represent a boolean operator Has a left/right child,
 * precedence, and operator. Assumes non-zero values are true, zero is false
 * @author Kelly Vo kdv6978
 * @class CSCI 142 Johnson
 */
public abstract class BooleanOperatorNode extends BinaryOperatorNode {
    /**
     * Constructor for Boolean operation nodes
     * The precendence is set to BOOLEAN
     * @param left - the left child for this operation
     * @param right - the right child for this operation
     * @param operator - the string representing the operation for this node
     */
    public BooleanOperatorNode(PIPCalcNode left, PIPCalcNode right, java.lang.String operator){
        super(left, right, Precedence.BOOLEAN, operator);
    }
    /**
     * Returns the precedence of this node
     * Specified by: getPrecedence in interface PIPCalcNode
     * Overrides: getPrecedence in class BinaryOperatorNode
     * @return returns the precedence of BOOLEAN
     */
    @Override
    public int getPrecedence(){
        return precedence.getPrecedence();
    }
}
