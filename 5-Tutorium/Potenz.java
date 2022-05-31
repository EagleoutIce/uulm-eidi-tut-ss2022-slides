public class Potenz {
   private double basis;
   private int potenz;

   public Potenz(final double b, final int e) {
      this.basis = b;
      this.potenz = e;
   }

   public double getBasis() {
      return this.basis;
   }

   public int getPotenz() {
      return this.potenz;
   }

   public void setPotenz(final int e) {
      this.potenz = e;
   }

   public void setBasis(final double b) {
      this.basis = b;
   }

   public void printAttribute() {
      System.out.printf("Basis: %.3f%n", this.basis);
      System.out.printf("Potenz: %d%n", this.potenz);
   }
}
