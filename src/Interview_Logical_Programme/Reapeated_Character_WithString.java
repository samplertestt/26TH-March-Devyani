package Interview_Logical_Programme;

import java.util.Scanner;

public class Reapeated_Character_WithString {

	public static void main(String[] args)
	{
		//find the repeat character using given string
		
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter The String: ");
	  
	  String str = sc.next();
	  
	  int Length = str.length();
	  char CH[] = str.toCharArray();
	  
	  for(int i=0;i<Length;i++)
	  {
		  for(int j=i+1;j<Length;j++)
		  {
			  if(CH[i]==CH[j])
			  {
				  System.out.println("Repetative Char Is "+CH[j]);
			      break;
			  }
		  }
	  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
