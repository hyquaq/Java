import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrix {
    private int[][] adj;
    private final int NUMBER_OF_VERTICES;

    public AdjacencyMatrix(int vertices) {
        NUMBER_OF_VERTICES = vertices;
        adj = new int[NUMBER_OF_VERTICES][NUMBER_OF_VERTICES];
    }

    public void setEgde(int vertexSource, int vertexDestination,
            int weight) {
        try {
            adj[vertexSource][vertexDestination] = weight;
            adj[vertexDestination][vertexSource] = weight;
        } catch (ArrayIndexOutOfBoundsException indexBounce) {
            System.out.println("The vertex is invalid");
        }
    }

    public int getEgde(int vertexSource, int vertexDestination) {
        try {
            return adj[vertexSource][vertexDestination];
        } catch (ArrayIndexOutOfBoundsException indexBounce) {
            System.out.println("The vertex is invalid");
        }
        return -1;
    }

    public void printGraph() {
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getVertices() {
        return NUMBER_OF_VERTICES;
    }

    public int getEdges() {
        int edges = 0;
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = i; j < NUMBER_OF_VERTICES; j++) {
                if (adj[i][j] == 1) {
                    edges += 1;
                }
            }
        }
        return edges;
    }

    public int[] neighborsOfVertex(int u) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            if (adj[u][i] == 1) {
                list.add(i);
            }
        }

        int neighbors[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            neighbors[i] = list.get(i);
        }
        return neighbors;
    }
}
