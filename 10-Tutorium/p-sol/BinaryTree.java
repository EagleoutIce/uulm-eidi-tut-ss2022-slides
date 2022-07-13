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

            // left child node
            insertNodes(node, items, 2 * index + 1);
            // right child node
            insertNodes(node, items, 2 * index + 2);

        }
    }

    public void alternativeBreadthFirstTraversal() {
        Queue queue = new Queue();
        queue.enqueue(root);

        System.out.print("[");
        while (!queue.isEmpty()) {
            IntegerNode node = queue.dequeue();

            if (node.getLeftChild() != null)
                queue.enqueue(node.getLeftChild());

            if (node.getRightChild() != null)
                queue.enqueue(node.getRightChild());

            System.out.print(node.getValue() + (!queue.isEmpty() ? ", " : ""));
        }
        System.out.println("]");
    }

    public void breadthFirstTraversal() {
        Queue queue = new Queue();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            IntegerNode node = queue.dequeue();
            if (node == null)
                continue;
            queue.enqueue(node.getLeftChild());
            queue.enqueue(node.getRightChild());
            System.out.println(node.getValue());
        }
    }
}
