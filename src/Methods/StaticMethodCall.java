package Methods;

public class StaticMethodCall 
{

	public static void main(String[] args) 
		{
			sample();//calling static regular method from same class
			test();//calling static regular method from same class
			
			differentclass.Meter_Range();//calling regular static method from different class
			differentclass.Display();//calling regular static method from different class
			
			
			
		}
		
		public static void sample()//regular static method
		{
			System.out.println("Hi I Am Regular Static Sample Method ");
		}
		
		public static void test()// regular static method
		
		{
			System.out.println("Hi I Am Regular Static test Method ");
		}
       
		
	
	}


