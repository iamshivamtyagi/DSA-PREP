package other;

public class PascalsTriangle {

	public static void main(String[] args) {
		pascalsTriangle(5);
	}

	public static void pascalsTriangle(int n) {

		for (int row = 0; row <= n; row++) {
			
			for(int i = 0 ; i < n - row  ; i++)
				System.out.print("  ");
			
			for (int col = 0; col <= row; col++) {
				int c = combination(row, col);
				System.out.print(c + "   ");
			}
			System.out.println();
		}
	}

	private static int combination(int row, int col) {
		int n = factorial(row);
		int k = factorial(col);
		int diff = factorial(row - col);

		return n / (k * diff);
	}

	private static int factorial(int row) {
		if (row == 0 || row == 1)
			return 1;

		int fact = 1;

		for (int i = 2; i <= row; i++)
			fact = fact * i;

		return fact;
	}

}
