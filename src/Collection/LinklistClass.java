package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistClass {

	public static void main(String[] args) {
    LinkedList l = new LinkedList();//Generic Arraylist
    l.add("Shrijai");
    l.add(74);
    l.add(12.12);
    l.add(null);
    l.add('S');
    
    System.out.println(l);
    System.out.println("=====================");
    System.out.println(l.isEmpty());
    System.out.println(l.size());
    System.out.println(l.contains(74));
    System.out.println(l.get(0));
    System.out.println(l.indexOf('S'));
    System.out.println("======================");
    
    
    
  //Specific Arraylist
    
    LinkedList<String> s = new LinkedList();
    s.add("Devyani");
    s.add("Nashik");
    s.add("Dwarka");
    System.out.println(s);
    
    System.out.println("=======================");
    
    //Using Iterator
    Iterator it = l.iterator(); 
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    
    System.out.println("=========================");
    
    //Using Linklist Iterator
    ListIterator ltr = l.listIterator();
    while(ltr.hasNext())
    {
    	System.out.println(ltr.next());
    }
    
    System.out.println("==========================");
    
    //Using For Each Loop
    for(Object m:l)
    {
    	System.out.println(m);
    }
	}

}
