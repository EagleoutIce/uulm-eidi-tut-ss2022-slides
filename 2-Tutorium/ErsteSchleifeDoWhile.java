public class ErsteSchleifeDoWhile {
   public static void main(String[] args) {
      if (args.length < 1) {
         System.err.println("Needing an 'N'");
         System.exit(1);
      }

      int n = Integer.parseInt(args[0]);
      int i = 1;
      if (n > 0) {
         do {
            System.out.print(i + " ");
            i += 3;
         } while (i <= n);
      }
   }
}
