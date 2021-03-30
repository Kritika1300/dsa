import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
}
class DoublyLinkedList{
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
            node.prev = n;
        }
        
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
        }
        else{
         node.next = head;
         head.prev = node;  
         head = node;
         node.prev = null;
        }
       
    }
  
    public void insertAtPosition(int index,int data){
        Node newNode = new Node();
        newNode.data = data;
        int count = 0;
        Node n = head;
        while(n.next!=null){
            n = n.next;
            count++;
        }
        if(index > count){
            insert(data);
        }
        else if(index == 0){
            insertAtStart(data);
        }
        else{
            Node n1 = head;
            for(int i = 0; i< index-1; i++){
                n1 = n1.next;
            }
                newNode.next = n1.next;
                n1.next = newNode;
                newNode.next.prev = newNode;
                newNode.prev = n1;
        }
    }
    public void insertBefore(int index,int data){
        Node newNode = new Node();
        newNode.data = data;
        if(index == 0){
           insertAtStart(data);
        }
        Node n2 = head;
        for(int i = 0; i < index; i++){
            n2 = n2.next;
        }
        newNode.prev = n2.prev;
        n2.prev = newNode;
        newNode.prev.next = newNode;
        newNode.next = n2;
        
    }
    public void delete(int index){
        if(head == null){
            System.out.println("Underflow");
        }
         if (index == 0){
            head = head.next;
            head.prev = null;
        }
    }
    public void deleteAtLast(){
        Node n = head;
        while(n.next!=null){
            n = n.next;
        }
        n.prev.next = null;
    }
    public void deleteAtIndex(int index){
        Node n1 = head;
       for(int i = 0; i < index ; i++){
           n1 = n1.next;
       }
       n1.next.prev = n1.prev;
       n1.prev.next = n1.next;
      
    }
    public void deleteAfterIndex(int index){
       Node n = head;
       
       for(int i = 0; i < index ; i++){
           n = n.next;
       }
       n.next.next.prev = n;
       n.next = n.next.next;
      
    }
    public void showReverse(){
     Node n = head;
     while(n.next!=null){
            n = n.next;
        }
     Node last = n;
     while(last!=null){
         System.out.println(last.data);
         last = last.prev;
     }
    }
   public void printForward(Node head){
       if(head == null){
           return;
       }
       else{
           System.out.println(head.data);
           printForward(head.next);
       }
       
   }
    public void show(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }
}
public class Main{
    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.deleteAfterIndex(1);
        list.show();
        list.showReverse();
        list.printForward();
      
    }
}




