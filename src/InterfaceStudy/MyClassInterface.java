package InterfaceStudy;

public class MyClassInterface implements MyInterface
//here Implement MyInterface Class & Override method with the help/click on unimplemented methods
{

	public static void main(String[] args)
	{
		MyClassInterface m=new MyClassInterface();//Create object of implementation class
		m.test();
		m.test1();
		//a=a+10;--> a is final we can't update value of a
	}

	@Override
	public void test() 
	{
		int x=5;
		int y=5;
		int mul=x*y;
		System.out.println("Mul Is "+mul);
		System.out.println("Test method completed in implementation class");
	}

	@Override
	public void test1()
	{
		int A=25;
		int B=5;
		int div=A/B;
		System.out.println("Div Is "+div);
		System.out.println("Test1 method completed in implementation class");
		
	}

}
