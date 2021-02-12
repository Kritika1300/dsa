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
        root = insert(root,50);
        root = insert(root,30);
        root = insert(root,20);
        root = insert(root,40);
        root = insert(root,70);
        root = insert(root,60);
        root = insert(root,55);
        root = insert(root,80);
        preorder(root);
        System.out.print(ceilValue(root,15).data);
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
    public static Node ceilValue(Node root,int value){
      Node res = null;
      while(root != null){
          if(root.data == value) return root;
          else if(root.data > value) { res = root; root = root.left;}
          else if(root.data < value) {
          root = root.right;
          }
          
      }
      return res;
}
}

