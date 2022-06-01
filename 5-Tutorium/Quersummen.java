public class Quersummen {

    public static int quersumme(int zahl) {
        if (zahl < 0) {
            System.out.println("Eingabe ungültig! Zahl muss positiv sein.");
            return 0;
        }
        int quersumme = 0;
        while (zahl > 0) {
            quersumme += (zahl % 10);
            zahl = zahl / 10;
        }
        return quersumme;
    }

   public static int quersummeVonQuersummen(boolean berechneSummeQs, int... zahlen){
        int quersummenSumme = 0;
        for(int zahl : zahlen)
            quersummenSumme += quersumme(zahl);

        return berechneSummeQs ? quersumme(quersummenSumme) : quersummenSumme;
   }

    public static void main(String[] args) {
        System.out.println(quersummeVonQuersummen(true, 123, 92, 57, 30));
        System.out.println(quersummeVonQuersummen(false, 12, 9, 4));
    }

}
