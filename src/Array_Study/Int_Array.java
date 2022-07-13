package Array_Study;

public class Int_Array {

	public static void main(String[] args) {
		//1,2.Declaration & Initialization
		
		int rollNum[]= {0,1,2,3,4,5};
		
	     for(int i=0;i<=rollNum.length-1;i++)//Dynamic coding using forward order
	     {
	    	 System.out.println(rollNum[i]);
	     }
	     
	     System.out.println("========================");
	     
	     for(int i=rollNum.length-1;i>=0;i--)//Dynamic coding using Reverse order
	     {
	    	 System.out.println(rollNum[i]);
	     }
	     
	}

}
