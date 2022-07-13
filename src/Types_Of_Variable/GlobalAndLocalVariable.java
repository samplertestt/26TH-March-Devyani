package Types_Of_Variable;

public class GlobalAndLocalVariable 
{
   int a=10;//non-static global variable
   static int b=20;//static global variable
   
	public static void main(String[] args) 
	{
		int b=20;
		System.out.println("Value Of b Is "+b);//calling Static global variable
		
		GlobalAndLocalVariable GALV=new GlobalAndLocalVariable();
		
		System.out.println("Value Of a is "+GALV.a);//calling non-static variable from same class
		
		GALV.addition();//calling addition with non static method with same class
		
		GALV.sub();//calling sub with non static method with same class
		
		Test1 T=new Test1();//created object of another class
		
		T.mul();//calling non static method from another class
		
		T.division();//calling non static method from another class
		
		System.out.println("============================");
		//Test1.Display();
		
		int sum=b+T.c;
		
		System.out.println("Sum Is "+sum);
		
		System.out.println("Value Of C Is "+T.c);
	}
	
	public void addition()
	{
		int p=30;
		int sum=p+10;//p is local variable known to addition method
		int sum1=a+100;//a is global variable known to whole class
		System.out.println("addition is "+sum+ " & "+sum1);
	}
	
	public void sub()
	{
		int q=50;
		int sub=q-30;
		int sub1=q-b;//b is static global variable with same class
		System.out.println("sub is "+sub +" & "+sub1);
	}

}
