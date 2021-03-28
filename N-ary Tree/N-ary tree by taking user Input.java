import java.util.*;
class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>> children;
    TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
    
}
public class Main
{
	public static void main(String[] args) {
    	TreeNode<Integer> root = takeIput();
        print(root);
	}
	public static TreeNode<Integer> takeIput(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter current root data");
	    int data = sc.nextInt();
	    TreeNode<Integer> root = new TreeNode<>(data);
	    System.out.println("Enter no. of children for this node");
	    int numberofchild = sc.nextInt();
	    for(int i = 0; i < numberofchild; i++){
	         TreeNode<Integer> child =  takeIput();
	         root.children.add(child);
	    }
	    return root;
	}
	public static void print(TreeNode<Integer> root) {
	    String s = root.data + ":";
	    for(int i = 0; i < root.children.size(); i++){
	        s += root.children.get(i).data + " ";
	    }
	    System.out.println(s);
	    for(int i = 0; i < root.children.size(); i++){
	       print(root.children.get(i));
	    }
	   
	}
}
