import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   // Queue<Integer> q = new PriorityQueue<>();
	   // Queue<Integer> q = new ArrayDeque<>();
	    Queue<Integer> q = new LinkedList<>();
	   q.add(50);
	   q.add(20);
	   q.add(30);
	   q.add(40);
	    System.out.println(q.size());
	    System.out.println(q.poll());
	    System.out.println(q.size());
		System.out.println(q.peek());
	}
}

