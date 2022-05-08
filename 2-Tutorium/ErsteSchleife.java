public class ErsteSchleife {
   public static void main(String[] args) {
      if(args.length < 1) {
         System.err.println("Needing an 'N'");
         System.exit(1);
      }

      int n = Integer.parseInt(args[0]);
      for (int i = 1; i <= n; i += 3) {
         System.out.print(i + " ");
      }
   }
}
