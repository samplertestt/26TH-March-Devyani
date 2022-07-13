package Inheritance;

public class Multilevel_Inheritance {

	public static void main(String[] args) 
	{
		Grandfather_MI GF=new Grandfather_MI();//Create object of super class of grandfather
		GF.Fram();//calling non-static method using grandfather class
		GF.Nature();//calling static method using grandfather class
      
		Father_MI F=new Father_MI();//Create object of super class of father
        F.Business();//calling non-static method using father class
        F.Money();//calling static method using father class
	
        Daughter_MI D=new Daughter_MI();//Create object of super class of Daughter
	    D.Dress();//calling non-static method using Daughter class
	    D.Cuteness();//calling static method using Daughter class
	
	}

}
