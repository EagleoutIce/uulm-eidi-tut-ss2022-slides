import java.util.NoSuchElementException;

public class BinaryTreeMain {
    public static void main(String[] args) {
        int[] elements = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        BinaryTree tree = new BinaryTree(elements);

        tree.breadthFirstTraversal();
    }
}
