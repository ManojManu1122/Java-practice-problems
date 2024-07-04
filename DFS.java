
import java.util.*;

public class DFS {

    public int vertices;
    public LinkedList<Integer> adjList[];

    DFS(int v) {
        vertices = v;
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    void DFS(int s) {
        boolean visited[] = new boolean[vertices];
        Stack<Integer> st = new Stack<>();
        st.push(s);
        while (st.isEmpty()) {
            s = st.pop();

            if (!visited[s]) {
                System.out.print(s + " ");
                visited[s] = true;
            }
            Iterator<Integer> i = adjList[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    st.push(n);
                }
            }

        }

    }

    public static void main(String[] args) {
        DFS d = new DFS(6);

    }

}
