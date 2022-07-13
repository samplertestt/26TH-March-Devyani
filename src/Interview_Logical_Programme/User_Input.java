package Interview_Logical_Programme;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value :- ");
        int a = sc.nextInt();
        
        System.out.println("Enter The value Of a");
	    int b = sc.nextInt();
	    
	    int sum=a+b;
	    System.out.println("Sum Is "+sum);

	}

}
