package Array_Study;

public class MultiDimensional_array {

	public static void main(String[] args) {
		//Using Static Array
		//Declaration
		int A[][]=new int [2][2];
		//Assign The Value Of Array
		A[0][0]=1;
		A[0][1]=2;
		A[1][0]=3;
		A[1][1]=4;
		
		//Usage
		System.out.println(A[0][0]);
        System.out.println(A[0][1]);
        System.out.println(A[1][0]);
        System.out.println(A[1][1]);
        
        System.out.println("==================================");
        //using for Loop
        for(int i=0;i<=1;i++)
        {
        	for(int j=0;j<=1;j++)
        	{
        		System.out.print(A[i][j]+" ");
        		
        	}
        	System.out.println("");
        }
	}
       
}
