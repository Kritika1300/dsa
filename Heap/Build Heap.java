import java.util.*;
class Heap{
    public void minHeapify(int i,int[] arr){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int smallest  = i;
        if(left < arr.length && arr[left] < arr[i]) smallest = left;
        if(right < arr.length && arr[right] < arr[smallest]) smallest = right;
        if(smallest != i){
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
            minHeapify(smallest,arr);
        }
    }
    public void buildHeap(int arr[]){
       for(int i = (arr.length - 2)/2; i >= 0; i--)
       {
           minHeapify(i,arr);
       }
    }
    
}
public class Main{
    public static void main(String[] args){
        Heap h = new Heap();
        int arr[] = {10,5,20,2,4,8};
        h.buildHeap(arr);
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

