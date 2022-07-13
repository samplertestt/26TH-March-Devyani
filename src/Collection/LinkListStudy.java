package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListStudy {

	public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add("Velocity");
    ll.add('A');
    ll.add(123);
    ll.add(null);
    ll.add(null);
    ll.add(12.12);
    
    System.out.println(ll);
    System.out.println(ll.size());
    System.out.println(ll.isEmpty());
    System.out.println(ll.getFirst());
    System.out.println(ll.getLast());
    System.out.println(ll.peek());//retrieve element but doesnot remove
    System.out.println(ll.peekLast());//retrieve Last Element
    System.out.println(ll.poll());//retrieve element & Remove The Element
    System.out.println(ll);
    System.out.println(ll.pollLast());//remove last element
    System.out.println(ll);
    System.out.println(ll.pop());//remove the 1st element from the Arraylist
	//System.out.println(ll.push(ll));//this method is not used in generic arraylist
    System.out.println("*******************************");
	//for loop
    for(int i=0;i<=ll.size()-1;i++)
    {
    	System.out.println(ll.get(i));
    }
    System.out.println("********************************");
    //for each
    for(Object a:ll)
    {
    	System.out.println(a);
    }
    System.out.println("********************************");
    //iterator
    Iterator it = ll.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    System.out.println("********************************");
    //ListIterator
    ListIterator ltr = ll.listIterator();
    while(ltr.hasNext())
    {
    	System.out.println(ltr.next());
    }
    
    
    
    

	
	
	
	
	
	
	
	
	
	}

}
