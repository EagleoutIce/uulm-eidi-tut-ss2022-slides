class Element {
   private int value;
   private Element next;
   private Element previous;

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

   public void setPreviousElement(Element previousElement) {
       this.previous = previousElement;
   }

   public Element getPreviousElement() {
       return this.previous;
   }

   public void setValue(int value) {
       this.value = value;
   }

   public int getValue() {
       return this.value;
   }
}
