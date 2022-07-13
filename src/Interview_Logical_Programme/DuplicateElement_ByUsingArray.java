package Interview_Logical_Programme;

public class DuplicateElement_ByUsingArray {

	public static void main(String[] args) {
    //Duplicate Elements In an Array
		String Arr[]= {"Devyani","Shrijai","Devyani","Yogesh","Janhavi"};
		
		//Using For Loop
		for(int i=0;i<Arr.length;i++)//Outer For Loop
		{
			for(int j=i+1;j<Arr.length;j++)
			{
				if(Arr[i]==Arr[j])
				{
					System.out.println("Duplicate Element Is "+Arr[i]);
				}
			}
		}
	}

}
