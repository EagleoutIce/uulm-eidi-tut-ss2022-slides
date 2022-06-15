class Person {
   private String name;
   private ValuePair v;

   public Person(String name, int x, int y) {
      this.name = name;
      v = new ValuePair(x, y);
   }

   public String getName() {
      return name;
   }

   public ValuePair getValuePair() {
      return new ValuePair(v.x, v.y);
   }
}