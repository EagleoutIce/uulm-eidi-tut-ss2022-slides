public class ErsteSchleifeWhile {
   public static void main(String[] args) {
      if(args.length < 1) {
         System.err.println("Needing an 'N'");
         System.exit(1);
      }

      int n = Integer.parseInt(args[0]);
      int i = 1;
      while(i <= n) {
         System.out.print(i + " ");
         i += 3;
      }
   }
}
