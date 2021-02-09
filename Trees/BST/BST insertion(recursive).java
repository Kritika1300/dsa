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
        Node root = null;
        root = insert(root,20);
        root = insert(root,5);
        root = insert(root,70);
        preorder(root);
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        else if(root.data > data){
            root.left = insert(root.left,data);
        }
        else if(root.data < data){
            root.right = insert(root.right,data);
        }
        return root;
    }
}

