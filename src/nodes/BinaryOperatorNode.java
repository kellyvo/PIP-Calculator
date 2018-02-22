package nodes;

/**
 * Abstract class to represent a binary operator Has a left/right child, precedence,
 * and operator
 * @author Kelly Vo kdv6978
 * @class CSCI 142 Johnson
 */
public abstract class BinaryOperatorNode implements PIPCalcNode {
    /**
     * leftChild
     */
    protected PIPCalcNode leftChild;
    /**
     * rightChild
     */
    protected PIPCalcNode rightChild;
    /**
     * precedence
     */
    protected Precedence precedence;
    /**
     * operator
     */
    protected java.lang.String operator;

    /**
     * Binary Node Constructor
     * @param leftChild - - PIPCalcNode representing the left child
     * @param rightChild - - PIPCalcNode representing the right child
     * @param precedence - - Precedence of the operator
     * @param operator - - String representing the operator
     */
    public BinaryOperatorNode(PIPCalcNode leftChild, PIPCalcNode rightChild,
                              Precedence precedence, java.lang.String operator){

        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.precedence = precedence;
        this.operator = operator;
    }

    /**
     * Setter for left child
     * @param leftChild - The PIPCalcNode to be set at this node's left child
     */
    public void setLeftChild(PIPCalcNode leftChild){
        this.leftChild = leftChild;
    }

    /**
     * Setter for right child
     * @param rightChild - The PIPCalcNode to be set at this node's left child
     */
    public void setRightChild(PIPCalcNode rightChild){
        this.rightChild = rightChild;

    }

    /**
     * Displays this node as prefix notation expression string
     * Specified by: toPrefixString in interface PIPCalcNode
     * @return string representing the node as prefix notation
     */
    public java.lang.String toPrefixString(){
        return this.operator + " " + this.leftChild.toPrefixString() + " " + this.rightChild.toPrefixString();
    }

    /**
     * Displays this node as infix notation expression string
     * Specified by: toInfixString in interface PIPCalcNode
     * @return string representing the node as infix notation
     */
    public java.lang.String toInfixString(){
        return "(" + this.leftChild.toInfixString() + " " + this.operator + " " + this.rightChild.toInfixString() + ")";
    }

    /**
     * Display this node as postfix notation expression string
     * Specified by: toPostficString in interface PIPCalcNode
     * @return string representing the node as postfix notation
     */
    public java.lang.String toPostfixString(){
        return this.leftChild.toPostfixString() + " " + this.rightChild.toPostfixString() + " " + this.operator;
    }

    /**
     * Returns the precedence of this node
     * Specified by: getPrecedence in interface PIPCalcNode
     * @return returns the precedence of this node as an int value
     */
    public int getPrecedence(){
        return precedence.getPrecedence();
    }

    /**
     * Determines if the node is an operation node
     * Specified by: isOperation in interface PIPCalcNode
     * @return true if an operation node, false otherwise
     */
    public boolean isOperation(){
        return true;
    }

    /**
     * Determines the node type
     * Specified by: getNodeType in interface PIPCalcNode
     * @return the type of this node
     */
    public PIPCalcNode.NodeType getNodeType(){
        return NodeType.BinaryOperation;
    }

}
