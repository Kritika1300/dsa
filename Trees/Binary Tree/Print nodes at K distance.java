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
OR......................
import java.util.*;
class Node {
   
    int data;
    int depth;
    Node left, right;
    
    public Node(int data,int depth) {
        this.data = data;
        this.depth = depth;
    }
}
public class Main {
    public static void main (String[] args) { 
        Node root = new Node(1,0); 
        root.left = new Node(2,1); 
        root.right = new Node(3,1); 
    
        printLeafNodes(root,2,0);
    }
    public static void printLeafNodes(Node root,int k,int depth){
        if(root == null) return;
        else if(k == depth){
            System.out.print(root.data + " ");
        }
        else{
            printLeafNodes(root.left,k,depth + 1);
            printLeafNodes(root.right,k,depth + 1);
        }
        
    }

}
    
