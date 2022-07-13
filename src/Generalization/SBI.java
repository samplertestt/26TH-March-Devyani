package Generalization;

public class SBI implements RBI
{

	@Override
	public void loan()
	{
		System.out.println("Loan Rate Of SBI Is 9.8%");
	}

	@Override
	public void withDraw() 
	{
	System.out.println("SBI WithDraw Limit Is 25k");
	}

	@Override
	public void Deposite() 
	{
		System.out.println("SBI Deposite Limit Is 75k");
	}

}
