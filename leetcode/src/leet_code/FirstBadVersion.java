package leet_code;

import java.util.Scanner;

class VersionControl {

	int n;
	int pos;

	public VersionControl(int n, int pos) {
		this.n = n;
		this.pos = pos;
	}

	protected boolean isBadVersion(int i) {
		if (i < pos)
			return false;
		else
			return true;
	}
}

public class FirstBadVersion extends VersionControl {

	/*
	 * Problem Id : 278 (Easy)
	 * 
	 * You are a product manager and currently leading a team to develop a new
	 * product. Unfortunately, the latest version of your product fails the quality
	 * check. Since each version is developed based on the previous version, all the
	 * versions after a bad version are also bad.
	 * 
	 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
	 * bad one, which causes all the following ones to be bad.
	 * 
	 * You are given an API bool isBadVersion(version) which will return whether
	 * version is bad. Implement a function to find the first bad version. You
	 * should minimize the number of calls to the API.
	 * 
	 * Example:
	 * 
	 * Given n = 5, and version = 4 is the first bad version.
	 * 
	 * call isBadVersion(3) -> false
	 * 
	 * call isBadVersion(5) -> true
	 * 
	 * call isBadVersion(4) -> true
	 * 
	 * Then 4 is the first bad version.
	 *
	 */

	/*
	 * The isBadVersion API is defined in the parent class VersionControl. boolean
	 * isBadVersion(int version);
	 */
	public FirstBadVersion(int n, int pos) {
		super(n, pos);
	}

	public int firstBadVersion(int n) {
		int l = 1;
		int r = n;
		while (l < r) {
			int mid = l + (r - l) / 2;

			if (isBadVersion(mid) == false && isBadVersion(mid + 1) == true) {
				return mid + 1;
			} else if (isBadVersion(mid) == true && isBadVersion(mid - 1) == false) {
				return mid;
			} else if (isBadVersion(mid) == true) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int pos = s.nextInt();

		FirstBadVersion fbv = new FirstBadVersion(n, pos);

		System.out.println(fbv.firstBadVersion(n));

		s.close();
	}
}