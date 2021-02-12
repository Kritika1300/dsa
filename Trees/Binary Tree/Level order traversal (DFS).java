import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data = d;
    }
}
public class Main{
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int maxHeight = height(root);
        for(int i = 0; i < maxHeight; i++){
             level(root,i,0);
             System.out.println();
        }
    }
    
    public static int height(Node root) {
        if(root == null) return 0;
        else return Math.max(height(root.left),height(root.right)) + 1;
    }
    
    public static void level(Node root,int k, int depth) {
       if(root == null || depth>k) return;
       if(depth == k) {
           System.out.print(root.data + " ");
       }
       level(root.left,k,depth+1);
       level(root.right,k,depth+1);
   }
    
    
}

