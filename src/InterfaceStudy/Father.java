package InterfaceStudy;

public interface Father 
{ 
	//create interface for Father In Multiple Inheritance concept
  void Nature();
  default void Money()//we have a same method in Father And mother Interface then we create a method is A default Method  And Call using super Keyword In son class
  {
	  System.out.println("Father's Money");
  }
}
