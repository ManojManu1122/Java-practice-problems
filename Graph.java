public class Graph {
    int n;
   public boolean adjMatrix[][];
    Graph(int vertices){
        n = vertices;
      adjMatrix = new boolean[n][n];
    }
    public void addEdge(int i, int j){
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }
    public void removeEdge(int i, int j){
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(i).append(": ");
            for(boolean j: adjMatrix[i]){
                sb.append(j ? 1 : 0).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(0, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        System.out.print(g.toString());
    }
}
