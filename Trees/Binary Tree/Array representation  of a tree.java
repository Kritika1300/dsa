import java.util.*;
class Array_tree{
    static String[] tree = new String[10];
    public static void rootNode(String key){
        tree[0] = key;
    }
    public void leftChild(String key,int root){
        if(tree[root] == null){
            System.out.print("Parent node not present");
        }
        else{
            tree[(2*root) + 1] = key;
        }
    }
     public void rightChild(String key,int root){
        if(tree[root] == null){
            System.out.print("Parent node not present");
        }
        else{
            tree[(2*root) + 2] = key;
        }
    }
    public void traverse(){
        for(int i = 0; i < 10; i++){
            if(tree[i] != null){
                 System.out.print(tree[i]);
            }
            else{
                System.out.print("-");
            }
        }
    }
}
public class Main{
    public static void main(String[] args){
        Array_tree t = new Array_tree();
        t. rootNode("A");
        t. leftChild("B",0);
        t.rightChild("C",2);
        t.traverse();
    }
}
