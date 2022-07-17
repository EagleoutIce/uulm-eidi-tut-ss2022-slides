class Element {
   private int value;
   private Element next;

   public Element() {
       this.next = null;
       this.previous = null;
   }

   public void setNextElement(Element nextElement) {
       this.next = nextElement;
   }

   public Element getNextElement() {
       return this.next;
   }

   public void setValue(int value) {
       this.value = value;
   }

   public int getValue() {
       return this.value;
   }
}
