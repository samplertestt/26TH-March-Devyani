package ControlStatement;

public class NestedIf_Study2 {

		
	public static void main(String[] args) 
	{
		int rollNo=20;
		char grade='A';

		if (rollNo==10)//outer loop
		{
			System.out.println("Roll No.is Valid");
		
		if(grade=='A')//inner loop
		{
			System.out.println("Grade Is valid");
		}
		else
		{
			System.out.println("Grade Is Invalid");
		}
		}
		else
		{
			System.out.println("Roll No.Is Invalid");
		}
		
		}  

	}

