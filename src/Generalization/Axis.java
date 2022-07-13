package Generalization;

public class Axis implements RBI
{

	@Override
	public void loan() 
	{
		System.out.println("Loan Rate Of Axis Bank Is 8.9%");
	}

	@Override
	public void withDraw() 
	{
		System.out.println("Axis Bank WithDraw Limit Is 50k");
	}

	@Override
	public void Deposite() 
	{
		System.out.println("Axis Bank Deposite Limit Is 70k");
	}

}

