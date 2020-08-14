package graph;

import java.util.LinkedList;
import java.util.Queue;

public class CountConnectedComponent {
	public static void main(String[] args) {
		int[][] b = new int[][] { { 0, 1, 1, 0, 0, 0, 0 }, { 1, 0, 0, 1, 0, 0, 0 }, { 1, 0, 0, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 0, 1, 1, 0 } };

		System.out.println(countDisconnectGraphs(b, 7));
	}

	private static void traverseConnectedVertices(int[][] arr, int source, boolean[] visited) {

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(source);
		visited[source] = true;

		while (!queue.isEmpty()) {
			int u = queue.poll();

			for (int v = 0; v < arr[u].length; v++) {
				if (arr[u][v] == 1 && !visited[v]) {
					visited[v] = true;
					queue.add(v);
				}
			}
		}

	}

	private static int countDisconnectGraphs(int[][] arr, int vertices) {

		boolean[] visited = new boolean[vertices + 1];
		int count = 0;

		for (int i = 0; i < vertices; i++) {
			if (visited[i] == false) {
				traverseConnectedVertices(arr, i, visited);
				count++;
			}
		}
		return count;
	}
}
