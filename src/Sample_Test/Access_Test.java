package Sample_Test;

import Access_Specifier.Velocity;

public class Access_Test extends Velocity
{

	public static void main(String[] args) {
	   Velocity V=new Velocity();
	  
	  // V.Test();//Calling Private Method-->visible Only within class
	  // V.Test2();//Calling Default Method-->visible Within Package
	  // V.Test3();//Calling Protected Method-->visible Within Package(inheritance will provide out of package)
	     V.Test4();//Calling Public Method -->visible throughout project
		
	  Access_Test AT=new Access_Test();
	  AT.Test3();
	  AT.Test4();
	}
	

}
