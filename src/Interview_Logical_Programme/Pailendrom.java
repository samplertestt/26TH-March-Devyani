package Interview_Logical_Programme;

import java.util.Scanner;

public class Pailendrom {

	public static void main(String[] args) {
     //String Pelendrom Programme
    //i.e if You Enter Madam-->reverse Also--> madam i.e pailndrom
    //i.e if You Enter Welcome-->reverse -->emoclew-->i.e not Pailndrom
		
		Scanner sc = new Scanner(System.in);//Scanner Object Create sc
		System.out.println("Enter The String");
	    
		String str = sc.next();//Accept string From User
	    String Org_str = str;//get string From And Store in str(Original String)
	    
	    String rev="";
	    int len=str.length();//Find Lenghth Of String
	    for(int i=len-1;i>=0;i--)//All Char From String
	    {
	    	rev=rev + str.charAt(i);//Reverse String Print
	    }
	    System.out.println(rev);
	    
	    if(Org_str.equals(rev))//Both Are Equals Then Condition True
	    {
	    	System.out.println("It Is A Pailendrom");
	    }
	    else
	    {
	    	System.out.println("It Is Not A Pailendrom");

	    }
	    
	    
	    
	    
	    
	    
	}

}
