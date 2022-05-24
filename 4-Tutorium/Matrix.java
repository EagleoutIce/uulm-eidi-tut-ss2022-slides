public class Matrix {
   public static double berechneBetragssumme(double[] arr) {
      if (arr == null || arr.length == 0) {
         System.out.println("Eingabe ungültig!");
         return -1.0;
      }
      double norm = 0;
      for (double element : arr) {
         norm = norm + Math.abs(element);
      }
      return norm;
   }

   public static double berechneZeilensummennorm(double[][] mat) {
      if (mat == null || mat.length == 0) {
         System.out.println("Eingabe ungültig!");
         return -1.0;
      }
      double max = Double.MIN_VALUE;
      double norm;
      for (double[] array : mat) {
         norm = berechneBetragssumme(array);
         if (norm == -1.0) // Fehler in Unteralgorithmus?
            return -1.0;
         if (norm > max)
            max = norm;
      }
      return max;
   }

   public static void main(String[] args) {
      double[][] matrix = { { 1.5, -2.8, 1.8 }, { -5.8, 1.8, 6.1 }, { -2.6, -4.5, 1.24 } };
      double zsm = berechneZeilensummennorm(matrix);
      System.out.printf("Die Zeilensummennorm beträgt %.2f\n", zsm);
   }
}
