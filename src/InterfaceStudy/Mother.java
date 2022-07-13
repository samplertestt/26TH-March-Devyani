package InterfaceStudy;

public interface Mother
{
	//create interface for Mother In Multiple Inheritance concept
    void Receipe();
    default void Money()//we have a same method in Father And mother Interface then we create a method is A default Method And Call using super Keyword In son class
    {
    	System.out.println("Mother's Money");
    }

}
