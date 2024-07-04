
import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    public int vertices;
    public LinkedList<Integer> adjList[];
    BFS(int v){
        vertices = v;
        adjList = new LinkedList[v];
    for(int i=0;i<v;i++){
        adjList[i] = new LinkedList();

    }
}
    void addEdge(int v, int w){
        adjList[v].add(w);
    }
    void BFS(int s){
        boolean visited[] = new boolean[vertices];
        LinkedList<Integer> queue = new  LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty()){
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = adjList[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        BFS b = new BFS(4);
        b.addEdge(0, 1);
        b.addEdge(0, 2);
        b.addEdge(1, 2);
        b.addEdge(2, 0);
        b.addEdge(2, 3);
        b.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal starting from vertex 4 :");

        b.BFS(0);

        
    }
}
