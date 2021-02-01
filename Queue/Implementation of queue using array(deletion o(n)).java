import java.util.*;
class Queue{
    int arr[];
    int cap;
    int size;
    Queue(int c){
        cap = c;
        size = 0;
        arr = new int[cap];
    }
    boolean isEmpty(){
        return (size == 0);
    }
    boolean isFull(){
        return (size == cap);
    }
    public void enque(int x){
        if(isFull()){
            return;
        }
        arr[size] = x;
        size++;
    }
    public void deque(){
        if(isEmpty()){
            return;
        }
        for(int i = 0; i < size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }
    public int size(){
        return size;
    }
    public int getFront(){
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[0];
        }
    }
    public int getRear(){
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[size-1];
        }
    }
    
}
public class Main{
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.deque();
        System.out.println(q.size());
        System.out.println(q.getRear());
        System.out.println(q.getFront());
    
    }
}
