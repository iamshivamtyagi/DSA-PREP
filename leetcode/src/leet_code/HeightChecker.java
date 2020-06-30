package leet_code;

public class HeightChecker {

	public static void main(String[] args) {
		System.out.println(heightChecker(new int[] { 1, 1, 4, 2, 1, 3 }));
	}

	public static int heightChecker(int[] heights) {
		int size = heights.length;

		int l = 0;
		int count = 0;

		while (l < size) {
			int minRight = findMin(heights, l + 1, size);
			if (heights[l] > heights[minRight]) {
				swap(heights, l, minRight);
				count++;
			}
			l++;
		}
		return count;
	}

	private static int findMin(int[] a, int l, int size) {
		int min = 0;

		if (l < size)
			min = l;
		else
			min = size - 1;

		for (int i = l + 1; i < size; ++i) {
			if (a[min] > a[i])
				min = i;
		}
		return min;
	}

	private static void swap(int[] a, int l, int r) {
		int t = a[l];
		a[l] = a[r];
		a[r] = t;
	}
}
