class JavaAssertions {
   public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      // der Doppelpunkt erlaubt es, im Fehlerfall eine Nachricht anzugeben.
      // Damit folgender Ausdruck ausgewertet wird, muss man java
      // beim Ausführen das Argument -ea für enable assertions übergeben werden
      // alternativ geht auch das längere '-enableassertions':
      // javac JavaAssertions.java
      // java -ea JavaAssertions -5
      assert n > 0 : "Eingabe soll positiv sein!";
   }
}