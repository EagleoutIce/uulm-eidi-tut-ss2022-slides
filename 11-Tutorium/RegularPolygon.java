public abstract class RegularPolygon {
   protected final int numSides;
   protected final double sideLength;

   public RegularPolygon(int numSides, double sideLength) {
      this.numSides = numSides;
      this.sideLength = sideLength;
   }

   public int getNumSides() {
      return numSides;
   }

   public double getCircumference() {
      return numSides * sideLength;
   }

   public abstract double getArea();
}