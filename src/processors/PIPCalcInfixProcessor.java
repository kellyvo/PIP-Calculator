package processors;


import nodes.*;

import java.util.Stack;

/**
 * Class to process PIPCalc expression using infix notation
 * @author Kelly Vo 6978
 * @class CSCI 142 Johnson
 */
public class PIPCalcInfixProcessor extends PIPCalcProcessor {
    /**
     * Constructor of PIPCalcInfixProcessor
     */
    public PIPCalcInfixProcessor(){}

    /**
     * Constructs and assigns a PIPCalc tree from the provided list of
     * PIPCalcNode tokens using infix notation
     * Specified by: constructTree in class PIPCalcProcesssor
     * @param tokens - list of PIPCalcNodes used to create the pare tree
     */
    public void constructTree(java.util.ArrayList<java.lang.String> tokens){
        Stack<PIPCalcNode> operator = new Stack<>();
        Stack<PIPCalcNode> other = new Stack<>();
        while (tokens.size() > 0){
            PIPCalcNode node = createPIPCalcNode(tokens.remove(0));
            if(node.getNodeType() == PIPCalcNode.NodeType.Constant){
                other.push(node);
            } else if(node.getNodeType() == PIPCalcNode.NodeType.UnaryOperation){
                operator.push(node);
            } else {
                if(operator.empty()){
                    operator.push(node);
                } else {
                    while(!operator.isEmpty() && node.getPrecedence() > operator.peek().getPrecedence()) {
                        PIPCalcNode pop = operator.pop();
                        if (pop.getNodeType() == PIPCalcNode.NodeType.BinaryOperation) {
                            BinaryOperatorNode binary = (BinaryOperatorNode) pop;
                            PIPCalcNode right = other.pop();
                            PIPCalcNode left = other.pop();
                            binary.setLeftChild(left);
                            binary.setRightChild(right);
                            other.push(binary);
                        } else if (pop.getNodeType() == PIPCalcNode.NodeType.UnaryOperation) {
                            UnaryOperatorNode unary = (UnaryOperatorNode) pop;
                            PIPCalcNode child = other.pop();
                            unary.setChild(child);
                            other.push(unary);
                        }
                    }
                    operator.push(node);
                }
            }
        }
        while(!operator.empty()) {
            PIPCalcNode pop = operator.pop();
            if (pop.getNodeType() == PIPCalcNode.NodeType.BinaryOperation) {
                BinaryOperatorNode binary = (BinaryOperatorNode) pop;
                PIPCalcNode right = other.pop();
                PIPCalcNode left = other.pop();
                binary.setLeftChild(left);
                binary.setRightChild(right);
                other.push(binary);
            } else if (pop.getNodeType() == PIPCalcNode.NodeType.UnaryOperation) {
                UnaryOperatorNode unary = (UnaryOperatorNode) pop;
                PIPCalcNode child = other.pop();
                unary.setChild(child);
                other.push(unary);
            }
        }
        this.tree = other.pop();
    }

}
