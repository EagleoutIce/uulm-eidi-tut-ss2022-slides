public class Referenzvariablen {
	public static void setzeElementVielleicht(int[] array, int idx, int ele) {
		if (array == null || idx >= array.length || ele <= 0) {
			System.out.println("Eingabe ungültig!");
			return;
		}
		array[idx] = ele;
		ele = 4;
		array = null;
	}

	public static void main(String[] args) {
		int ele = 1;
		int idx = ele;
		ele = 2;
		int[] array = new int[3];
		setzeElementVielleicht(array, idx, ele);
		System.out.println(ele);
		System.out.println(idx);
		if (array != null) {
			for (int wert : array) {
				System.out.println(wert);
			}
		} else {
			System.out.println("Array ungültig!");
		}
	}
}
