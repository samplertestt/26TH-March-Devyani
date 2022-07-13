package ThisAndSuperKeyword;

public class ThisUse 
{
	int a=10;
	String Name="Devyani";

	public static void main(String[] args) 
	{
		ThisUse TU=new ThisUse();
		TU.test();

	}
	
	public void test()
	{
		int a=20;
		String Name="Yogesh";
		System.out.println("Value of a Is "+a);
		System.out.println("Name Is "+Name);
		
		//I Want To Use Global value Using This Keyword
		System.out.println("=======================");
		System.out.println("The Global Value Of A Is "+this.a);
		System.out.println("The Global value Of String Is "+this.Name);
	    
		System.out.println("========================");
	    int Add=100+a;//here a is local variable
	    System.out.println("The Local Value of Add Is "+Add);
	    
	    System.out.println("=======================");
	    int Add1=200+this.a;//here a is global variable
	    System.out.println("The Global Value Of Add1 Is "+Add1);
	    
	    
	 }

}
