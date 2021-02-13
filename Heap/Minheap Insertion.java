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
    public void show(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class Main{
    public static void main(String[] args){
        Heap h = new Heap(9);
        h.insert(20);
        h.insert(25);
        h.insert(30);
        h.insert(34);
        h.insert(40);
        h.insert(80);
        h.insert(32);
        h.insert(100);
        h.insert(70);
        h.insert(60);
        h.show();
        System.out.println(h.getMinimum());
    }
}
