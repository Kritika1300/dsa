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
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);
        preorder(root);
        System.out.print(search(root,17));
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static boolean search(Node root,int k){
        if(root == null) return false;
        else if(root.data == k) return true;
        else if(root.data > k){ return search(root.left,k);}
        else{ return search(root.right,k);}
        
    }
}
