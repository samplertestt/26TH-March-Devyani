package Array_Study;

import java.util.Arrays;

public class Array_method {

	public static void main(String[] args) {
		//Sort--> This Is The Static Method
       
		
		//Declaration & initialization
		int rollNum[]= {5,3,4,1,2};
		
		//We Need To Sort RollNum In Sequence.
		
		Arrays.sort(rollNum);
		for(int i=0;i<=rollNum.length-1;i++)//Using For Loop In Forward Order
		{
			System.out.println(rollNum[i]);
		}
		
		System.out.println("================================");
		
		//Using For Loop In Reverse Order
		
		for(int i=rollNum.length-1;i>=0;i--)//Using For Loop In Reverse Order
		{
			System.out.println(rollNum[i]);
		}
		
		System.out.println("================================");
		
		//SPLIT Method
		
		String S="Velocity Corporate Training Center";
		
		String[] output=S.split(" ");
		for(int i=0;i<=output.length-1;i++)
		{
			System.out.println(output[i]);
		}
		
		
	}

}
