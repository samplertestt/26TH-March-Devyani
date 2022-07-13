package Interview_Logical_Programme;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args)
	{
		//123=1^3+2^3+3^3=1+8+27=36
		//153=1^3+5^3+3^3=1+125+27=153
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value:- ");
		int num = sc.nextInt();
		
		int num1=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem = i%10;
			num1=num1+(rem*rem*rem);
			
		}
		//System.out.println(num1);

		if(num==num1)
		{
			System.out.println("Given Number Is Amstrong Number "+num);
		}
		else
		{
			System.out.println("Given Number Is Not Amstrong Number "+num);

		}
	}

}
