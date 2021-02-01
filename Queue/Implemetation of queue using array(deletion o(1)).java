import java.util.*;
class Queue{
    int arr[];
    int front;
    int rear;
    int cap;
    Queue(int c){
        cap = c;
        arr = new int[cap];
        front = -1;
        rear = -1;
    }
    boolean isEmpty(){
        return (front == -1||front>rear);
    }
    boolean isFull(){
        return (rear == cap-1);
    }
    public void enque(int data){
        if(isFull()){
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        arr[++rear] = data;
    }
    public int deque(){
        if(isEmpty()){
            return -1;
        }
        else{
            int res = arr[front];
            front++;
            return res;
        }
    }
    int size(){
        return (rear-front+1);
    }
}
public class Main{
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.deque();
        System.out.println(q.size());
    }
    
}
