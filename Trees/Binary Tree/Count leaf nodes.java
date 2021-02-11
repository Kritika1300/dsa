import java.util.*;
class Node {
   
    int data;
    Node left, right;
    
    public Node(int data) {
        this.data = data;
    }
}
public class Main {
    static int count;
    public static void main (String[] args) { 
        count = 0;
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(countLeafNodes(root));
    }
    // public static void countLeafNodes(Node root){
    //     if(root == null) return;
    //     countLeafNodes(root.left);
    //     if(root.left == null && root.right == null){
    //       count++;
    //     }
    //     countLeafNodes(root.right);
    // }
    public static int countLeafNodes(Node root){
        if(root == null) return 0;
        else if(root.left == null && root.right == null) return 1;
        int left = countLeafNodes(root.left);
        int right = countLeafNodes(root.right);
        return left+right;
    }
}
    
