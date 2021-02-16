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
    public void show(){
        Node n =last;
        boolean start = true;
        while(n != last || start){
            start = false;
           n = n.next;
            System.out.println(n.data);
            
        }
    }
    public void deleteAtStart(){
        if(last == null){
            return;
        }
        else if(last.next == last){
            last = null;
        }
        else{
            last.next = last.next.next;
        }
        
    }
    public void deleteAtLast(){
        if(last == null){
            return;
        }
        else if(last.next == last){
            last = null;
        }
        else{
            Node n = last;
            while(n.next != last){
                n = n.next;
            }
            n.next = last.next;
            last = n;
        }
    }
   +
        
}
public class Main{
    public static void main(String[] args){
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtStart(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.deleteNodeWithVal(5);
        list.show();
    }
}

