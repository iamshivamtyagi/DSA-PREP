package leet_code;

public class ReplaceElementswithGreatestElementonRightSide {

	public static void main(String[] args) {

		int[] arr = new int[] { 17, 18, 5, 4, 6, 1 };

		replaceElementswithGreatestElementonRightSide(arr);

		display(arr);

	}

	private static void display(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void replaceElementswithGreatestElementonRightSide(int[] a) {
		int size = a.length;

		if (size == 0)
			return;

		if (size == 1) {
			a[0] = -1;
			return;
		}

		int currMax = maxInArray(a, 1);

		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				a[i] = -1;
			} else if (a[i] == currMax) {
				currMax = maxInArray(a, i + 1);
				a[i] = currMax;
			} else {
				a[i] = currMax;
			}
		}

	}

	private static int maxInArray(int[] arr, int j) {
		int currMax = Integer.MIN_VALUE;
		while (j < arr.length) {
			if (arr[j] > currMax)
				currMax = arr[j];
			++j;
		}
		return currMax;
	}

}
