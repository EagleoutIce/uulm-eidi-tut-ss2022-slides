public class Praesenzaufgabe {
    public static void flipInPlace(char[] flipBuchstaben) {
        final int shift = 'a' - 'A'; // der shift ändert sich ja nicht :D
        // Damit kann man ihn auch als Konstante umsetzen
        for (int i = 0; i < flipBuchstaben.length; i++) {
            if ('A' <= flipBuchstaben[i] && flipBuchstaben[i] <= 'Z') {
                flipBuchstaben[i] += shift;
            } else if ('a' <= flipBuchstaben[i] && flipBuchstaben[i] <= 'z') {
                flipBuchstaben[i] -= shift;
            }
        }
    }

    public static char[] flipInCopy(char[] flipBuchstaben) {
        char[] arrayKopie = new char[flipBuchstaben.length];
        for (int i = 0; i < arrayKopie.length; i++)
            arrayKopie[i] = flipBuchstaben[i];
        // Auch: System.arraycopy oder Arrays.copyOf

        flipInCopy(arrayKopie);
        return arrayKopie;
    }

    public static char[] flipInCopyDirect(char[] flipBuchstaben) {
        char[] arrayKopie = new char[flipBuchstaben.length];
        for (int i = 0; i < flipBuchstaben.length; i++) {
            if ('A' <= flipBuchstaben[i] && flipBuchstaben[i] <= 'Z') {
                arrayKopie[i] = flipBuchstaben[i] + shift;
            } else if ('a' <= flipBuchstaben[i] && flipBuchstaben[i] <= 'z') {
                arrayKopie[i] = flipBuchstaben[i] - shift;
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
