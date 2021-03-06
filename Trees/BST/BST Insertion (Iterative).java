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
        root = insert(root,10);
        preorder(root);
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node insert(Node root,int data){
      Node temp = new Node(data);
      Node parent = null;
      Node curr = root;
      while(curr != null){
          parent = curr;
          if(curr.data > data){
              curr = curr.left;
          }
          else if(curr.data < data){
              curr = curr.right;
          }
          else{
              return root;
          }
      }
      if(parent == null){
          return temp;
      }
      if(parent.data > data){
          parent.left = temp;
      }
      else{
          parent.right = temp;
      }
      return root;}
}

