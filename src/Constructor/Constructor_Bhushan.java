package Constructor;

public class Constructor_Bhushan
{
	int a;
	String Name;
	float Height;

	public Constructor_Bhushan()
	{
		a=10;
		Name="Devyani";
		Height=5.5f;
	}
	
	public Constructor_Bhushan(int a1,String Name1)//Non Static Method With Parameter
	{
		a=a1;
		Name=Name1;
	}
	
   public void Info()//Non-Static Method without Parameter
   {
	   System.out.println("The Value A Is "+a);
	   System.out.println("My Name Is "+Name);
	   System.out.println("My Height Is "+Height);
   }
	
	public static void main(String[] args) 
	{
		Constructor_Bhushan B=new Constructor_Bhushan();
		B.Info();//Calling Non-Static Method From Same Class
		Constructor_Bhushan B1=new Constructor_Bhushan(20, "Yogesh");
		B1.Info();		
	}

}
