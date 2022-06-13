public class KreisMain {
   public static void main(String[] args) {
       double r = Double.parseDouble(args[0]);
       Kreis großerKreis = new Kreis(r);
       großerKreis.printAttribute();
   }
}
