import java.util.*;
class Stack{
    int arr[];
    int cap;
    int top;
    Stack(int c)
    {
        cap = c;
        top = -1;
        arr = new int[cap];
    }
    public void push(int data){
        if(top == cap - 1){
            System.out.println("Overflow");
        }
        else{
            top++;
            arr[top] = data;
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Underflow");
        }
        int res = arr[top];
        top--;
        return res;
    }
    public int size(){
        return top + 1;
    }
    boolean isEmpty(){
        return (top == -1);
    }
    public void printStack(){
        for(int i = top; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        return arr[top];
    }
    
}
public class Main{
    public static void main(String[] args){
        Stack s = new Stack(5);
        s.push(5);
        s.push(4);
        s.push(3); 
        s.push(2);
        s.push(1);
        System.out.println(s.peek());
        
    }
}

