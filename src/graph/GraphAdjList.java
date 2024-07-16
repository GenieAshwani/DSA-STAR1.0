package graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjList {
    public static void main(String[] args) {

        int V = 5;
        List<List<Integer>> adjList = new ArrayList<>();

        // Initialize the adjacency list for each vertex
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // A<-->B, A<-->C, A<-->D
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 0, 3);

        // B<-->E
        addEdge(adjList, 1, 4);

        // C<-->D
        addEdge(adjList, 2, 3);

        // D<-->E
        addEdge(adjList, 3, 4);

        displayGraph(adjList);
    }

    public static void addEdge(List<List<Integer>> adjList, int i, int j) {
        adjList.get(i).add(j);
        adjList.get(j).add(i);
    }

    public static void displayGraph(List<List<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + i + ":");
            for (int j : adjList.get(i)) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
