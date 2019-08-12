package Se4As4;

public class Recursive {
	public static void main(String[] args) {
		int[] arr = { 4, -2, 16, 8, -32, 64, -8, -4, -16, 2 };
		recursiveCall(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void recursiveCall(int[] array, int n) {
		
		int c = array.length - n;
		int min = Integer.MAX_VALUE;
		int pos = -1;
		for (int i = 0; i < n; i++) {
			if (array[c + i] <= min) {
				min = array[c + i];
				pos = c + i;
			}
		}
		if (pos < 0)
			return;
		else {
			int tmp = array[c];
			array[c] = array[pos];
			array[pos] = tmp;
			recursiveCall(array, n - 1);

		}
	}
}