public class HeadTail {
   public static int f(int x) {
      if(x < 2) return 1;
      else return f(x - 1) * x;
   }

   public static int f(int x, int acc) {
      if(x < 2) return acc;
      else return f(x - 1, acc * x);
   }

   public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
         System.out.println(i + ": " + f(i));
         System.out.println(i + ": " + f(i, 1));
      }
   }
}