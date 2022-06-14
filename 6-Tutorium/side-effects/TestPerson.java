class TestPerson {
   public static void main(String[] args) {
     Person p = new Person("Heinz", 11, 22);
     String n1 = p.getName();
     ValuePair xy1 = p.getValuePair();
     System.out.println(n1 + " " + xy1.x + " " + xy1.y);
     n1 = "Hugo";
     String n2 = p.getName();
     xy1.x = 33;
     xy1.y = 44;
     ValuePair xy2 = p.getValuePair();
     System.out.println(n1 + " " + xy1.x + " " + xy1.y);
   }
 }