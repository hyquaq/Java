import java.util.Vector;

public class EdgeList {
    private Vector<IntegerTriple> edges;

    public EdgeList() {
        edges = new Vector<IntegerTriple>();
    }

    public void addEdge(int w, int u, int v) {
        edges.add(new IntegerTriple(w, u, v));
    }

    public void printGraph() {
        for (int i = 0; i < edges.size(); i++) {
            System.out.println(edges.get(i));
        }
    }

    public int getEdges() {
        return edges.size();
    }

    public Vector<Integer> neighbors(int u) {
        Vector<Integer> x = new Vector<>();
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getSource() == u) {
                x.add(edges.get(i).getDest());
            }
            if (edges.get(i).getDest() == u) {
                x.add(edges.get(i).getSource());
            }
        }
        return x;
    }

    public Boolean check(int u, int v) {
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getSource() == u && edges.get(i).getDest() == v) {
                return true;
            }
            if (edges.get(i).getSource() == v && edges.get(i).getDest() == u) {
                return true;
            }
        }
        return false;
    }
}
