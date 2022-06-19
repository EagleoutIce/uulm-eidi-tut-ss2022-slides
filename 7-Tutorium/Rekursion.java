public class Rekursion {
   public static double f(double x) {
      return x * x;
   }

   public static double A(double a, double b) {
      if (b - a <= 0.01)
         return (b - a) * f(a);
      else
         return A(a, (a + b) / 2) + A((a + b) / 2, b);
   }

   public static void main(String[] args) {
      System.out.println("∫[0,1] x^2 = " + A(0, 1));
   }
}
