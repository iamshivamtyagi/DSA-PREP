package graph;

import java.util.ArrayList;

public class Graph {

	int V;

	ArrayList<ArrayList<Integer>> adj;

	public Graph(int v) {
		V = v;

		// ArrayList of ArrayList

		adj = new ArrayList<ArrayList<Integer>>(V);

		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<Integer>());
		}
	}

	void addEdge(int u, int v) {
		adj.get(u).add(v);
		// for bidirectional
		adj.get(v).add(u);
	}

	void printGraph() {
		for (int i = 0; i < V; ++i) {
			System.out.print(i + " -> ");

			for (int j : adj.get(i)) {
				System.out.print(j + " , ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(4, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(1, 3);
		

		g.printGraph();

	}

}
