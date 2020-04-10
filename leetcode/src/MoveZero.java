
public class MoveZero {

	public static void moveZeroes(int[] a) {
		int l = 0;
		int size = a.length;
		int r = l + 1;

		while (l < size && r < size) {
			if (a[l] == 0 && a[r] == 0) {
				r++;
			} else if (a[l] == 0 && a[r] != 0) {
				int temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				++l;
				++r;
			} else {
				++r;
				++l;
			}
		}
	}
}
