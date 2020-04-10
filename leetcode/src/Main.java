public class Main {

	public static void main(String[] args) {
//		System.out.println(new ReverseNumber().reverse(9987));

//		char[] a = new char[] { 'a', 'b', 'c', 'd', 'e' };
//		new ReverseString().reverseString(a);
//		display(a);

		int[] b = new int[] { 0, 1, 0, 3, 12 };
//		int ans[] = new TwoSum().twoSum(b,7);
//		display(ans);

//		System.out.println(new ReverseVowelOfaString().reverseVowels("Hello"));

//		System.out.println(new PalindromeNumber().isPalindrome(70));

//		int[] a = new int[] { -1, 0, 5, 10 };
//		int[] b = new int[] { 3 };
//		new MergeTwoSortedArray();
//		MergeTwoSortedArray.merge(a, 1, b, 1);
//		display(a);

//		int[] b = SquareOfaSortedArray.sortedSquares(a);
//		display(b);

//		int ans = SingleNumber.singleNumber(new int[] { 4, 1, 2, 1, 2 });
//		System.out.println(ans);

//		System.out.println(HappyNumber.isHappy(19));

//		System.out.println(MaximumSubarray.maximumSubarray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		MoveZero.moveZeroes(b);
		display(b);
	}

	public static void display(int[] z) {
		for (int i : z)
			System.out.print(i + " ");
		System.out.println();
	}
}
