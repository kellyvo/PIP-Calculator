package nodes;

/**
 * Abstract class to represent a unary operator Unary operators only have a single child
 * @author Kelly Vo kdv6978
 * @class CSCI 142 Johnson
 */
public abstract class UnaryOperatorNode implements PIPCalcNode {
    /**
     * child
     */
    protected PIPCalcNode child;

    /**
     * operator
     */
    protected java.lang.String operator;

    /**
     * precedence
     */
    protected Precedence precedence;

    /**
     * Constructor of UnaryOperatorNode
     */
    public UnaryOperatorNode(PIPCalcNode child, Precedence precedence, java.lang.String operator){
        this.child = child;
        this.operator = operator;
        this.precedence = precedence;
    }

    /**
     * Sets the child of this node
     * @param child - the PIPCalcNode representing the child
     */
    public void setChild(PIPCalcNode child){
        this.child = child;
    }

    /**
     * Displays this node as prefix notation expression string
     * Specified by: toPrefixString in interface PIPCalcNode
     * @return string representing the node as prefix notation
     */
    public java.lang.String toPrefixString(){
        return this.operator + " " + this.child.toPrefixString();
    }

    /**
     * Displays this node as infix notation expression string
     * Specified by: toInfixString in interface PIPCalcNode
     * @return string representing the node as infix notation
     */
    public java.lang.String toInfixString(){
        return "(" + this.operator + " " + this.child.toInfixString() + ")";
    }

    /**
     * Displays this node as postfix notation expression string
     * Specified by: toPostfixString in interface PIPCalcNode
     * @return string representing the node as postfix notation
     */
    public java.lang.String toPostfixString(){
        return this.child.toPostfixString() + " " + this.operator;
    }

    /**
     * Returns the precedence if this node
     * Specified by: getPrecedence in interface PIPCalcNode
     * @return returns the precedence as an int value
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
        return NodeType.UnaryOperation;
    }


}
