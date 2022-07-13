package Methods;

public class Static1 {

	public static void main(String[] args) 
	{
	 // syntax For Regular static Method In Same Class - MethodName();
		run();//calling static regular method from same class
     //syntax For regular Static Method In Diff.Class - classname.methodname();
		Static2.stop();
		stop();
		Static2.Display();
		
	}
	public static void run() //REGULAR STATIC METHOD
	{
		System.out.println("HI I'M REGULAR STATIC METHOD WITH SAME CLASS");
	}
    public static void stop()
    {
    	System.out.println("MY STOP NAME IS DWARKA");
    }
}
