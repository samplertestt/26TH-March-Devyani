package Methods;

public class TestAddSubMulDiv1 {

	public static void main(String[] args) 
	{
		Addition();//Calling Static Method From Same Class
		TestAddSubMulDiv1 Test1 = new TestAddSubMulDiv1();//Create Object Of Same Class
		Test1.sub();//Calling Non-Static Method From Same Class
		
		TestAddSubMulDiv2 Test2 = new TestAddSubMulDiv2();//Create Object Of Another Class
		Test2.Multiplication();//calling Non Static Method From Another Class
		TestAddSubMulDiv2.Division();//Calling Static Regular Method From Another Class
		
	}

	public static void Addition() //Static Regular Method
	{
		int A=50;
		int B=30;
		int sum1=A+B;
		System.out.println("Addition of A & B is "+sum1);
	}
	public void sub() // Non Static Regular Method
	{
		int C=200;
		int D=175;
		int substraction1=C-D;
		System.out.println("Subtraction of C & D is "+substraction1);
		
	}
	
	
}
