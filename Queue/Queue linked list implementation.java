import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}
class Queue{
    Node front;
    Node rear;
    Queue(){
        front = null;
        rear = null;
    }
    boolean isEmpty(){
        return (front == null);
    }
    public void enque(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void deque(){
        if(front == null) return;
        if(front == rear){
            front = rear = null;
        }
        else{
            front = front.next;
        }
        
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

