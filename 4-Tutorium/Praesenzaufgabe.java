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
       char[] array_kopie = flipBuchstaben.clone();
       for(int i = 0; i < array_kopie.length; i++) {
           if (array_kopie[i] >= 65 && array_kopie[i] <= 90) {
               array_kopie[i] += 32;
           } else if (array_kopie[i] >= 97 && array_kopie[i] <= 122) {
               array_kopie[i] -= 32;
           }
       }
       return array_kopie;
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
