/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		boolean[] visited = new boolean[adjList.size()];
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0 ; i < v ; i++) {
		    if(!visited[i])
		        bfs(adjList, i, visited, res);
		}
	}
	
	public static void bfs(ArrayList<ArrayList<Integer>> adjList, int s, boolean[] visited, ArrayList<Integer> res) {
	   Queue<Integer> q = new LinkedList<>();
	   q.add(s);
	   visited[s] = true;
	   while(!q.isEmpty()) {
	       
	       int currentElement = q.poll();
	       res.add(currentElement);
	       
	       for(int neighbour : adjList.get(currentElement)) {
	           if(!visited[neighbour]) {
	               visited[neighbour] = true;
	               q.add(neighbour);
	           }
	       }
	       
        
    }
	       
	       
	   }
	}
}

