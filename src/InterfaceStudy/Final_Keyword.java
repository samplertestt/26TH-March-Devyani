package InterfaceStudy;

public class Final_Keyword {
	
	int a=100;
	final int b=10;

	public static void main(String[] args)
	{
		Final_Keyword F=new Final_Keyword();
		F.test1();
		
		
	}
	
	public void test1()
	{
	   a=a+10;
	   System.out.println("Value Of A Is "+a);
	   
	  // b=b+10;//we can't update value of final variable
	   System.out.println("Value Of B Is "+b);
	   
	  
	}

}
