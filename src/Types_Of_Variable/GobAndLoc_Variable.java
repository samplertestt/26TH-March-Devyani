package Types_Of_Variable;

public class GobAndLoc_Variable 
{
	int a=100;//global non-static variable
	int b=200;//global non-static variable
	static int c=300;//global static variable
	static int d=400;//global static variable

	public static void main(String[] args) 
	{
		int c=300;;
		int d=400;
		System.out.println("Value Of C Is "+c);//calling non-static global variable
		System.out.println("Value Of D Is "+d);//calling non-static global variable
		GobAndLoc_Variable GALV=new GobAndLoc_Variable();
		System.out.println("value of A Is "+GALV.a);//calling Non-static global variable
		GobAndLoc_Variable GALV1 =new GobAndLoc_Variable();
		System.out.println("value of B Is "+GALV1.b);//calling Non-static global variable
		GALV.Addition();
		

	}
	
	public static void Addition()
	{
		int e=50;
		int f=60;
		int sum=e+c;//c is static global variable with same class
		int sum1=f+d;//d is static global variable with same class
		System.out.println("Addition Is "+sum);
		System.out.println("Addition Is "+sum1);
	}

}
