package String_Class_Study;

public class String_Use3 {

	public static void main(String[] args) {
		// Contain Method()--> Here we Check Char Or Char Of sequence
		//Always return With Boolean Values
		
		String S="Devyani";
		System.out.println(S.contains("yani"));
		boolean Result = S.contains("Dev");//Here result Is reference Variable
		System.out.println("Result Is "+Result);
		
		System.out.println("==============================");
		
		System.out.println(S.contains("ina"));
		boolean Result1 = S.contains("ve");
		System.out.println("Result Is "+Result1);
		
		System.out.println("========================");
		
		//isEmpty method()-->here We Check String Is Empty Or not
		
		String m="INDIA";
		String n="";
		String l=" ";
		String o=null;
		
		System.out.println(m.isEmpty());
		System.out.println(n.isEmpty());
		System.out.println(l.isEmpty());
		//System.out.println(o.isEmpty());
		
		System.out.println("==========================");
		
		//isBlank method()-->here return boolean
		//isBlank method()-->if string is 0 or whitespace then boolean value is true otherwise return false
		
		String m1="INDIA";
		String n1="";
		String l1=" ";
		String o1=null;
		
		System.out.println(m1.isBlank());
		System.out.println(n1.isBlank());
		System.out.println(l1.isBlank());
		//System.out.println(o1.isBlank());
		
		System.out.println("===========================");
		
		//charAt()-->here we check to give the i/p as int & return char
		
		String I="INDIA";
		System.out.println(I.charAt(4));
		char requiredChar = I.charAt(1);
		System.out.println(requiredChar);
		
	
	}

}
