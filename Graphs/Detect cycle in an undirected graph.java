import java.util.*;
public class Main{
    public static void main(String[] args){
        int v = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,3);
        printGraph(adj);
        boolean[] visited = new boolean[v];
        boolean cycle = false;
        for(int i = 0; i < v; i++){
            if(!visited[i]){
              if(detectCycle(adj,i,-1,visited)){
                  cycle = true;
                  break;
              }
        }
    }
     if(cycle == true){
                  System.out.println("Cycle exists");
              }
              else{
                  System.out.println("Acyclic");
              }
            
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
        public static boolean detectCycle(ArrayList<ArrayList<Integer>> adj,int source,int parent,boolean[] visited){
            visited[source] = true;
            for(int u : adj.get(source)){
                if(!visited[u]){
                    if(detectCycle(adj,u,source,visited) == true)
                    return true;
                }
                else if(u != parent) return true;
            }
            return false;
        }
}


