package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSort {

	public static void main(String[] args) {

	}

	static void topologicalSort(ArrayList<ArrayList<Integer>> a, int vertices) {
		int[] indegree = calcIndegree(a);

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 0; i < indegree.length; ++i) {
			if (indegree[i] == 0) {
				q.add(i);
			}
		}

		while (q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");

			for (int v = 0; v < a.get(u).size(); ++v) {
				if (a.get(u).get(v) == 0) {
					indegree[v] -= 1;
				}
			}
		}

	}

	private static int[] calcIndegree(ArrayList<ArrayList<Integer>> a) {

		int[] indegree = new int[a.size()];

		for (int i = 0; i < a.size(); ++i) {
			for (int j = 0; j < a.get(i).size(); ++j) {
				if (a.get(i).get(j) == 1) {
					indegree[j]++;
				}
			}
		}

		return indegree;
	}

}
