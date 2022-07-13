package Interview_Logical_Programme;

import java.util.Scanner;

public class ReverseMiddleString {

	public static void main(String[] args) 
	{
		//reverse even position Strings
		String s = "I LOVE MY INDIA";
		
		String arr[] = s.split(" "); //{"I" "Love" "MY" "INDIA"}
		                           //  0    1     2     3
    
		for(int i=0;i<=arr.length-1;i++)
	{
			if(i%2!=0)
		{
			String s1 = arr[i];
			arr[i] = rev(s1);
		}
	}
		for(int i=0;i<=arr.length-1;i++ )
		{
			System.out.print(arr[i]+" ");
		}
	
	}
	

	private static String rev(String s1) 
	{
	   String rev = "";
	   for(int i=s1.length()-1;i>=0;i--)
	   {
		   rev = rev+s1.charAt(i);
	   }
	   return rev;
	}
	
}
