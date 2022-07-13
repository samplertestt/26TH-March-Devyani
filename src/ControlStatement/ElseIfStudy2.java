package ControlStatement;

public class ElseIfStudy2 {

	public static void main(String[] args) {
	  //if marks<=A then print You Are In 1st Class
		//if Marks <=B then print You Are In Pass Class
		//if Marks <=C then print You Are In 2nd Class
        //else You Are Fail
		
		char Marks='A';
		if(Marks<='A')
		{
			System.out.println("You Are In 1st Class");
		}
		else if(Marks<='B')
		{
			System.out.println("You Are In Pass Class");
		}
		else if(Marks<='C')
		{
			System.out.println("You Are In 2nd Class");
		}
		else
		{
			System.out.println("You Are Fail");
		}
	}

}
