# Graph

## 1. What is Graph?

Graph is the data structure that included vertices and edges. In other words, graph is a set of vertices where some pairs of vertices are connected by edges.

![](Figure%201.png)

We have three options to represent a graph:

- Adjacency Matrix
- Adjacency List
- Edge List

## 2. Representations of Graph

### 2.1. Adjacency Matrix (AM)

Adjacency Matrix is a 2D array of size V x V where V is the number of vertices in a graph.

Let the 2D array be 𝑎𝑑𝑗[][], a slot 𝑎𝑑𝑗[𝑖][𝑗] = 1 indicates that there is an edge from vertex 𝑖 to vertex 𝑗, otherwise 𝑎𝑑𝑗[𝑖][𝑗] contains 0.

![](Figure%202.png)

Adjacency matrix for undirected graph is always symmetric.
![](Figure%203.png)

Adjacency Matrix is also used to represent weighted graphs. If 𝑎𝑑𝑗[𝑖][𝑗] = 𝑤, then there is an edge from vertex 𝑖 to vertex 𝑗 with weight 𝑤.

![](Figure%204.png)

You can create an AdjacencyMatrix class and define the code like this

```java
public class AdjacencyMatrix{
    private int[][] adj;
    private final int NUMBER_OF_VERTICES;

    public AdjacencyMatrix(int vertices){
        NUMBER_OF_VERTICES = vertices;
        adj = new int[NUMBER_OF_VERTICES][NUMBER_OF_VERTICES];
    }

    public void setEgde(int vertexSource , int vertexDestination ,
    int weight){
        try {
            adj[vertexSource][vertexDestination] = weight;
            adj[vertexDestination][vertexSource] = weight;
        } catch (ArrayIndexOutOfBoundsException indexBounce){
            System.out.println("The vertex is invalid");
        }
    }

    public int getEgde(int vertexSource , int vertexDestination){
        try{
            return adj[vertexSource][vertexDestination];
        } catch (ArrayIndexOutOfBoundsException indexBounce){
            System.out.println("The vertex is invalid");
        }
        return -1;
    }

    public void printGraph(){
        for(int i = 0; i < NUMBER_OF_VERTICES; i++){
            for(int j = 0;j < NUMBER_OF_VERTICES; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### 2.2. Adjacency List (AL)

![](Figure%205.png)

In Java, there are many collections that you can use to implement Adjacency List like Vector, LinkedList, ArrayList, Map, ... Remember import java.util.\* if you want to use Java collections.

We use LinkedList to implement an AdjacencyList class (this code for the graph without weights. If you want to handle weights, you can use Pair<Integer, Integer> in Java instead of Integer):

```java
import java.util.*;

public class AdjacencyList{
    private int V; // No. of vertices
    private LinkedList <Integer > adj[];
    @SuppressWarnings("unchecked")
    public AdjacencyList(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
        adj[i] = new LinkedList <Integer >();
    }

    public void addEdge(int u, int v)
    {
        adj[u].add(v);
    }

    public void printGraph(){
        for(int i = 0; i < V; i++){
            System.out.print("Vertex " + i + ": ");
            System.out.print("head");
            for(Integer v: adj[i]){
                System.out.print("->" + v);
                }
                System.out.println();
        }
    }
}

```

### 2.3. Edge List (EL)

![](Figure%206.png)

There are many data structures to implement Edge List, this code use Vector and class IntegerTriple, which is defined by user:

```java
class IntegerTriple{
    private Integer weight;
    private Integer source;
    private Integer dest;

    public IntegerTriple(Integer w, Integer s, Integer d){
        weight = w;
        source = s;
        dest = d;
    }

    public Integer getWeight(){
        return weight;
    }

    public Integer getSource(){
        return source;
    }

    public Integer getDest(){
        return dest;
    }

    @Override
    public String toString(){
        return weight + " " + source + " " + dest;
    }
}

```

```java
public class EdgeList{
    private Vector <IntegerTriple > edges;

    public EdgeList(){
        edges = new Vector <IntegerTriple >();
    }

    public void addEdge(int w, int u, int v){
        edges.add(new IntegerTriple(w,u,v));
    }

    public void printGraph(){
        for(int i = 0; i < edges.size(); i++){
            System.out.println(edges.get(i));
        }
    }
}
```

## 3. Graph traversal algorithms

## Excercise

### Exercise 1

A graph is saved to file in AM format: (see the picture below)

- (a) Read the graph from the file and print the AM on the screen.
- (b) Count the number of vertices.
- (c) Count the number of edges.
- (d) Enumerate neighbors of a vertex u.
- (e) Check the existence of edge (u, v).

![](Figure%207.png)
