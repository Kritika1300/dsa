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
        delete(root,20);
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
    public static Node delete(Node root,int data){
        if(root == null) return null;
        else if(root.data > data){
            root.left = delete(root.left,data);
        }
        else if (root.data < data){
            root.right = delete(root.right,data);
        }
        else{
            if(root.left == null){return root.right;}
            else if (root.right == null){return root.left;}
            else{
                Node succ = getSucc(root);
                root.data = succ.data;
                root.right = delete(root.right,succ.data);
            }
        }
          return root;
    }
    public static Node getSucc(Node root){
        Node curr = root.right;
        while(curr != null && curr.left !=null){
            curr = curr.left;
        }
        return curr;
    }
    
}


