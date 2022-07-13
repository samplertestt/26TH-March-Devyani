package Interview_Logical_Programme;

import java.util.Scanner;

public class EvenOddNumber_Sir {

	public static void main(String[] args) 
	{
		// num/2 rem-->0-->even
		
		System.out.println(10%2); //0
		System.out.println(10/2); //5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Given Number Is Even Number");
		}
		else
		{
			System.out.println("Given Number Is Odd Number");

		}
	}

}
