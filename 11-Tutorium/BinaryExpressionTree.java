import java.util.NoSuchElementException;

public class BinaryExpressionTree {
    private StringNode root;

    public BinaryExpressionTree(String[] items) {
        if(items.length < 2)
            throw new NoSuchElementException();

        root = new StringNode(items[0]);
        insertNodes(root, items, 1);
        insertNodes(root, items, 2);
    }

    private void insertNodes(StringNode parent, String[] items, int index) {
        if(index < items.length) {
            StringNode node = new StringNode(items[index]);
            if(index % 2 == 1)
                parent.setLeftChild(node);
            else
                parent.setRightChild(node);
            insertNodes(node, items, 2 * index + 1);
            insertNodes(node, items, 2 * index + 2);
        }
    }

    // Post-Order Traversal
    public double traverse(StringNode node) {
        // TODO
    }

    public double evaluate(){
        return traverse(this.root);
    }
}
