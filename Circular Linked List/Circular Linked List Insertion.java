import java.util.*;
class Node{
    int data;
    Node next;
}
class CircularLinkedList{
    Node last;
    private void insertInEmpty(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(last == null){
            last = newNode;
            newNode.next = newNode;
        }
    }
    public void insertAtStart(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(last == null){
            insertInEmpty(data);
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
        }
    }
    public void insertAtLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(last == null){
            insertInEmpty(data);
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        
    }
    // public void insertAtPosition(int index, int data){
    //     Node newNode = new Node();
    //     newNode.data = data;
    //     if(last == null){
    //         insertInEmpty(data);
    //     }
    //     else if (index == 0){
    //         insertAtStart(data);
    //     }
    //     else{
    //         for(int i = 0; i < index-1; i++){
                
    //         }
    //     }
    // }
    public void show(){
        Node n =last;
        boolean start = true;
        while(n != last || start){
            start = false;
           n = n.next;
            System.out.println(n.data);
            
        }
        
    }
    // public void insertAfterNodeVal(int data,int value){
    //     Node newNode = new Node();
    //     newNode.data = data;
    //     Node n = last;
    //     boolean start = true;
    //     if(last == null){
    //         return;
    //     }
    //     if(last.data == value){
    //         insertAtLast(data);
    //     }
    //     else{
    //         while(n.data != value && (n!= last || start)){
    //         start = false;
    //         n = n.next;
    //     }
    //     if(n == last){
    //         return;
    //     }
    //     else{
    //          newNode.next = n.next;
    //          n.next = newNode;
    //     }
       
    //     }
        
    // }
    public void insertAfterNodeVal(int data,int value){
        if(last == null){
            return;
        }
        if(last.data == value){
            insertAtLast(data);
        }
        else{
             Node n = last;
             boolean start = true;
             boolean found = false;
             while(n!= last || start) {
                    start = false;
                    n = n.next;
                if(n.data == value) {
                    found = true;
                    break;
                }
            }
             if(found) {
                    Node newNode = new Node();
                    newNode.data = data;
                    newNode.next = n.next;
                    n.next = newNode;
                }
             else {
                    return;
                }
            }
    }
    public void insertBeforeVal(int data,int value){
        if(last == null){
            return;
        }
        Node n = last;
        boolean start = true;
        boolean found = false;
        Node prev = null;
        while(n != last || start){
            start = false;
            prev = n;
            n = n.next;
            if(n.data == value){
                found = true;
                break;
            }
        }
        if(found){
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = prev.next;
            prev.next = newNode;
        }
        else{
            return;
        }
    }
}
public class Main{
    public static void main(String[] args){
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtStart(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertBeforeVal(10,5);
        list.show();
    }
}