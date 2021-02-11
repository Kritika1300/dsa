import java.util.*;
class Node{
    int data;
    int kdis;
    Node left;
    Node right;
    Node(int d,int k){
        data = d;
        kdis = k;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Node root = new Node(10,0);
	    root.left = new Node(20,1);
	    root.right = new Node(30,1);
	    root.left.left = new Node(40,2);
	    root.left.right = new Node(50,2);
	    root.right.left = new Node(60,2);
	    root.right.right = new Node(70,2);
	    printKNode(root,1);
	}
	public static void printKNode(Node root,int k){
	    if(root == null) return;
	    else if(k == 0){
	        System.out.print(root.data + " ");
	    }
	    else{
	       printKNode(root.left,k-1);
	       printKNode(root.right,k-1);
	    }
	}
}
