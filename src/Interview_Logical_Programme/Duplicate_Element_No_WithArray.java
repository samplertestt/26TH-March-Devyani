package Interview_Logical_Programme;

import java.util.Scanner;

public class Duplicate_Element_No_WithArray {

	public static void main(String[] args) 
	{
    /*
     * find duplicate element {2,6,8,2,7,9,5}
     * duplicate character is = 2
     */
	int arr[]= {2,6,8,2,7,9,5};
	for(int i=0;i<arr.length;i++)      //condition i=0 mean 2
	{
		for(int j=i+1;j<arr.length;j++)   //condition j=i+1 mean 2+1=6
		{
			if(arr[i]==arr[j])      //condition i==j mean compare i & j
			{
				System.out.println("Duplicate Character Is "+arr[i]);
			}
		}
	
	}	
	
	
	
	
	
	
	
	
	
	}

}
