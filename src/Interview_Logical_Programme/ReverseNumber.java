package Interview_Logical_Programme;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Is: ");
        int num = sc.nextInt();
        //int No.123
        int revnum=0;
        for(int i=num;i>0;i=i/10)
        {
        	int rem=i%10;
        	revnum	= revnum*10+rem;
        }
        System.out.println("Reverse Number Is :-"+revnum);
	}

}
