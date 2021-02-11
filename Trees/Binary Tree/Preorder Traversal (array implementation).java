import java.util.*;
class Tree{
      public void preorderTraversal(int index,Integer tree[]){
            if(index >= tree.length) return;
            if(tree[index] == null) return;
            System.out.print(tree[index] + " ");
            preorderTraversal(2*index+1,tree);
            preorderTraversal(2*index+2,tree);
        };
}
public class Main{
    public static void main(String[] args){
        Tree t = new Tree();
        Integer tree[] = {1,2,3,4,5,6};
        t.preorderTraversal(0,tree);
        
    }
}
