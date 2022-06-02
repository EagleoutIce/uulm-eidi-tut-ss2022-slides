public class CharRotationLoops {
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
      int shiftedBase = c + n;
      while(shiftedBase < base)
         shiftedBase += 26;
      while(shiftedBase > base + 25)
         shiftedBase -= 26;
      return (char) shiftedBase;
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
      System.out.println(arr);
   }

}
