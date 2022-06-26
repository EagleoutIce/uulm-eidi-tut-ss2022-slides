public class NaiveSort {
   public static void vertausche(int[] arr, int i, int j) {
      int n = arr.length;
      if (n < 2 || i < 0 || j < 0 || i >= n || j >= n) {
         System.err.println("Eingabe ungültig!");
         return;
      }
      int tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
   }

   public static void sortiere(int[] arr) {
      int n = arr.length;
      if (n < 2) {
         System.err.println("Eingabe ungültig!");
      }
      for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
               vertausche(arr, i, j);
            }
         }
      }
   }

   public static void printArray(int[] arr) {
      for (int i : arr) {
         System.out.println(i);
      }
   }

   public static void main(String[] args) {
      int[] arr = { 5, 8, 1, -1 };
      sortiere(arr);
      printArray(arr);
   }
}
