import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data= d;
    }   
}
public class Main{
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        inorder(root);
    }
    // public static void inorder(Node root){
    //     if(root == null)return;
    //     inorder(root.left);
    //     System.out.print(root.data + " ");
    //     inorder(root.right);
    // }
    public static void inorder(Node root){
        Stack<Node> s = new Stack();
        Node curr = root;
        while(curr != null || s.isEmpty() == false){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
            
        }
    }
    
}
