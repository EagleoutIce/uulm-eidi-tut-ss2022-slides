public class PositiveEintraegeForeach {
   public static int anzahlPositive(double[][] matrix) {
      if (matrix == null || matrix.length == 0) {
         System.out.println("Matrix ungültig!");
         return -1;
      }
      int anzahl = 0;
      for (double[] array : matrix) {
         for (double element : array) {
            if (element > 0)
               anzahl = anzahl + 1;
         }
      }
      return anzahl;
   }

   public static void main(String[] args) {
      double[][] mat = { { -1.0, 2.0, 3.0 },
            { 1.0, -2.0, 3.0 },
            { 1.0, -2.0, 3.0 } };
      int anzahl = anzahlPositive(mat);
      System.out.printf("Die Matrix beinhaltet %d positive Einträge \n", anzahl);
   }
}
