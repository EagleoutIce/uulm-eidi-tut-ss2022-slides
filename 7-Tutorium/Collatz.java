public class Collatz {
   // Zwischen n und der Ausführungszeit existiert kein offensichtlicher Zusammenhang.
   public static int C(int n) {
      if (n == 1)
         return 1;
      else if (n % 2 == 0)
         return C(n / 2);
      else
         return C(3 * n + 1);
   }

   public static void main(String[] args) {
      for (int i = 1; i <= 1_000; i++) {
         long start = System.nanoTime();
         C(i);
         System.out.println("C(" + i + ") = " + (System.nanoTime() - start));
      }
   }
}
