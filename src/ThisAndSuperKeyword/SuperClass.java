package ThisAndSuperKeyword;

public class SuperClass extends SuperUse
{
	int p=100;//global variable from super class

	public static void main(String[] args) 
	{
		SuperClass S=new SuperClass();
		S.test();

	}
	
	public void test()
	{
		int p=10;
		System.out.println("lacal value Of P Is "+p);
		System.out.println("Global Value Of P Is "+this.p);
	    System.out.println("Global Of P From Super Use Class Is "+super.p);
	}
	
}
