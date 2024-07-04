
public class WeightedGraph {

    public int adjMatrix[][];
    int v;

    public WeightedGraph(int v) {
        this.v = v;
        adjMatrix = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void addEdge(int src, int dest, int wt) {
        adjMatrix[src][dest] = wt;
        adjMatrix[dest][src] = wt;
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        WeightedGraph g = new WeightedGraph(8);
        g.addEdge(0, 3, 1);
        g.addEdge(0, 4, 4);
        g.addEdge(1, 3, 4);
        g.addEdge(1, 2, 9);
        g.addEdge(1, 5, 8);
        g.addEdge(1, 6, 5);
        g.addEdge(2, 6, 6);
        g.addEdge(3, 7, 5);
        g.addEdge(4, 6, 3);
        g.addEdge(4, 7, 2);
        g.addEdge(5, 7, 7);
        g.addEdge(5, 6, 2);
        g.addEdge(6, 7, 6);
        g.printGraph();

    }

}
