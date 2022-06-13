public class Kreis {
   private double radius;
   private double flaeche;
   private double umfang;

   public Kreis(double radius) {
      setRadius(radius);
   }

   public double getRadius() {
      return this.radius;
   }

   public double getFlaeche() {
      return this.flaeche;
   }

   public double getUmfang() {
      return this.umfang;
   }

   public void setRadius(double r) {
      if (r < 0) {
         System.err.println("Radius ungültig!");
         return;
      }
      this.radius = r;
      this.berechneFlaeche(r);
      this.berechneUmfang(r);
   }

   public void setUmfang(double umfang) {
      this.umfang = umfang;
   }

   public void setFlaeche(double flaeche) {
      this.flaeche = flaeche;
   }

   public void printAttribute() {
      System.out.println("Radius: " + radius + " cm");
      System.out.println("Fläche: " + flaeche + " cm^2");
      System.out.println("Umfang: " + umfang + " cm\n");
   }

   public double berechneFlaeche(double radius) {
      this.flaeche = Math.PI * radius * radius;
      return this.flaeche;
   }

   public double berechneUmfang(double radius) {
      this.umfang = 2 * Math.PI * radius;
      return this.umfang;
   }
}
