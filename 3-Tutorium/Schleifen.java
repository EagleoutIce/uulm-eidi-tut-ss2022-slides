public class Schleifen {
   public static void main(String[] args) {
      // 2a)
      int n = Integer.parseInt(args[0]);
      // 2b)
      for (int i = n; i >= 1; i--) {
         System.out.println(i);
      }
      // ein wenig Freiraum
      System.out.println();
      // 2c)
      if (n >= 1) { // Schließlich läuft do-while ja immer mindestens ein mal
         int j = 1;
         do {
            if (j % 2 == 1)
               System.out.println(j);
            j = j + 1;
         } while (j <= n);
      }
   }
}
