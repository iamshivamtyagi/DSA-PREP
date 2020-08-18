package graph;

public class DetectCycleInUndirectedGraph {

	public static void main(String[] args) {

		int[][] a = new int[][] { { 0, 1, 1, 0 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, { 0, 1, 1, 0 } };

		System.out.println(detectCycle(a, 4));
	}

	// fxn to create array to keep track of visited node & call modified dfs
	public static boolean detectCycle(int[][] a, int vertices) {
		boolean[] visited = new boolean[vertices + 1];

		for (int i = 0; i < vertices; i++) {
			if (!visited[i]) {
				// for 'i'th node there is no parent so -1 passed as parent
				if (dfsRecursive(a, i, visited, -1) == true) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfsRecursive(int[][] a, int source, boolean[] visited, int parent) {
		// same dfs fxn
		visited[source] = true;

		for (int v = 0; v < a[source].length; ++v) {
			if (!visited[v] && a[source][v] == 1) {

				// recursive call if current node is not visited i.e., going in depth of graph
				if (dfsRecursive(a, v, visited, source) == true)
					return true;
				// base case of recursive fxn
				else if (v != parent) {
					return true;
				}
			}
		}

		return false;
	}
}
