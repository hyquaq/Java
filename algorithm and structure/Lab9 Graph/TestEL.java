import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestEL {
    public static EdgeList readAMfromFile(String filePath) throws FileNotFoundException {
        EdgeList graph = new EdgeList();
        File f = new File(filePath);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            int w = sc.nextInt();
            int s = sc.nextInt();
            int d = sc.nextInt();
            graph.addEdge(w, s, d);
        }

        sc.close();
        return graph;
    }

    public static void main(String[] args) throws FileNotFoundException {
        EdgeList matrix = readAMfromFile("EL.txt");
        e.printGraph();

        // ex1a
        matrix.printGraph();

        // ex1b
        int countOfVertices = matrix.getVertices();
        System.out.println("Count the number of vertices " + countOfVertices);

        // ex1c
        int countOfEdges = matrix.getEdges();
        System.out.println("Count the number of edges " + countOfEdges);

        // ex1d
        int u = 1;
        int[] neighbors = matrix.neighborsOfVertex(u);
        System.out.print("neighbors: " + u);
        for (int i = 0; i < neighbors.length; i++) {
            System.out.print("->" + neighbors[i]);
        }
        System.out.println("");

        // ex1e
        u = 1;
        int v = 4;
        int weight = matrix.getEgde(u, v);
        if (weight != 0) {

            System.out.println(String.format("has edge %d - %d", u, v));
        } else {

            System.out.println(String.format("hasn't edge %d - %d", u, v));
        }
    }
}
