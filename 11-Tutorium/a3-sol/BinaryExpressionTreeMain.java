public class BinaryExpressionTreeMain {
    public static void main(String[] args) {
        String[] items = {"*", "+", "-", "pow", "5", "4", "2", "2", "3"};
        BinaryExpressionTree tree = new BinaryExpressionTree(items);

        double result = tree.evaluate();
        System.out.println("Ergebnis: " + result);
    }
}
