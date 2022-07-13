package Interview_Logical_Programme;

import java.util.Scanner;

public class Pailendrom_Practice {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The String");
    String str=sc.next();
    String org_str=str;
    
    String rev="";
    int len=str.length();
    for(int i=len-1;i>=0;i--)
    {
    	rev=rev + str.charAt(i);
    }
    System.out.println(rev);
    
    if(org_str.equals(rev))
    {
    	System.out.println("It Is A Pailendrom");
    }
    else
    {
    	System.out.println("It Is Not A Pailendrom");
    }
  	}

}
