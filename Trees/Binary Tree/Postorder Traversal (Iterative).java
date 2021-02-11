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
        postorder(root);
    }
    public static void postorder(Node root){
       if(root == null) return;
       Stack<Node> s = new Stack();
       Stack<Node> s1 = new Stack();
       s.push(root);
       while(!s.isEmpty()){
       Node temp = s.pop();
       s1.push(temp);
       if(temp.left != null) s.push(temp.left);
       if(temp.right != null) s.push(temp.right);
    }
       while(!s1.isEmpty()){
           System.out.print(s1.pop().data + " ");
       }
    
  }
}
