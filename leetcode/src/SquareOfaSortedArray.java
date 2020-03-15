import java.util.Arrays;

public class SquareOfaSortedArray {
	public static int[] sortedSquares(int[] A) {
		int size = A.length;
		int[] ans = new int[size];
		// loop to store square of original array data into answer array
		for (int i = 0; i < size; ++i) {
			ans[i] = A[i] * A[i];
		}
		// sorting answer array
		Arrays.sort(ans);
		return ans;
	}
}