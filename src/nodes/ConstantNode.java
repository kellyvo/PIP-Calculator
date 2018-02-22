package nodes;

/**
 * Constant PIPCalcNode
 */
public class ConstantNode implements PIPCalcNode {
    /**
     * integer value of this node
     */
    private int value;

    /**
     * Constructor that sets the value of this node
     * @param value - integer value of this node
     */
    public ConstantNode(int value){
        this.value = value;
    }

    /**
     * Returns the value of this node
     * Specified by: evaluate in interface PIPCalcNode
     * @return the integer value of this node
     */
    public int evaluate(){
        return this.value;
    }

    /**
     * Returns the value of this node in prefix notation
     * Specified by: toPrefixString in interface PIPCalcNode
     * @return the integer value of this node
     */
    public java.lang.String toPrefixString(){
        return " " + this.value;
    }

    /**
     * Returns the value of this node in infix notation
     * Specified by: toInfixString in interface PIPCalcNode
     * @return the integer value of this node
     */
    public java.lang.String toInfixString(){
        return " " + this.value;
    }

    /**
     * Returns the value of this node in postfix notation
     * Specified by: toPostfixString in interface PIPCalcNode
     * @return the integer value of this node
     */
    public java.lang.String toPostfixString(){
        return " " + this.value;
    }

    /**
     * Returns the precedence of ths node
     * Specified by: getPrecedence in interface PIPCalcNode
     * @return returns the precedence of CONSTANT
     */
    public int getPrecedence(){
        return Precedence.CONSTANT.getPrecedence();
    }

    /**
     * Determines if the node is an operation node
     * Specified by: isOperation in interface PIPCalcNode
     * @return true if an operration node, false otherwise
     */
    public boolean isOperation(){
        return false;
    }

    /**
     * Determines the node type
     * Specified by: getNodeType in interface PIPCalcNode
     * @return the type of this node
     */
    public PIPCalcNode.NodeType getNodeType(){
        return NodeType.Constant;
    }
}
