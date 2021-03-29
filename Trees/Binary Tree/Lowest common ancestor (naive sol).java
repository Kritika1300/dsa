import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data = d;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Node root1 = new Node(1);
        root1.left = new Node(5);
        root1.right = new Node(6);
        root1.left.left = new Node(7);
        root1.left.right = new Node(8);
        System.out.println(LCA(root1,7,8));
	}
	public static boolean findPath(Node root,ArrayList<Node> p, int n) {
	    if(root == null) return false;
	    p.add(root);
	    if(root.data == n) return true;
	    if(findPath(root.left,p,n) || findPath(root.right,p,n)) return true;
	    p.remove(p.size() - 1);
	    return false;
	}
	public static int LCA(Node root,int x, int y) {
	    ArrayList<Node> path1 = new ArrayList<>();
	    ArrayList<Node> path2 = new ArrayList<>();
	    if(findPath(root,path1,x) == false || findPath(root,path2,y) == false) return -1;
	    for(int i = 0 ; i < path1.size()-1 && i < path2.size()-1; i++) {
	        if(path1.get(i+1)!= path2.get(i+1)){
	            return path1.get(i).data;
	        }
	    }
	    return -1;
	}
	
}