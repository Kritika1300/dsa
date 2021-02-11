import java.util.*;
class Node {
   
    int data;
    Node left, right;
    
    public Node(int data) {
        this.data = data;
    }
}
public class Main {
    public static void main (String[] args) { 
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        printLeafNodes(root);
    }
    public static void printLeafNodes(Node root){
        if(root == null) return;
        
        printLeafNodes(root.left);
        if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
        }
        printLeafNodes(root.right);
        
    }

}
    
