package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
    Vector v=new Vector();//Generic Arraylist
    
    v.add("Devyani");
    v.add(123);
    v.add('A');
    v.add(null);
    v.add(123.123);
    v.add(null);
    System.out.println(v.get(0));
    System.out.println("==========================");
    System.out.println(v);
    System.out.println(v.isEmpty());
    System.out.println(v.size());
    System.out.println(v.contains(123.123));
    System.out.println(v.remove(1));
    
    
    System.out.println("==========================");
    
    //Using Specific Arraylist
    
    Vector<Character> ve = new Vector();
    ve.add('A');
    ve.add('B');
    ve.add('C');
    ve.add('D');
    ve.add(null);
    
    System.out.println(ve);
    
    System.out.println("===========================");
    
    //Using Iterator
   Iterator<Character> lt = ve.iterator();
    while(lt.hasNext())
    {
    	System.out.println(lt.next());
    }
    System.out.println("*****************************");
    
	
    //ListIterator
    
    ListIterator ltr = v.listIterator();
    while(ltr.hasNext())
    {
    	System.out.println(ltr.next());    
    }
    
    System.out.println("============================");
    
	//Using For Each
	
	for(Object d:v)
	{
		System.out.println(d);
	}
	System.out.println("*********************************");
    //Enumeration
    
    Enumeration En = v.elements();
	while(En.hasMoreElements())
	{
		System.out.println(En.nextElement());
	}
	
	
	} 
}
