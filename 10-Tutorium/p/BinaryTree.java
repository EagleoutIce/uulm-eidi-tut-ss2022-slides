import java.util.NoSuchElementException;

public class BinaryTree {
    private IntegerNode root;

    public BinaryTree(int[] items) {
        if (items.length == 0)
            throw new NoSuchElementException();

        root = new IntegerNode(items[0]);
        insertNodes(root, items, 1);
        insertNodes(root, items, 2);
    }

    private void insertNodes(IntegerNode parent, int[] items, int index) {
        if (index < items.length) {
            IntegerNode node = new IntegerNode(items[index]);
            if (index % 2 == 1)
                parent.setLeftChild(node);
            else
                parent.setRightChild(node);
            insertNodes(node, items, 2 * index + 1);
            insertNodes(node, items, 2 * index + 2);
        }
    }

    public void breadthFirstTraversal() {
        // TODO
    }

}
