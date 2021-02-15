import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
class Stack{
    Node head;
    int size;
    Stack(){
        head = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public int push(){
        if(isEmpty()){
            return -1;
        }
        else{
            int res = head.data;
            head = head.next;
            size--;
            return res;
            
        }
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        else{
           return head.data; 
        }
    }
}
}
public class Main{
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(5);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
