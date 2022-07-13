package Constructor;

public class UserDefinedWithParameterConstructor 
{
	int A;
	int B;
	int C;
	
	public UserDefinedWithParameterConstructor() //without parameter constructor
	{
		 A=20;
		 B=30;
		 C=50;
	}
	
	public UserDefinedWithParameterConstructor(int P)//with One parameter constructor
	
	{
		A=P;
	}
	public UserDefinedWithParameterConstructor(int P,int Q)//with Two parameter constructor
	{
		A=P;
		B=Q;
	}
	public UserDefinedWithParameterConstructor(int P,int Q,int R)//with Three parameter constructor
	{
		A=P;
		B=Q;
		C=R;
	}
	
	
	public void Addition() //without parameter constructor
	{
		int sum=A+B+C;
		System.out.println("Addition Is "+sum);
	}
	
	public static void main(String[] args)
	{
	
		UserDefinedWithParameterConstructor udc=new UserDefinedWithParameterConstructor();
		udc.Addition();//Calling without (ZERO)parameter constructor
		UserDefinedWithParameterConstructor udc1=new UserDefinedWithParameterConstructor(40);
		udc1.Addition();//Calling with one parameter constructor
		UserDefinedWithParameterConstructor udc2=new UserDefinedWithParameterConstructor(40,50);
		udc2.Addition();//Calling with Two parameter constructor
		UserDefinedWithParameterConstructor udc3=new UserDefinedWithParameterConstructor(40,50,110);
		udc3.Addition();//Calling with Three parameter constructor
		

	}

}
