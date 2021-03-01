import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
}
class LinkedList{
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
        
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    public void insertAt(int index,int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0){
            insertAtStart(data);
        }
        else{
            Node n = head;
        for(int i = 0; i < index-1; i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        }
    }
    public void insertAtLast(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        while(n.next!=null){
            n = n.next;
        }
        node.next = null;
        n.next = node;
    }
    public void insertBefore(int index,int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0){
            insertAtStart(data);
        }
        
    }
    public void deleteAt(int index){
        if(head == null){
            System.out.println("Empty list");
        }
        else if(index == 0){
        head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            for(int i = 0; i < index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }
    public void show(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
public class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insertAt(2,91);
        list.insertAtLast(21);
        list.deleteAt(0);
        list.show();
      
    }
}



