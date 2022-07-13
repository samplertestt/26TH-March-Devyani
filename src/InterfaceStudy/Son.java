package InterfaceStudy;

public class Son implements Father,Mother
{

	public static void main(String[] args) 
	{
		Son S=new Son();//Create object For Son Class
		S.Nature();//Call Father Method By Using Son Object
		S.Receipe();//Call Mother Method By Using Son Object
		S.Money();

	}

	@Override
	public void Receipe()
	{
		System.out.println("Mother's Receipe");
		System.out.println("Mother Interface method completed in son class");
	}

	@Override
	public void Nature() 
	{
		System.out.println("Father's Nature");
	    System.out.println("Father Interface method completed in son class");
	}

	@Override
	public void Money() 
	{
		Father.super.Money();
		Mother.super.Money();
	}

}
