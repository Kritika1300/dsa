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
    public void rotate(int k){
       if (k == 0) return;
       int count = 1;
       Node curr = head;
       while(count < k  && curr != null) {
           curr = curr.next;
           count++;
       }
       if(curr == null) return;
       Node kthNode = curr;
       while(curr.next != null) {
           curr = curr.next;
       }
       curr.next = head;
       head = kthNode.next;
       kthNode.next = null;
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
        int k = 2;
        list.insert(5);
        list.insert(3);
        list.insert(20);
        list.insert(1);
        list.insert(34);
        list.rotate(k);
        list.show();
      
    }
}



