package String_Class_Study;

public class String_Use1 {

	public static void main(String[] args)
	
	{
	   String Name="Devyani";
	   System.out.println("Length Of Name Is "+Name.length());
		
	   System.out.println("=====================================");
	   
	   String Name1="Velocity";//With-Out Using new Keyword(Stored In Constant Pool Area)
	   System.out.println(Name1.length());
	   int output = Name1.length();
	   System.out.println("String Length Is "+output);
		
		System.out.println("=================================== ");
		
		String City=new String("PUNE");//With Using new Keyword(Stored In Non-Constant Pool Area)
		System.out.println(City.length());
		int P = City.length();
		System.out.println("City Lenght Is "+P);
		
		
		
		
		
		
		
		
	}

}
