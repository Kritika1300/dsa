import java.util.*;
class Heap{
    int arr[];
    int capacity;
    int size;
    Heap(int c){
        capacity = c;
        arr = new int[capacity];
        size = 0;
    }
    public void insert(int data){
        if(size == capacity) return;
        size++;
        arr[size - 1] = data;
        for(int i = size - 1; i != 0 && Math.floor(arr[(i-1)/2]) > arr[i];){
            int swap = arr[i];
            arr[i] = arr[(i-1)/2];
            arr[(i-1)/2] = swap;
            i = (i-1)/2;
        }
    }
    public int getMinimum(){
        return arr[0];
    }
    public void minHeapify(int i){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int smallest  = i;
        if(left < size && arr[left] < arr[i]) smallest = left;
        if(right < size && arr[right] < arr[smallest]) smallest = right;
        if(smallest != i){
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
            minHeapify(smallest);
        }
    }
    public int extractMinimum(){
        if(size == 0) return Integer.MAX_VALUE;
        if(size == 1) {
            size--;
            return arr[0];
        }
        int swap = arr[0];
        arr[0] = arr[size-1];
        arr[size - 1] = swap;
        size--;
        minHeapify(0);
        return arr[size];
    }
    public void show(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class Main{
    public static void main(String[] args){
        Heap h = new Heap(10);
        h.insert(20);
        h.insert(25);
        h.insert(30);
        h.insert(35);
        h.insert(40);
        h.insert(80);
        h.insert(32);
        h.insert(100);
        h.insert(70);
        h.insert(60);
        h.show();  
        System.out.println();
        System.out.println(h.extractMinimum());
        h.show();
    }
}

