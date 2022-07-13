package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetStudy {

	public static void main(String[] args) 
	{
      LinkedHashSet ls = new LinkedHashSet<>();
      ls.add("Devyani");
      ls.add(123);
      ls.add(12.21);
      ls.add('A');
      ls.add(null);
      ls.add("Devyani");
      System.out.println(ls);
      System.out.println(ls.size());
      System.out.println(ls.isEmpty());
      System.out.println(ls.toString());
      System.out.println("*************************");
      //for each loop
      for(Object a:ls)
      {
    	  System.out.println(a);
      }
      System.out.println("*************************");
      //iterator
      Iterator it =ls.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      System.out.println("**************************");
      
      //Linklist Iterator
      LinkedList<Integer> itr =new LinkedList<>();
      itr.add(20);
      itr.add(10);
      itr.add(30);
      System.out.println(itr);
	}

}
