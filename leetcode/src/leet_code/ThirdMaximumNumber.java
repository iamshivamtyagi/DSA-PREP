package leet_code;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		System.out.println(thirdMax(new int[] { 5, 2, 2 }));
	}

	public static int thirdMax(int[] nums) {

		Integer firstMax = null;
		Integer secondMax = null;
		Integer thirdMax = null;

		for (Integer cur : nums) {

			if (cur.equals(firstMax) || cur.equals(secondMax) || cur.equals(thirdMax)) {
				continue;
			}

			if (firstMax == null || firstMax < cur) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = cur;
			} else if (secondMax == null || secondMax < cur) {
				thirdMax = secondMax;
				secondMax = cur;
			} else if (thirdMax == null || thirdMax < cur) {
				thirdMax = cur;
			}
		}

		if (thirdMax == null)
			return firstMax;
		else
			return thirdMax;
	}
}
