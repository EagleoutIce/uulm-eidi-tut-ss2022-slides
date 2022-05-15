public class PositiveEintraege {
   public static int anzahlPositive(double[][] matrix) {
      if (matrix == null || matrix.length == 0) {
         System.out.println("Matrix ungültig!");
         return -1;
      }
      int anzahl = 0;
      for (int row = 0; row < matrix.length; row++) {
         for (int col = 0; col < matrix[row].length; col++) {
            if (matrix[row][col] > 0)
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
