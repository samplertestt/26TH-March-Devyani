package LogicalProgramme_Pattern;

public class P13 {

	public static void main(String[] args) 
	{
//		*         *
//		**       **
//		***     ***
//		****   ****
//		***** *****
//		****   ****
//		***     ***
//		**       **
//		*         *
//row-->9 col-->12 star-->2 space-->4
		
		int star = 1; // Star on the first Row Left
		int space = 4; // Space on the first Row Left
		int star2 = 1; // Star on the first Row Right
		int space2 = 5; // Space on the first Row Right
		
		for(int i=1;i<=9;i++)//Outer for loop used for No. of Rows = 9
		{
			for(int j=1;j<=star;j++)// Inner For loop for Star(Left)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space;j++) // Inner For loop for space(Left)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=space2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++)
			{
				System.out.print("*");// Inner For loop for Star(Right)
			}
			System.out.println();
			if(i<5)
			{
				star++;
				space--;
				star2++;
				space2--;
			}
			else
			{
				star--;
				space++;
				star2--;
				space2++;
			}	
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
