package Methods;

public class NonStaticMethod {

	public static void main(String[] args) 
	{
		//syntax- classname objectclass = new classname();
	 NonStaticMethod listening1=new  NonStaticMethod();//calling Non static method from same class

	 //the we create method or call method from same class
	 //objectname.methodname();
	 listening1.listening();
	 
	}
	public void listening()//method name
	
	{
		System.out.println("Hi I Am Non Static Method From Same Class");
	}
	
}
