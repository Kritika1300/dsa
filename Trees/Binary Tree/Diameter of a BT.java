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
	    Node root1 = new Node(10);
        root1.left = new Node(20);
        root1.right = new Node(30);
        root1.right.left = new Node(40);
        root1.right.left.left = new Node(70);
        root1.right.right = new Node(60);
        root1.right.right.right = new Node(80);
        System.out.println(diameter(root1));
	}
	static int res = 0;
	public static int diameter(Node root) {
	    if(root == null) return 0;
	    int lh = diameter(root.left);
	    int rh = diameter(root.right);
	    res = Math.max(res,1+rh+lh);
	    return 1 + Math.max(lh,rh);
	    
	}
	
}
