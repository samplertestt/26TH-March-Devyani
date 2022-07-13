package Interview_Logical_Programme;

import java.util.Scanner;

public class ReverseString_Sir {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String a = sc.next();   //original String
		String b = "";  //Blank String
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Original String Is "+a);
		System.out.println("Reverse String Is "+b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
