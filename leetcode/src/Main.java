public class Main {

	public static void main(String[] args) {
//		System.out.println(new ReverseNumber().reverse(9987));
//		char[] a = new char[] { 'a', 'b', 'c', 'd', 'e' };
//		new ReverseString().reverseString(a);
//		display(a);
//		int[] b = new int[]{1,2,3,4,5,6,7};
//		int ans[] = new TwoSum().twoSum(b,7);
//		display(ans);
		System.out.println(new ReverseVowelOfaString().reverseVowels("Hello"));

	}

	public static void display(int[] z) {
		for (int i : z)
			System.out.print(i + " ");
		System.out.println();
	}
}
