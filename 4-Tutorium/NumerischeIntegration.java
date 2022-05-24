public class NumerischeIntegration {
   public static double berechneF(double x) {
      return Math.exp(-(x * x));
   }

   public static double berechneTrapezFlaeche(double x1, double x2) {
      if (x2 < x1) // hier liese sich auch noch prüfen ob 0 <= x_1, x_2 <= 1
         return 0;
      else
         return (x2 - x1) * ((berechneF(x1) + berechneF(x2)) / 2.0);
   }

   public static double trapezVerfahren(int n) {
      if (n < 1) {
         System.err.printf("Eingabe für n ungültig: %d\n", n);
         return -1.0;
      }
      double schrittweite = 1.0 / n;
      double x = 0.0;
      double A = 0.0;
      while (x <= 1.0 - schrittweite) {
         A = A + berechneTrapezFlaeche(x, x + schrittweite);
         x = x + schrittweite;
      }
      return A;
   }

   public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      double A = trapezVerfahren(n);
      System.err.printf("Die Approximation beträgt %.4f\n", A);
   }
}
