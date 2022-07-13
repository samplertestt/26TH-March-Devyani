package Casting;

public class Up_Casting {

	public static void main(String[] args) 
	{
		Son_Upcasting S=new Son_Upcasting();
		S.Bike();
		S.Car();
		S.Education();
		
		System.out.println("===========================");
		
		Father_Upcasting F=new Father_Upcasting();
		F.Bike();
		F.Car();
		
		System.out.println("===========================");
		
		Father_Upcasting F1=new Son_Upcasting();//Up casting
		F1.Bike();
		F1.Car();
		//Here We Can't Call Education Method  
		
	}

}
