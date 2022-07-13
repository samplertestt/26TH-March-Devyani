package Parameter;

public class MetroStation {

	public static void main(String[] args) 
	{
		MetroStation MS = new MetroStation();//Create Object For Same Class
		MS.StationInfo();//Calling Method Without Parameter
		MS.StationInfo("Mumbai","LokmannyaTilakExpress", 7, 1, 'c');//Calling Method With Parameter
		MS.StationInfo("Nagpur","GitanjaliExpress", 5, 3,'b');//Calling Method With Parameter
	
	}
	
	public void StationInfo() //Non-Static regular Method Without Parameter
	
	{
		//StationName, TrainName , PlatForm No., Ticket Counter, Reservation Grade
		String StationName = "Nashik Road";
		String TrainName ="Rajdhani Express";
		int PlatFormNo=5;
		int TicketCounter=2;
		char ReservationGrade='A';
		System.out.println("===========================");
		System.out.println("StationName Is "+StationName);
		System.out.println("TraninName Is "+TrainName);
		System.out.println("PlatForm No.Is "+PlatFormNo);
		System.out.println("Ticket Counter Is "+TicketCounter);
		System.out.println("Reservation Grade Is "+ReservationGrade);
		System.out.println("===========================");
		
	}
	
	public void StationInfo(String StationName,String TrainName,int PlatFormNo,int TicketCounter,char ReservationGrade) //Method With Parameter	
	{
		System.out.println("===========================");
		System.out.println("StationName Is "+StationName);
		System.out.println("TraninName Is "+TrainName);
		System.out.println("PlatForm No.Is "+PlatFormNo);
		System.out.println("Ticket Counter Is "+TicketCounter);
		System.out.println("Reservation Grade Is "+ReservationGrade);
		System.out.println("===========================");
	}

}
