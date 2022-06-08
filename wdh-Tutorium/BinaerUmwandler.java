public class BinaerUmwandler {
   private String binary;
   private long decimal;

   public String getBinary() {
      return this.binary;
   }

   public void setBinary(String binary) {
      this.binary = binary;
      this.decimal = binZuDez(binary);
   }

   public long getDecimal() {
      return this.decimal;
   }

   public void setDecimal(long decimal) {
      this.decimal = decimal;
   }

   public BinaerUmwandler(String binary) {
      setBinary(binary);
   }

   public BinaerUmwandler() {
      this.binary = null;
      this.decimal = 0L;
   }

   public static long binZuDez(String binary) {
      try {
         int n = binary.length();
         long d = 0;
         for (int i = 1; i <= n; i++) {
            int bi = binary.charAt(i - 1) == '1' ? 1 : 0;
            d += bi * Math.pow(2, n - i);
         }
         return d;
      } catch(NullPointerException ex) {
         ex.printStackTrace();
         return -1;
      }
   }
}
