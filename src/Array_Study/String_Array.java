package Array_Study;

public class String_Array {

	public static void main(String[] args) {
		
		//Declaration 
		
		String Name[]=new String[5];
		
		//Initialization
		
		Name[0]="Devyani";
		Name[1]="Kamini";
		Name[2]="Dev";
		Name[3]="Patil";
		Name[4]="Milind";
		
		
		//usage
		
		System.out.println(Name[0]);
		System.out.println(Name[1]);
		System.out.println(Name[2]);
		System.out.println(Name[3]);
		System.out.println(Name[4]);
		
		
		System.out.println("====================================");
		
		//Using For Loop In Forward Order
		
		for(int i=0;i<=Name.length-1;i++)//Using Dynamic Coding
		{
			System.out.println(Name[i]);
		}
		
		System.out.println("======================================");
		
		//Using For Loop In Reverse Order.
		
		for(int i=Name.length-1;i>=0;i--)
		{
			System.out.println(Name[i]);
		}
		
	}

}
