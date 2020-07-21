package window_sliding;

public class PrintnBonacciSeries {

	/*
	 * Print first m of n-bonacci series.
	 * 
	 * Input : n = 3 , m = 8
	 * 
	 * Output : 0 0 1 1 2 4 7 13
	 */

	public static void main(String[] args) {
		printnBonacci(3, 8);
	}

	public static void printnBonacci(int n, int m) {
		int[] a = new int[m];

		// n-th & n - 1 element of n-bonacci is always 1
		a[n - 1] = 1;
		a[n] = 1;

		// window Sliding i.e., adding last element's double and removing the first
		// element from window
		for (int i = n + 1; i < m; i++) {
			a[i] = 2 * a[i - 1] - a[i - n - 1];
		}

		for (int i = 0; i < m; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
