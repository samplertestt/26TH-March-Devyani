package Interview_Logical_Programme;

import java.util.Scanner;

public class Pailendrome_Sir {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String a = sc.next();  //Original String
		String b = "";  //Blank String 
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Original Strin Is "+a);
		System.out.println("Reverse String Is "+b);
		
		if(a.equals(b))
		{
			System.out.println("String Is In Pailendrome");
		}
		else
		{
			System.out.println("String Is Not In Pailendrome");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    
	}

}
