import java.util.NoSuchElementException;

public class Stack {
   private Element top;
   private int size;

   public Stack() {
      this.top = null;
      this.size = 0;
   }

   public void push(int value) {
      Element newTop = new Element();
      newTop.setValue(value);
      newTop.setNextElement(this.top);
      this.top = newTop;
      size += 1;
   }

   public int pop() {
      if (size <= 0)
         throw new NoSuchElementException("Stack is empty");
      int value = this.top.getValue();
      this.top = this.top.getNextElement();
      size -= 1;
      return value;
   }

   public static void main(String[] args) {
      Stack stack = new Stack();
      for (int i : new int[] { 3, 2, -2, -3, 1, 5, 7, -7, 8, -8, -5, -1 }) {
         if (i < 0) {
            System.out.format("%d = %d (%d)%n", Math.abs(i), stack.pop(), stack.size);
         } else {
            stack.push(i);
            System.out.format("-> %d (%d)%n", i, stack.size);
         }
      }
      System.out.println(stack.size);
      try {
         stack.pop();
         System.err.println("Illegal State, Stack is empty");
      } catch (NoSuchElementException ex) {
         System.out.println("Expected Exception");
         System.out.println(ex);
      }
   }
}
