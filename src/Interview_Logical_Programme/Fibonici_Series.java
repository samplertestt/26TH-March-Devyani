package Interview_Logical_Programme;

public class Fibonici_Series {

	public static void main(String[] args) 
	{
		
		//Fibonici series Means
		//First Two number 0 & 1
		//it mean sum of first Two Number
		//Series Like 0+1=1;1+1=2;3+2=5;
		//Fibonici series = 1,2,3,4,5,8,13,21,34.......
		
		int A=0;
		int B=1;
		
		for(int i=1;i<=10;i++)
		{
			int C;
			C=A+B;
			System.out.println(" "+C);
			A=B;
			B=C;
		}
   
	}

}
