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
        EdgeList e = readAMfromFile("EL.txt");
        e.printGraph();

        // dinh
        // System.out.println(e.getEdges());

        // in ra so canh
        System.out.println(e.getEdges());

        // in ra hang xom cu 3
        for (Integer i : e.neighbors(3)) {
            System.out.println(i);
        }

        // check co duong di tu 2 sang 3 k
        System.out.println(e.check(2, 3));
    }
}
