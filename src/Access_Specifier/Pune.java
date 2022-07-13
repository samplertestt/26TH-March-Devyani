package Access_Specifier;

public class Pune {

	public static void main(String[] args) {
	 Velocity V=new Velocity();
	 //V.Test1();//We Can't Call Private member in Another Class
       V.Test2();//Calling Default Method-->visible Within Package
	   V.Test3();//Calling Protected Method-->visible Within Package(Inheritance will provide out of package)
	   V.Test4();//Calling Public Method -->visible throughout project
	}

}
