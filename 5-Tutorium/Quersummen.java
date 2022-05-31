public class Quersummen {

   public static int quersumme(int zahl){
        if(zahl < 0){
            System.out.println("Eingabe ungültig! Zahl muss positiv sein.");
            return 0;
        }
        int qs = 0;
        while(zahl > 0){
            qs = qs + (zahl % 10);
            zahl = zahl / 10;
        }
        return qs;
   }

   public static int quersummeVonQuersummen(boolean berechne_summe_qs, int... zahlen){
       int summe_qs = 0;
       for(int zahl : zahlen){
           summe_qs = summe_qs + quersumme(zahl);
       }
       if(berechne_summe_qs){
           return quersumme(summe_qs);
       } else {
           return summe_qs;
       }

   }

   public static void main(String[] args){
       System.out.println(quersummeVonQuersummen(true, 123, 92, 57, 30));
       System.out.println(quersummeVonQuersummen(false, 12, 9, 4));
   }

}
