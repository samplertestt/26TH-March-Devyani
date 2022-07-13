package String_Class_Study;

public class String_Use2 {

	public static void main(String[] args) {
		// equals method study
		
		String S1="Velocity";
		String S2="Velocity";
		String S3="Velocity";
		String S4="Velocity";
		
		
		//== will compare memory location that will not compare String Content
		System.out.println(S1==S2);//memory location compare always
		System.out.println(S1==S3);
		System.out.println(S1==S4);
		
		System.out.println("===============================");
		
		String S5="velocity";
		System.out.println(S1==S5);
		
		System.out.println("===============================");
		
		
		//.equals will compare content of string it will be return boolean value
		//or equals will compare content of string
		
		System.out.println(S1.equals(S3));
		System.out.println(S1.equals(S4));
		
		System.out.println("===============================");
		
		//equalIgnoreCase()--> Here we ignore the character is capital or small return Boolean Value
         
		S1.equalsIgnoreCase(S5);
		System.out.println(S1.equalsIgnoreCase(S5));
		
		
	}

}
