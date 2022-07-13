package Access_Specifier;

public class Velocity {

	public static void main(String[] args) 
	{
	   Velocity V=new Velocity();
	   V.Test();//Calling Private Method-->visible Only within class
	   V.Test2();//Calling Default Method-->visible Within Package
	   V.Test3();//Calling Protected Method-->visible Within Package(inheritance will provide out of package)
	   V.Test4();//Calling Public Method -->visible throughout project
		
		

	}
	private void Test()
	{
		System.out.println("I Am Private Method Test");
	}
	void Test2()
	{
		System.out.println("I Am Default Method Test2");
	}
	protected void Test3()
	{
		System.out.println("I Am Protected Method Test3");
	}
	public void Test4()
	{
		System.out.println("I Am Public Method Test4");
	}

}
