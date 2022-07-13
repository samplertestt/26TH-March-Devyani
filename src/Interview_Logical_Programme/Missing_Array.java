package Interview_Logical_Programme;

public class Missing_Array {

	public static void main(String[] args) 
	{
		int Arr[]= {1,2,4,5};
		int sum = 0;
		
		for(int i=0;i<Arr.length;i++)
		{
			sum = sum + Arr[i];
		}
		//System.out.println("Missing Element Is "+sum);
    
	   int sum1=0;
	   for(int j=1;j<=5;j++)
	   {
		   sum1 = sum1+j;
	   }
	   //System.out.println("Missing Element Is "+sum1);
	   System.out.println("Missing Element Is "+(sum1-sum));

	}

}
