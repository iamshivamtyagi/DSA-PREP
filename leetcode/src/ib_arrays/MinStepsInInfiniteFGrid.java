package ib_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MinStepsInInfiniteFGrid {

	/*
	 * Min Steps in Infinite Grid
	 * 
	 * Asked in: Directi
	 * 
	 * You are in an infinite 2D grid where you can move in any of the 8 directions
	 * 
	 * (x,y) to (x+1, y), (x - 1, y), (x, y+1), (x, y-1), (x-1, y-1), (x+1,y+1),
	 * (x-1,y+1), (x+1,y-1)
	 * 
	 * You are given a sequence of points and the order in which you need to cover
	 * the points.
	 * 
	 * Give the minimum number of steps in which you can achieve it. You start from
	 * the first point.
	 * 
	 * NOTE: This question is intentionally left slightly vague. Clarify the
	 * question by trying out a few cases in the “See Expected Output” section.
	 * 
	 * 
	 * Input Format Given two integer arrays A and B, where A[i] is x coordinate and
	 * B[i] is y coordinate of ith point respectively.
	 * 
	 *
	 * Output Format Return an Integer, i.e minimum number of steps.
	 * 
	 * 
	 * Example Input 1:
	 * 
	 * A = [0, 1, 1] B = [0, 1, 2]
	 * 
	 * 
	 * Example Output 1:
	 * 
	 * 2
	 * 
	 * 
	 * Example Explanation 1:
	 * 
	 * Given three points are: (0, 0), (1, 1) and (1, 2). It takes 1 step to move
	 * from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
	 * 
	 */

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		System.out.println(minStepsInInfiniteFGrid(a, b));
	}

	// this problem is based on Manhattan Distance Algorithm

	/*
	 * Manhattan Distance direct formula to find steps between point (x,y) & (x1,y1)
	 * is :
	 *
	 * Minimum No. of steps = max( absolute(x1 - x) , absolute(y1-y) )
	 */

	public static int minStepsInInfiniteFGrid(ArrayList<Integer> A, ArrayList<Integer> B) {

		int dist = 0;

		for (int i = 1; i < A.size(); ++i) {
			dist += Math.max(Math.abs(A.get(i) - A.get(i - 1)), Math.abs(B.get(i) - B.get(i - 1)));
		}

		return dist;
	}
}
