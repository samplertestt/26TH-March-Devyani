package LogicalProgramme_Pattern;

public class P9 {

	public static void main(String[] args) 
	{
//     *****
//	   ****
//     ***
//     **
//     *
//     **
//     ***
//     ****
//     *****
//row-->9 	col-->5  Star-->5
		
		int star = 5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
