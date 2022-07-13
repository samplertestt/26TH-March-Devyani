package Polymorphism;

public class Compile_Time {

	public static void main(String[] args) {
		Compile_Time CT=new Compile_Time();
		CT.Add();
		CT.Add(20, 50);
		CT.Add(1.5f, 1.5f, 1.5f);

	}
	public void Add()
	{
		int a=20;
		int b=50;
		int sum=a+b;
		System.out.println("Addition Is "+sum);
	}
	
	public void Add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition Is "+sum);
	}
	
	public void Add(float a,float b,float c)
	{
	
		float sum=a+b+c;
		System.out.println("Addition Is "+sum);
	}


}
