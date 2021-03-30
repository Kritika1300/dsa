import java.util.*;
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
class LinkedList {
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = newNode;
        }
    }
    public void reverseList() {
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
       head = prev;
    }
    public void reverseShow(Node head){
        if(head == null){
            return;
        }
        reverseShow(head.next);
        System.out.print(head.data + "->");
    }
    public void show() {
        Node n = head;
        while(n != null){
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println("null");
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(4);
        list.insert(3); 
        list.insert(2);
        list.insert(1);
        list.show();
        // list.reverseList();
        // list.show();
        // list.reverseList();
        // list.show();
        list.reverseShow(list.head); //recurisve method for printing reverse linked list

    }
}

