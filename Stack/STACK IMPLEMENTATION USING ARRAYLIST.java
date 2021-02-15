import java.util.*;
class Stack{
    ArrayList<Integer> al = new ArrayList<>();
    public int size(){
       return al.size();
    }
    boolean isEmpty(){
       return al.isEmpty();
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return al.get(al.size()-1);
    }
    public void push(int data){
    
        al.add(data);
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
        }
        
    }
   
}
public class Main{
    public static void main(String[] args){
        Stack s = new Stack();
       
        System.out.println(s.peek());
        
    }
}

