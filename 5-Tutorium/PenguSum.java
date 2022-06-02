public class PenguSum {
   static long sum(Penguin[] ps) {
      long sum = 0;
      for (int i = 0; i < ps.length; i++)
         sum += ps[i].getAge();
      return sum;
   }

   public static void main(String[] args) {
      Penguin[] pengus = {
         new Penguin("Hugo", 3),
         new Penguin("Sophie", 7)
      };
      System.out.println(pengus[0]);
      System.out.println(sum(pengus));
   }
}
