package graph;

import java.util.*;

public class ShortestPathInUnweightedGraph {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] Ba = new int[][] { { 0, 1, 1, 0 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, { 0, 1, 1, 0 } };
		
		int V = s.nextInt();

		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>(V);

		for (int i = 0; i < V; i++) {
			a.add(new ArrayList<Integer>());
			for (int j = 0; j < V; ++j) {
				a.get(i).add(j)
			}
		}

		display(shortestDistance(a, 1, 4));
	}

	public static void display(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int[] shortestDistance(int[][] a, int source, int vertices) {

		int[] distance = new int[vertices];
		Arrays.fill(distance, -1);
		distance[source] = 0;

		// BFS
		boolean visited[] = new boolean[vertices + 1];
		visited[source] = true;

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(source);

		while (!q.isEmpty()) {

			int u = q.poll();

			for (int v = 0; v < a[u].length; ++v) {
				if (a[v][u] == 1 && !visited[v]) {
					q.add(v);
					visited[v] = true;
					// update distance for unvisited node
					distance[v] = distance[u] + 1;
				}
			}
		}
		return distance;
	}

}
