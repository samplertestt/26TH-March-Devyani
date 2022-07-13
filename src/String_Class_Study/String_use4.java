package String_Class_Study;

import javax.lang.model.element.Name;

public class String_use4 {

	public static void main(String[] args) {
		// endsWith Method()-->Here string endsWith Specified Char And Return Boolean
		String Name="Yogesh";
		System.out.println(Name.endsWith("sh"));
		System.out.println("=================");
		System.out.println(Name.endsWith("og"));
		
		System.out.println("************************");
		
		//StartWith Method()-->Here string StartWith Specified Char And Return Boolean
		String Name1="Nashik";
		System.out.println(Name1.startsWith("Nash"));
		System.out.println(Name1.startsWith("shik"));
		boolean output= Name1.startsWith("Na");
		System.out.println(output);
		
		System.out.println("*************************");
		
		//substring Method()-->Return String
		String Name3="Devyani Shrijai Zambare";
		System.out.println(Name3.substring(8));
		System.out.println(Name3.substring(0, 15));
		String Result=Name3.substring(0, 23);
		System.out.println(Result);
		System.out.println("**************************");
		
		//Concat Method()-->Here We Compare 2 Strings And Return String
		String Name4="Devyani ";
		String Name5="patil ";
		System.out.println(Name4.concat("Devyani"));
		System.out.println(Name4.concat(Name5));
		String C1=Name5.concat(Name4);
		System.out.println(C1);
		
		System.out.println("*****************************");
		
		//indexOf Method()--> Here Pass The Char And Return Int Value
		
		String S1="India";
		System.out.println(S1.indexOf('I')); 
		System.out.println(S1.indexOf('n'));
		System.out.println(S1.indexOf('d'));
		
		System.out.println("****************************");
		
		//Last Method()--> Here Pass The Char And Return Int Value
		
		String S2="Velocity";
		System.out.println(S2.lastIndexOf('y'));
		System.out.println(S2.lastIndexOf("city"));
		System.out.println(S2.lastIndexOf('i'));
		System.out.println("******************************");
		
		//Replace Method()-->Here We Replace Char And Return String
		
        String S3="Automation Testing";
        System.out.println(S3.replace('n', 'o'));
        System.out.println(S3.replace('A', 'n'));
        System.out.println(S3.replace("Automation", "Manual"));
		
	}

}
