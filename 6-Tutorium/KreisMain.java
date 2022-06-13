public class KreisMain {
   public static void main(String[] args) {
       double r = Double.parseDouble(args[0]);
       Kreis kreis = new Kreis(r);
       kreis.printAttribute();
   }
}
