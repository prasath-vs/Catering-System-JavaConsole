import java.util.*;
import java.lang.Math;
class Catering
{
	String NameOfEvent, CustomerName;
	int NumberOfMinutes, NumberOfGuests;
	int NumberOfServers, Test;
	double CostForOneServer, TotalFoodCost, AverageCost, Cost1, Cost2, DepositAmount,TotalCost;
	
	public void service()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Event: ");
		NameOfEvent = sc.next();
		System.out.println("Enter Customer Name: ");
		CustomerName = sc.next();
		System.out.println("Enter number of Guest: ");
		NumberOfGuests = sc.nextInt();
		System.out.println("Enter the number of minutes in the event: ");
		NumberOfMinutes = sc.nextInt();
		
		System.out.println("\n\tCATERING SERVICE");
		System.out.println("Event estimate for "+CustomerName);
		
		double CostPerHour = 50.50;
		double CostPerMinute = 5.40;
		double CostOfDinner = 70.70;
		
		Test = NumberOfGuests / 20;
		NumberOfServers = Math.round(Test);
		
		Cost1 = (NumberOfMinutes / 60) * CostPerHour;
		Cost2 = (NumberOfMinutes % 60) * CostPerMinute;
		CostForOneServer = Cost1 + Cost2;
		
		TotalFoodCost = NumberOfGuests * CostOfDinner;
		AverageCost = TotalFoodCost / NumberOfGuests;
		TotalCost = TotalFoodCost + (CostForOneServer * NumberOfServers);
		DepositAmount = TotalCost * 0.25;
		
		System.out.println("\nNumber of Servers: "+NumberOfServers);
		System.out.println("\nThe Cost per Server: "+CostForOneServer);
		System.out.println("\nThe Cost for Food is: "+TotalFoodCost);
		System.out.println("\nAverage Cost Per Person: "+AverageCost);
		System.out.println("\n\nTotal cost is: "+TotalCost);
		System.out.println("\nFood Avaliable: Veg starters, Veg Meals, drinks etc...");
		System.out.println("\nPlease deposite a 25% deposit to reserve the event");
		System.out.println("The deposit needed is: "+DepositAmount);
		System.out.println("\n\n\tTHANK YOU!!");
	}
	
	public void food()
	{
		System.out.println("\n\t---------");
		System.out.println("\n\tBREAKFAST");
		System.out.println("\n\t---------");
		System.out.println("\n\n 1. Idli");
		System.out.println("\n 2. Dosa (and its varieties)");
		System.out.println("\n 3. Appam");
		System.out.println("\n 4. Pongal (and its varieties)");
		System.out.println("\n 5. Medu Vada");
		System.out.println("\n 6. Upma");
		System.out.println("\n 7. Idiyappam");
		System.out.println("\n 8. Puttu");
		System.out.println("\n 9. Poori");
		System.out.println("\n 10. Adai");
		
		System.out.println("\n\n\t-----");
		System.out.println("\n\tLUNCH");
		System.out.println("\n\t-----");
		System.out.println("\n1. Sambar (Mixed veg sambar/Radish sambar/Drumstick sambar/Onion sambar)");
		System.out.println("\n2. Rasam");
		System.out.println("\n3. Curry (Potato curry, Brinjal curry, Raw banana curry)");
		System.out.println("\n4. Poriyal (Vendakkai poriyal, Mixed veg poriyal, Cabbage poriyal)");
		System.out.println("\n5. Kootu (Keerai kootu, cabbage kootu, Avial, Mixed veg kootu)");
		System.out.println("\n6. Pachadi (Gooseberry pachadi or simple carrot pachadi)");
		System.out.println("\n7. Pickle (Raw mango pickle,Gooseberry pickle)");
		System.out.println("\n8. Payasam");
		System.out.println("\n9. Vada (Urad dal vada, Masala vada)");
		System.out.println("\n10. Ice cream");
		
		System.out.println("\n\n\t------");
		System.out.println("\n\tDINNER");
		System.out.println("\n\t------");
		System.out.println("\n1. Idli");
		System.out.println("\n2. Dosa (and its varieties)");
		System.out.println("\n3. Poori with chickpea curry");
		System.out.println("\n4. Porotta");
		System.out.println("\n5. Naan with panner curry");
		System.out.println("\n6. Payasam");
		System.out.println("\n7. Ice cream");
	}
	
}

class CateringMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		Catering c = new Catering();
		do {
			System.out.println("\n\n\t\t\t\t--------------------------");
			System.out.println("\n\t\t\t\tCATERING MANAGEMENT SYSTEM");
			System.out.println("\n\t\t\t\t--------------------------");
			System.out.println("\n\t\t\t\t         PURE VEG");
			System.out.println("\n\t\t\t\t--------------------------");
			System.out.println("\n\t\t\t\t1. Book Catering Service");
			System.out.println("\n\t\t\t\t2. Available Food");
			System.out.println("\n\t\t\t\t3. Exit");
			System.out.println("\n\n\t\t\t\tEnter your option: ");
			n = sc.nextInt();
			
			switch(n)
			{
			case 1:
			{
				c.service();
				break;
			}
			case 2:
			{
				c.food();
				break;
			}
			}
			}while(n!=3);
	}
}
		
		
		