public class Heron {
   public static void main(String[] args) {
      double x = Double.parseDouble(args[0]);
      int k = Integer.parseInt(args[1]);
      if (x <= 0 || k <= 1) {
         System.out.println("Eingaben ungültig!");
         return;
      }
      double y = x;
      double oldY;
      do {
         oldY = y;
         double a = (k - 1) * Math.pow(y, k) + x;
         double b = k * Math.pow(y, k - 1);
         y = a / b;
      } while (Math.abs(oldY - y) > 1E-8);
      System.out.printf("Die %d-te Wurzel von %.3f beträgt %.3f\n", k, x, y);
   }
}
