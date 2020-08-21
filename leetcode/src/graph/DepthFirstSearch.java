package graph;

public class DepthFirstSearch {

	public static void main(String[] args) {
		int[][] a = new int[][] { { 0, 1, 1, 0, 0 }, { 1, 0, 0, 1, 1 }, { 1, 0, 0, 1, 0 }, { 0, 1, 1, 0, 1 },
				{ 0, 1, 0, 1, 0 } };
		int[][] b = new int[][] { { 0, 1, 1, 0, 0, 0, 0 }, { 1, 0, 0, 1, 0, 0, 0 }, { 1, 0, 0, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 0, 1, 1, 0 } };

		int[][] c = new int[][] { { 1, 1, 0 }, { 0, 0, 1 }, { 1, 0, 1, } };

		dfs(a, 5, 0);
		System.out.println();
		dfsDisconnectedGraph(b, 7);
		System.out.println();
		System.out.println(countConnectedComponent(c, 3));
	}

	private static void dfsRecursive(int[][] arr, int source, boolean[] visited) {

		visited[source] = true;

		System.out.print(source + " ");

		for (int v = 0; v < arr[source].length; v++) {
			if (arr[source][v] == 1 && !visited[v]) {
				dfsRecursive(arr, v, visited);
			}
		}
	}

	private static void dfs(int[][] arr, int vertices, int source) {
		boolean visited[] = new boolean[vertices + 1];
		dfsRecursive(arr, 0, visited);
	}

	private static void dfsDisconnectedGraph(int[][] arr, int vertices) {
		boolean[] visited = new boolean[vertices + 1];

		for (int i = 0; i < vertices; ++i) {
			if (!visited[i]) {
				dfsRecursive(arr, i, visited);
			}
		}
	}

	private static void dfsRecursiveCount(int[][] arr, int source, boolean[] visited) {

		visited[source] = true;

		for (int v = 0; v < arr[source].length; v++) {
			if (arr[source][v] == 1 && !visited[v]) {
				dfsRecursiveCount(arr, v, visited);
			}
		}
	}

	// No. of Island
	private static int countConnectedComponent(int[][] a, int vertices) {
		boolean[] visited = new boolean[vertices + 1];
		int count = 0;

		for (int i = 0; i < vertices; i++) {
			if (!visited[i]) {
				count++;
				dfsRecursiveCount(a, i, visited);
			}
		}
		return count;
	}
}
