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
        preorder(root);
    }
    public static void preorder(Node root){
       if(root == null) return;
       Stack<Node> s = new Stack();
       s.push(root);
       while(!s.isEmpty()){
           Node curr = s.pop();
           System.out.print(curr.data+ " ");
           if(curr.right != null) s.push(curr.right);
           if(curr.left != null) s.push(curr.left);
       }
       
    }
    
}
