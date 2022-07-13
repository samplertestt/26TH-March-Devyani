package Array_Study;

public class String_Multidimensional {

	public static void main(String[] args) {
		//1 & 2.Declaration & initialization
		String Name[][]= {{"Velocity","Corporate", "Traning"},{"Center","Katraj","Pune" }};
		//3.Usage
	     for(int i=0;i<=1;i++)
	     {
	    	 for(int j=0;j<=2;j++)
	    	 {
	    		 System.out.print(Name[i][j]+"        ");
	    	 }
	    	 System.out.println(" ");
	     }
	}

}
