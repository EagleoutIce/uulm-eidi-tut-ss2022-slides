public class Quersumme {
   public static void main(String[] args) {
      int zahl = Integer.parseInt(args[0]);

      if (zahl < 0) {
         System.out.println("Eingabe ungültig!");
         return;
      }

      int quersumme = 0;
      int divRest;
      while (zahl > 0) {
         divRest = zahl % 10;
         quersumme = quersumme + divRest;
         zahl = zahl / 10;
      }
      System.out.println(quersumme);
   }
}
