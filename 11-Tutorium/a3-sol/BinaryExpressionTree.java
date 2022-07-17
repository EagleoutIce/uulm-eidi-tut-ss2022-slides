import java.util.NoSuchElementException;
import java.security.InvalidParameterException;

public class BinaryExpressionTree {
    private StringNode root;

    public BinaryExpressionTree(String[] items) {
        if (items.length < 2)
            throw new NoSuchElementException();

        root = new StringNode(items[0]);
        insertNodes(root, items, 1);
        insertNodes(root, items, 2);
    }

    private void insertNodes(StringNode parent, String[] items, int index) {
        if (parent != null && index < items.length) {
            StringNode node = new StringNode(items[index]);
            if (index % 2 == 1)
                parent.setLeftChild(node);
            else
                parent.setRightChild(node);
            insertNodes(node, items, 2 * index + 1);
            insertNodes(node, items, 2 * index + 2);
        }
    }

    public double traverse(StringNode node) {
        if (node == null)
            throw new IllegalStateException("Trying to access null node, illegal");
        if (node.isLeaf())
            return Double.parseDouble(node.getItem());
        double valueLeft = traverse(node.getLeftChild());
        double valueRight = traverse(node.getRightChild());

        // Get the Operator
        switch (node.getItem()) {
            case "+":
                return valueLeft + valueRight;
            case "-":
                return valueLeft - valueRight;
            case "*":
                return valueLeft * valueRight;
            case "/":
                return valueLeft / valueRight;
            case "pow":
                return Math.pow(valueLeft, valueRight);
            default:
                throw new InvalidParameterException();
        }
    }

    public double evaluate() {
        return traverse(this.root);
    }
}
