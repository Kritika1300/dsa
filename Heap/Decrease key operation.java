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
    public void decreaseKey(int i,int newVal){
        if(i > size) return;
        arr[i] = newVal;
        while(i !=0 && arr[i] < arr[(i-1)/2]){
            int swap = arr[i];
            arr[i] = arr[(i-1)/2];
            arr[(i-1)/2] = swap;
            i = (i-1)/2;
        }
        
    }
    public void show(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class Main{
    public static void main(String[] args){
        Heap h = new Heap(6);
        h.insert(10);
        h.insert(20);
        h.insert(40);
        h.insert(80);
        h.insert(100);
        h.insert(70);
        h.show(); 
        h.decreaseKey(3,5);
        System.out.println();
        h.show();
       
    }
}
