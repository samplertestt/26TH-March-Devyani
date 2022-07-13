package Interview_Logical_Programme;

import java.util.Scanner;

public class PrimeNumber_Sir {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
	    int num = sc.nextInt();
	    int count = 0;
	    
	    for(int i=2;i<num;i++)//12-->2;3;4;6
	    {
	    	if(num%i==0)
	    	{
	    		count++;
	    		break;
	    	}
	    }
    
	    if(count==1)
	    {
	    	System.out.println("Given number "+num+" is not a prime number");
	    }
	    else
	    {
	    	System.out.println("Given number "+num+" is a prime number");
	    }
	    
	    
	}
}


