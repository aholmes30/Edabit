package easy;

public class AdjacentNodes {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
        return graph[node1][node2] == 1;
    }
}
