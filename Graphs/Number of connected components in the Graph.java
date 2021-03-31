import java.util.*;
public class Main{
    public static void main(String[] args) {
        int v = 7;
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
       for(int i = 0; i < v; i++) {
           adj.add(new ArrayList<Integer>());
       }
       addEdge(adj,0,1);
       addEdge(adj,0,2);
       addEdge(adj,1,3);
       addEdge(adj,2,3);
       addEdge(adj,4,5);
       addEdge(adj,5,6);
       boolean[] visited = new boolean[v + 1];
       int count = 0;
       for(int i = 0; i < v; i++){
           if(visited[i] == false) {
               count++;
               bfs(adj,i,v,visited);
           }
       }
       System.out.println("Number of connected components:" + count);
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void bfs(ArrayList<ArrayList<Integer>> adj,int source,int v,boolean[] visited) {
        
        Queue<Integer> q = new LinkedList<>();
        visited[source] = true;
        q.add(source);
        while(!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");
            for(int neighbours : adj.get(curr)) {
                if(visited[neighbours] == false) {
                    visited[neighbours] = true;
                    q.add(neighbours);
                }
            }
        }
        
    }
}
