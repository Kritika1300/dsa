import java.util.*;
public class Main{
    public static void main(String[] args){
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,1,2);
        addEdge(adj,2,3);
        addEdge(adj,3,4);
        addEdge(adj,4,5);
        addEdge(adj ,5,3);
        printGraph(adj);
        boolean visited[] = new boolean[v];
        boolean recStack[] = new boolean[v];
        boolean cycle = false;
        for(int i = 0; i < v; i++){
            if(!visited[i]){
                if(detectCycle(adj,i,visited,recStack) == true){
                    cycle = true;
                }
            }
        }
        if(cycle){
            System.out.println("cycle exists");
        }else{
            System.out.println("acyclic");
        }
    
    }
        public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
            adj.get(u).add(v);
        }
        public static void printGraph(ArrayList<ArrayList<Integer>> adj){
            for(int i = 0; i < adj.size(); i++){
                for(int j = 0; j < adj.get(i).size(); j++){
                    System.out.print(adj.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
        public static boolean detectCycle(ArrayList<ArrayList<Integer>> adj,int i,boolean[] visited,boolean[] recStack){
            visited[i] = true;
            recStack[i] = true;
            for(int u : adj.get(i)){
                if(!visited[u] && detectCycle(adj,u,visited,recStack)){
                   return true;
                }
                else if(recStack[u] == true){
                    return true;
                }
            }

            recStack[i] = false;
            return false;
            
        }
       
}

