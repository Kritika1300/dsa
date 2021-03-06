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
    public int middleElement(){
        Node n = head;
        int count = 0;
        while(n != null) {
            n = n.next;
            count++;
        }
        Node curr = head;
        for(int i = 0; i < count/2; i++){
           curr = curr.next;
        }
        return curr.data;
    }
    public void show(){
        Node n = head;
        while(n !=null){
            System.out.print(n.data+ "->");
            n = n.next;
        }
        System.out.println("null");
    }
}
public class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(10);
        list.insert(11);
        list.show();
        System.out.println(list.middleElement());
      
    }
}



