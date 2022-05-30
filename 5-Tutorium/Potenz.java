public class Potenz {
   private double basis;
   private int exponent;

   public Potenz(final double b, final int e) {
      this.basis = b;
      this.exponent = e;
   }

   public double getBasis() {
      return this.basis;
   }

   public int getExponent() {
      return this.exponent;
   }

   public void setExponent(final int e) {
      this.exponent = e;
   }

   public void setBasis(final double b) {
      this.basis = b;
   }

   public void printAttribute() {
      System.out.printf("Basis: %.3f \n", this.basis);
      System.out.printf("Exponent: %d \n", this.exponent);
   }

}
