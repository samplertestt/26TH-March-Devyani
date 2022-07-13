package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class HashsetStudy {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("Devyani");
		hs.add('A');
		hs.add(123);
		hs.add(12.21);
		hs.add(null);
		hs.add(null);
		hs.add("Devyani");
		System.out.println(hs);
		//Using Method
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Devyani"));
		System.out.println(hs.toString());
		//System.out.println(hs.remove(null));
		System.out.println("===============================");
        
	
		//for each loop
		
		for(Object Hs1:hs)
		{
			System.out.println(Hs1);
		}
		System.out.println("===============================");
		//Iterator
		
		Iterator it = hs.iterator(); 
		
		while(it.hasNext())
			{
				System.out.println(it.next());
			}
		
		System.out.println("================================");
		
		
			
		LinkedList<Integer> itr = new LinkedList<>();
        itr.add(10);
        itr.add(40);
        itr.add(80);
        itr.add(90);
        itr.add(110);
        System.out.println(itr);
        System.out.println(itr.size());
        System.out.println("==============================");
        
        LinkedList<String> ltr1 = new LinkedList<>();
        ltr1.add("Devyani");
        ltr1.add("Yogesh");
        ltr1.add("Janu");
        ltr1.add("Kamini");
        System.out.println(ltr1);
       
        
        
        
        
        
        
        
        

	}

}
