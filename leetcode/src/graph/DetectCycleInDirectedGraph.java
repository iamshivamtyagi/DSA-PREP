package graph;

public class DetectCycleInDirectedGraph {

	public static void main(String[] args) {
		int[][] a = new int[][] { { 0, 1, 0, 0 }, { 0, 0, 0, 1 }, { 0, 1, 0, 1 }, { 0, 0, 0, 0 } };

		System.out.println(detectCycle(a, 4));
	}

	private static boolean detectCycle(int[][] a, int vertices) {
		boolean[] visited = new boolean[vertices];
		boolean[] recursionStack = new boolean[vertices];

		for (int v = 0; v < vertices; ++v) {
			if (!visited[v] && dfsRec(a, v, visited, recursionStack)) {
				return true;
			}
		}
		return false;
	}

	private static boolean dfsRec(int[][] a, int source, boolean[] visited, boolean[] recursionStack) {
		recursionStack[source] = true;
		visited[source] = true;

		int u = source;

		for (int v = 0; v < a[u].length; ++v) {
			if (!visited[v] && a[u][v] == 1 && dfsRec(a, v, visited, recursionStack)) {
				return true;
			} else if (recursionStack[v] == true)
				return true;
		}
		recursionStack[source] = false;
		return false;
	}
}
