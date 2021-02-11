import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int d){
        data = d;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Integer tree[] = {1,2,null,3,4,null,null,5};
	    Node root = buildTree(0,tree);
	    preorder(root);
	}
	public static Node buildTree(int index,Integer[] tree){
	    if(index >= tree.length) return null;
	    if(tree[index] == null) return null;
	    Node root = new Node(tree[index]);
	    root.left = buildTree(2*index+1,tree);
	    root.right = buildTree(2*index+2,tree);
	    return root;
	}
	public static void preorder(Node root){
	    if(root == null) return;
	    System.out.print(root.data + " ");
	    preorder(root.left);
	    preorder(root.right);
	}
}

