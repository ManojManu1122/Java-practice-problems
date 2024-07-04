
public class MST {

    static final int V = 8;

    public static void main(String[] args) {
        MST mst = new MST();
        int graph[][] = {{0, 5, 0, 0, 2, 0, 0, 0},
        {5, 0, 5, 0, 0, 5, 0, 0},
        {0, 5, 0, 0, 2, 5, 0, 0},
        {0, 0, 0, 0, 0, 5, 0, 9},
        {2, 0, 2, 0, 0, 0, 3, 7},
        {0, 5, 5, 5, 0, 0, 4, 1},
        {0, 0, 0, 0, 3, 4, 0, 7},
        {0, 0, 0, 9, 7, 1, 7, 0}};
        mst.primMST(graph);
    }

    int minKey(int key[], boolean mtST[]) {
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < V; i++) {
            if (mtST[i] == false && key[i] < min) {
                min = key[i];
                min_index = i;
            }
        }
        return min_index;

    }

    private void primMST(int[][] graph) {
        int key[] = new int[V];
        boolean mtST[] = new boolean[V];
        int parent[] = new int[V];
        for (int i = 0; i < V; i++) {
            mtST[i] = false;
            key[i] = Integer.MAX_VALUE;
        }
        key[0] = 0;
        parent[0] = -1;
        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mtST);
            mtST[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && mtST[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }

        }
        printMst(parent, graph);

    }

    private void printMst(int[] parent, int[][] graph) {
        System.out.println("Edge  \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "    " + graph[i][parent[i]]);
        }
    }

}
