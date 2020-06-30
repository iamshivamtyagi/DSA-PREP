package leet_code;

public class SortArrayByParity {

	/*
	 * Problem ID : 905 (Easy)
	 * 
	 * Given an array A of non-negative integers, return an array consisting of all
	 * the even elements of A, followed by all the odd elements of A.
	 * 
	 * You may return any answer array that satisfies this condition.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: [3,1,2,4] Output: [2,4,3,1]
	 * 
	 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	 */

	public static void main(String[] args) {

		int[] a = new int[] { 2, 1, 4, 3 };

		sortArrayByParity(a);

		for (int i : a)
			System.out.print(i + " ");
		System.out.println();

	}

	public static int[] sortArrayByParity(int[] a) {

		int size = a.length;

		/*
		 * slow pointer : keeps track of current element
		 * 
		 * fast pointer : keeps track of upcoming/next element
		 */
		int slow = 0;
		int fast = slow + 1;

		// traverse the array
		while (slow < size && fast < size) {

			/*
			 * There are 2 cases with each having 2 subcases :
			 * 
			 * CASE I : current (slow pointer) element is even
			 *
			 * SUB-CASE i : upcoming (fast pointer) element is also even :
			 * 
			 * (a) Update the current/slow pointer to next of the fast pointer.
			 * 
			 * (b) Upadte the upcomming/fast pointer to next of the updated slow pointer
			 * 
			 * SUB-CASE ii : fast pointer element is odd :
			 * 
			 * (a) Just move both pointer by 1
			 *
			 * ----------------------------------------------------------------------------
			 * 
			 * CASE II : current (slow pointer) element is odd
			 *
			 * SUB-CASE i : upcoming (fast pointer) element is even :
			 * 
			 * (a) Swap element of slow & fast pointer.
			 * 
			 * (b) Move both pointer by 1.
			 * 
			 * SUB-CASE ii : fast pointer element is odd :
			 * 
			 * (a) Move fast pointer by 1.
			 *
			 */
			if (a[slow] % 2 == 0) {
				if (a[fast] % 2 == 0) {
					slow = fast + 1;
					fast = slow + 1;
				} else {
					++slow;
					++fast;
				}
			} else {
				if (a[fast] % 2 == 0) {
					swap(a, slow, fast);
					slow++;
					fast++;
				} else {
					fast++;
				}
			}
		}

		return a;

	}

	private static void swap(int[] a, int slow, int fast) {
		int temp = a[slow];
		a[slow] = a[fast];
		a[fast] = temp;
	}

}
