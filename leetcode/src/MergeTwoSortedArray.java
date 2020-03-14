public class MergeTwoSortedArray {
	public static void merge(int[] a, int m, int[] b, int n) {
		int l = 0, r = 0, size = a.length;
		while (l != size && r != n) {
			if (a[l] > b[r]) {
				shiftArray(a, l, m + l);
				a[l] = b[r];
				++r;
			}
			++l;
		}
		while (r != n) {
			a[m + r] = b[r];
			++r;
		}
	}

	public static void shiftArray(int[] a, int l, int m) {
		int prev = a[l], cur = 0;
		for (int i = l + 1; i <= m; ++i) {
			cur = a[i];
			a[i] = prev;
			prev = cur;
		}
	}

}