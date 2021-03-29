import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data = d;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        System.out.println(maxLevel(root));
	}
	public static int maxLevel(Node root) {
	    if(root == null) return -1;
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    q.add(null);
	    int count = 1;
	    int maxCount = 1;
	    int currLevel = 0;
	    int ans = 0;
	    while(q.size() > 1) {
	        Node curr = q.poll();
	        if(curr == null) {
    	        count = q.size();
    	        currLevel++;
    	        if(count > maxCount) {
    	            maxCount = count;
    	            ans = currLevel;
    	        }
    	        q.add(null);
    	        continue;
	        }
	        if(curr.left != null) {
	            q.add(curr.left);
	        }
	        if(curr.right != null) {
	            q.add(curr.right);
	        }
	    }
	  return ans;
	 }
}
