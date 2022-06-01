public class CharRotation {
   private static final int n = 3;

   public static char rotiereCharacter(char c) {
      if (isLowercase(c)) {
         return addCyclicOnBase('a', c);
      } else if (isUppercase(c)) {
         return addCyclicOnBase('A', c);
      } else {
         return c;
      }
   }

   private static char addCyclicOnBase(char base, char c) {
      return (char) (base + Math.floorMod(c - base + n, 26));
   }

   private static boolean isUppercase(char c) {
      return c >= 'A' && c <= 'Z';
   }

   private static boolean isLowercase(char c) {
      return c >= 'a' && c <= 'z';
   }

   public static void rotiereCharacterArray(char[] arr) {
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rotiereCharacter(arr[i]);
      }
   }

   public static void main(String[] args) {
      char[] arr = { 'a', 'Z' };
      rotiereCharacterArray(arr);
      for (char c : arr) {
         System.out.println(c);
      }
   }

}
