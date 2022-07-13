package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListStudy1 {

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList<>();
		a.add("Velocity");
		a.add(123);
		a.add('A');
		a.add(12.21);
		a.add(true);
		a.add("Velocity");
		a.add(null);
		
		System.out.println(a);
		System.out.println("****************");
		
		System.out.println(a);//arrayList Display
		System.out.println(a.size());	
	    System.out.println(a.isEmpty());
	    System.out.println(a.contains(123));
	    System.out.println(a.indexOf(123));
	    System.out.println(a.lastIndexOf("Devyani"));
	    System.out.println(a.get(4));
	    System.out.println(a.remove(1));
	    System.out.println("***************");
	    System.out.println(a);
	    System.out.println("***************");

	    for(int i=0;i<=a.size()-1;i++)
	    {
	    	System.out.println(a.get(i));//individual element print
	    }
	    
	    System.out.println("==========================");
	
	    //Using Iterator Cursor
	    //Iterator:-It's a Class
	    
	  java.util.Iterator it = a.iterator();
	  System.out.println(it.hasNext());
	  System.out.println("==========================");

	    //Using Iterator Cursor
	  
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
	
      System.out.println("===========================");
	    
	    //List-Iterator cursor
	    ListIterator ltr = a.listIterator();
	    while(ltr.hasNext())
	    {
	    	System.out.println(ltr.next());
	    }
	    
	    System.out.println("==============================");
	    
	    //For Each Loop
	    
	    for(Object v:a)
	    {
	    	System.out.println(v);
	    }
	    
	    System.out.println("==============================");
	    
	    
	    //Using Specific Element
	    ArrayList<Integer> s = new ArrayList<>();
	    
	    s.add(123);
	    s.add(12);
	}

}
