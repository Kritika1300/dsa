import java.util.*;
class CircularAQueue{
    int arr[];
    int cap;
    int size;
    int front;
    CircularAQueue(int c){
        cap = c;
        arr = new int[cap];
        size = 0;
        front = 0;
    }
    boolean isEmpty(){
        return(size == 0);
    }
    boolean isFull(){
        return (size == cap);
    }
    int getFront(){
        if(isEmpty()){
            return -1;
        }
        else{
            return front;
        }
    }
    int getRear(){
        if(isEmpty()){
            return -1;
        }
        else{
            return (size + front - 1)%cap;
        }
    }
    public void enque(int data){
        if(isFull()){
            return;
        }
        else{
            int rear = getRear();
            rear = (rear+1)%cap;
            arr[rear] = data;
            size++;
        }
    }
    public int deque(){
        if(isEmpty()){
            return -1;
        }
        else{
            int res = arr[front];
            front = (front+1)%cap;
            size--;
            return res;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    CircularAQueue q = new CircularAQueue(3);
	    q.enque(10);
	    q.enque(20);
	    q.enque(30);
		System.out.println(q.deque());
		System.out.println(q.getFront());
		
	}
}

