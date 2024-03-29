public class Queue {
   private Element first;
   private Element last;
   private int length;

   public Queue() {
      this.first = null;
      this.last = null;
      this.length = 0;
   }

   public void enqueue(int value) {
      Element newElement = new Element(value);

      if (length == 0)
         this.first = newElement;
      else
         this.last.setNextElement(newElement);

      this.last = newElement;
      length++;
   }

   public boolean dequeue() {
      if (length > 0) {
         this.first = this.first.getNextElement();
         length--;
         return true;
      }
      return false;
   }

   public int getLength() {
      return this.length;
   }

   public Integer getFirst() {
      if (length > 0)
         return first.getValue();
      return null;
   }

   public Integer getLast() {
      if (length > 0)
         return last.getValue();
      return null;
   }

   public String toString() {
      String s = "[";
      if (length > 0) {
         Element next = this.first;
         while (next.getNextElement() != null) {
            s += next.getValue() + ", ";
            next = next.getNextElement();
         }
         s += next.getValue();
      }
      s += "]";
      return s;
   }

   public static void main(String[] args) {
      Queue queue = new Queue();
      queue.enqueue(3);
      queue.enqueue(1);
      queue.enqueue(7);
      queue.enqueue(5);
      queue.enqueue(9);

      System.out.println("Die Queue: " + queue.toString() + " hat eine Länge von " + queue.getLength());
      if (queue.dequeue())
         System.out.println("Das erste Element wurde entfernt");
      else
         System.out.println("Entfernen des ersten Elements war nicht möglich");

      if (queue.getFirst() != null)
         System.out.println("Das neue erste Element ist: " + queue.getFirst());

      if (queue.getLast() != null)
         System.out.println("Das letzte Element ist immer noch: " + queue.getLast());

      queue.dequeue();
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();

      queue.enqueue(6);

      System.out.println("Die Queue: " + queue.toString() + " hat eine Länge von " + queue.getLength());
      if (queue.getFirst() != null)
         System.out.println("Das letzte Element ist immer noch: " + queue.getLast());
      if (queue.getLast() != null)
         System.out.println("Das letzte Element ist immer noch: " + queue.getLast());

   }
}
