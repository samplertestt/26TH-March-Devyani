package Types_Of_Variable;

public class Test1
{
	int c=5;
	
  public void mul()
  {
	  int r=5;
	  int mul1=r*GlobalAndLocalVariable.b;//global static variable b from another class
	  System.out.println("multiplication is "+mul1);
  }
  public void division()
  {
	  GlobalAndLocalVariable GALV=new GlobalAndLocalVariable();
	  int x=100;
	  int div1=x/GALV.a;//calling global non static variable from another class
      System.out.println("division is "+div1);
  }
 /* public static void Display()
  {
	  GlobalAndLocalVariable GALV=new GlobalAndLocalVariable();
	  GALV.addition();
	  GALV.sub();
	  Test1 T=new Test1();
	  T.mul();
	  T.division();
	  
  }*/
  
}
