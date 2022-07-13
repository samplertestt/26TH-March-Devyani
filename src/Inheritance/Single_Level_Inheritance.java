package Inheritance;

public class Single_Level_Inheritance {

	public static void main(String[] args) 
	{
		Mother M=new Mother();
		M.Love();//calling mother properties using mother object
	
		Mother.nature();//calling mother properties
		
		Son S=new Son();
		S.Mobile();//calling son properties using son object
		
		Son.Cycle();//calling son properties using son classname
		
		

	}

}
