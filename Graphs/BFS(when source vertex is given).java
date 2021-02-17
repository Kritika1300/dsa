import java.util.*;
public class Main{
    public static void main(String[] args){
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,5,1);
        addEdge(adj,5,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        printGraph(adj);
        breadthFirstSearch(adj,5,5);
    }
        public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        public static void printGraph(ArrayList<ArrayList<Integer>> adj){
            for(int i = 0; i < adj.size(); i++){
                for(int j = 0; j < adj.get(i).size(); j++){
                    System.out.print(adj.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
        public static void breadthFirstSearch(ArrayList<ArrayList<Integer>> adj,int v,int source){
            boolean visited[] = new boolean[v+1];
            Queue<Integer> q = new LinkedList<>();
            visited[source] = true;
            q.add(source);
            while(!q.isEmpty()){
                int u = q.poll();
                System.out.print(u + " ");
                for(int j : adj.get(u)){
                    if(visited[j] == false){
                        visited[j] = true;
                        q.add(j);
                    }
                }
            }
            
        }
}

