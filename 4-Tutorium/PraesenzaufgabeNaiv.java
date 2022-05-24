public class Praesenzaufgabe {
   public static void flipInPlace(char[] flipBuchstaben) {
       for(int i = 0; i < flipBuchstaben.length; i++) {
           if (flipBuchstaben[i] >= 65 && flipBuchstaben[i] <= 90) {
               flipBuchstaben[i] += 32;
           } else if (flipBuchstaben[i] >= 97 && flipBuchstaben[i] <= 122) {
               flipBuchstaben[i] -= 32;
           }
       }
   }

   public static char[] flipInCopy(char[] flipBuchstaben) {
       char[] arrayKopie = flipBuchstaben.clone();
       for(int i = 0; i < arrayKopie.length; i++) {
           if (arrayKopie[i] >= 65 && arrayKopie[i] <= 90) {
               arrayKopie[i] += 32;
           } else if (arrayKopie[i] >= 97 && arrayKopie[i] <= 122) {
               arrayKopie[i] -= 32;
           }
       }
       return arrayKopie;
   }

   public static void main(String[] args) {
       String s = "DieSeR SatZ HaT EinE merKwüRdige Groß- und KleinschreibunG.";
       System.out.println(s);

       char[] flipBuchstaben = s.toCharArray();

       String inCopy = String.valueOf(flipInCopy(flipBuchstaben));
       System.out.println(inCopy);

       flipInPlace(flipBuchstaben);
       String inPlace = String.valueOf(flipBuchstaben);
       System.out.println(inPlace);
   }
}
