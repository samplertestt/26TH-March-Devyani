package ControlStatement;

public class NestedIf_Study {

	public static void main(String[] args) 
	{
		//if UN is Valid-->enter PWD
		//if PWD is Valid -->login success
		//else PWD is Invalid -->incorrect PWD
		//else UN is Invalid -->incorrect UN
        
		String UN="velocity";
		String PWD="velocity@123";
		
		if (UN=="velocity")//outer loop
		{
			System.out.println("Enter Password");
		
			if(PWD=="velocity@123")//Inner Loop
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Incorrect PWD");
		}
		}
	
		else 
		{
			System.out.println("Incorrect UN");
		}
	

	}

}
