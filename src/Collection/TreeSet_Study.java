package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Study {

	public static void main(String[] args) {
    TreeSet t = new TreeSet<>();
    t.add(20);
    //t.add("Devyani");//Here We declare 1 type of data ,we cannot declare multiple type Of Data;If We are Declaring Multiple Type of data then we get cast class exception
    t.add(10);
    t.add(30);
    t.add(40);
    // t.add(null);//Here Null Pointer Exception
    System.out.println(t);
    System.out.println("*********************");
    //methods
    System.out.println(t.size());
    System.out.println(t.isEmpty());
    System.out.println(t.contains(10));
    System.out.println("**********************");
   //for each Loop
    for(Object x:t)
    {
    	System.out.println(x);
    }
    System.out.println("**********************");
    //iterator
    Iterator it = t.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    System.out.println("**********************");
    //Treeset iterator
    
    TreeSet<String> t1 = new TreeSet<>();
    t1.add("Velocity");
    t1.add("Katraj");
    t1.add("Pune");
    System.out.println(t1);
    
    
    
    
    
    
    
    
	}

}
