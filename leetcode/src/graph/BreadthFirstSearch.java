package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		int[][] a = new int[][] { { 0, 1, 1, 0, 0 }, { 1, 0, 1, 1, 0 }, { 1, 1, 0, 1, 1 }, { 0, 1, 1, 0, 1 },
				{ 0, 0, 1, 1, 0 } };
		int[][] b = new int[][] { { 0, 1, 1, 0, 0, 0, 0 }, { 1, 0, 0, 1, 0, 0, 0 }, { 1, 0, 0, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 0, 1, 1, 0 } };

		bfsWithSource(a, 5, 0);
		System.out.println();
		bfsDis(b, 7);
	}

	private static void bfsWithSource(int[][] arr, int vertices, int source) {
		boolean[] visited = new boolean[vertices + 1];

		Queue<Integer> queue = new LinkedList<Integer>();

		visited[source] = true;

		queue.add(source);

		while (!queue.isEmpty()) {
			int u = queue.poll();
			System.out.print(u + " , ");
			for (int v = 0; v < arr[u].length; v++) {
				if (arr[u][v] == 1 && !visited[v]) {
					visited[v] = true;
					queue.add(v);
				}
			}
		}
	}

	private static void bfsWithoutSource(int[][] arr, int source, boolean[] visited) {

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(source);
		visited[source] = true;

		while (!queue.isEmpty()) {
			int u = queue.poll();
			System.out.print(u + " ");

			for (int v = 0; v < arr[u].length; v++) {
				if (arr[u][v] == 1 && !visited[v]) {
					visited[v] = true;
					queue.add(v);
				}
			}
		}

	}

	private static void bfsDis(int[][] arr, int vertices) {

		boolean[] visited = new boolean[vertices + 1];

		for (int i = 0; i < vertices; i++) {
			if (visited[i] == false) {
				bfsWithoutSource(arr, i, visited);
			}
		}
	}

}
