import java.util.*;
class Graph{
    int vertices;
    int adjMatrix[][];
    Graph(int v){
        vertices = v;
        adjMatrix = new int[vertices][vertices];
    }
    public void addEdge(int source,int destination){
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }
    public  void printMatrix(){
        for(int i = 0; i < adjMatrix.length; i++){
            for(int j = 0; j < adjMatrix.length; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
         
    }
    
}
public class Main
{
    
	public static void main(String[] args) {
	    Graph g = new Graph(4);
	    g.addEdge(0,1);
	    g.addEdge(0,2);
	    g.addEdge(1,2);
	    g.addEdge(1,3);
	    g.printMatrix();
	}
}

