package Array_Study;

public class Array1 {

	public static void main(String[] args) 
	{
		//A B C D E
		//1.Array Declaration
		char Grade[]=new char[5];
		
		//2.Initialization
		Grade[0]='A';
		Grade[1]='B';
		Grade[2]='C';
		Grade[3]='D';
		Grade[4]='E';
		
		//3.Usage
		System.out.println(Grade[0]);
		System.out.println(Grade[1]);
		System.out.println(Grade[2]);
		System.out.println(Grade[3]);
		System.out.println(Grade[4]);
	
		System.out.println("===========================");
		//Using For Loop
		
	   for(int i=0;i<=4;i++)//Static Coding
	   {
		  System.out.println(Grade[i]);
	   }
	
	   
	   System.out.println("============================");
	   
	   
	   
	   for(int i=0;i<=Grade.length-1;i++)//Dynamic Coding using Forward order
	   {
		   System.out.println(Grade[i]);
	   } 
	   
	   System.out.println("=============================");
	    
	   //Dynamic coding using Reverse Order
		   for(int i=Grade.length-1;i>=0;i--)
		   {
			   System.out.println(Grade[i]);
		   }
		   
		   
	}
}
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		

