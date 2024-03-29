public class BinarySearchRecursive {
   public static int binSearchRec(int[] arr, int key, int left, int right) {
      if (left > right) {
         System.out.println("Wert konnte nicht gefunden werden!");
         return -1;
      }
      int mid = (left + right) / 2;
      if (arr[mid] == key) {
         return mid;
      } else if (arr[mid] > key) {
         return binSearchRec(arr, key, left, mid - 1);
      } else {
         return binSearchRec(arr, key, mid + 1, right);
      }
   }

   public static void main(String[] ars) {
      int[] arr = { 1, 2, 4, 8, 16, 32, 64, 128, 256 };
      for(int i : arr) {
         System.out.printf("Position des gesuchten Werts: %d=>%d %n", i, binSearchRec(arr, i, 0, arr.length - 1));
      }
      System.out.printf("Position des gesuchten Werts: %d=>%d %n", 12, binSearchRec(arr, 12, 0, arr.length - 1));
   }
}
