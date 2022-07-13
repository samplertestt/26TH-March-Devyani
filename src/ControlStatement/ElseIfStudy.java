package ControlStatement;

public class ElseIfStudy {

	public static void main(String[] args) {
		//if marks >=60-->You Are In Distinction
		//else marks >=50-->You Are In 1st Class
		//else marks >=40-->You Are In Pass Class
		//else You Are Fail
		
	    int marks=70;
	    if(marks>=60) 
	    {
	    	System.out.println("You Are In Distinction");
	    }
	    else if(marks>=50)
	    {
	     System.out.println("You Are In 1st Class");
	    }
	    else if(marks>=40)
	    {
	    	System.out.println("You Are In Pass Class");
	    }
	    else
	    {
	    	System.out.println("You Are Fail");
	    }
	}

}
