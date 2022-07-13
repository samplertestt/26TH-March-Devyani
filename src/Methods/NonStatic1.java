package Methods;

public class NonStatic1 {

	public static void main(String[] args) 
	{
		NonStatic1 ABC=new NonStatic1();//obj.creation (sysntax - classname obj name=new classname();)
		
		ABC.Resistor();//Method calling(syntax - obj name.methodname();)

		NonStatic2 XYZ= new NonStatic2();//obj.creation with different class (sysntax - classname obj name=new classname();)
		XYZ.House();//Method calling With Different class(syntax - obj name.methodname();)
	}
	
	public void Resistor()//Non Static Regular Method
	{
		System.out.println("RESISTOR UNIT IS OHM");
	}

}
