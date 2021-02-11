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
	    Node root = new Node(10);
	    root.left = new Node(20);
	    root.right = new Node(30);
	    root.left.left = new Node(40);
	    root.left.right = new Node(50);
	    root.right.left = new Node(60);
	    root.right.right = new Node(70);
	    System.out.print(height(root));
	}
	public static int height(Node root){
	    if(root == null) return 0;
	    else{
	        return Math.max(height(root.left),height(root.right))+1;
	    }
	}
}

