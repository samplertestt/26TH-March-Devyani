package Interview_Logical_Programme;

import java.util.Scanner;

public class Swapping_TwoNo {

	public static void main(String[] args) {
        //13.Swapping Two No.Without Using Third Variable
		int a;
		int b;
		System.out.println("Enter The Two Numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();    //ex.100 Input Value Store
	    b = sc.nextInt();    //200
	    System.out.println("Before Swapping "+a+" "+b);
	    a = a+b;  //a=100 b= 200 [100+200] (a=300)
	    b=a-b;   //a=300 b=200 [300-200]  (b=100)
	    a=a-b;   //a=300 b=100 [300-100](a=200)
	    System.out.println("After Swapping "+a+" "+b );

	}

}
