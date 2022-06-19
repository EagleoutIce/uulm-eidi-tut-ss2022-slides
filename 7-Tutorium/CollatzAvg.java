public class CollatzAvg {
   public static int C(int n) {
      if (n == 1)
         return 1;
      else if (n % 2 == 0)
         return C(n / 2);
      else
         return C(3 * n + 1);
   }

   public static void main(String[] args) throws InterruptedException {
      Thread.sleep(1_000);
      for (int i = 1; i <= 1_000; i++) {
         run(i, 1_000); // warmup
         double avg = run(i, 100_000);
         System.out.println("C(" + i + ") = " + avg);
      }
   }

   private static double run(int i, int times) {
      long avg = 0;
      for (int j = 0; j < times; j++) {
         long start = System.nanoTime();
         C(i);
         avg += (System.nanoTime() - start);
      }
      return avg / (double) times;
   }
}