public class ErsteSchleifeModulo {
   public static void main(String[] args) {
      if(args.length < 1) {
         System.err.println("Needing an 'N'");
         System.exit(1);
      }

      int n = Integer.parseInt(args[0]);
      for (int i = 0; i <= n; i++) {
         if(i % 3 == 1)
            System.out.print(i + " ");
      }
   }
}
