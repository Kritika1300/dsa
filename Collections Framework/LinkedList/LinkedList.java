import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   LinkedList<Integer> l = new LinkedList();
	   l.add(5);
	   l.add(6);
	   l.add(7);
	   l.remove(1);
	   Iterator it = l.iterator();
	   while(it.hasNext())
	   {
	       System.out.println(it.next());
	   }
	   
	}
}

