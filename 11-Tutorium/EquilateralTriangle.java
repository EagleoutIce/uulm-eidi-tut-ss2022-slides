public class EquilateralTriangle extends RegularPolygon {
   public EquilateralTriangle(double sideLength) {
      super(3, sideLength);
   }

   @Override
   public double getArea() {
      return 0.25 * Math.sqrt(2) * sideLength * sideLength;
   }
}
