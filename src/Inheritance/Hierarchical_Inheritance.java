package Inheritance;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Uncle_HI U=new Uncle_HI();
		U.JCB();
        U.Builder();
        
        Child1_HI C1=new Child1_HI();
        C1.Kindness();
        C1.Bike();
        
        Child2_HI C2=new Child2_HI();
        C2.Mobile();
        C2.Game();
	}

}
