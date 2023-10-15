package Application;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class AppMenu {
	void menu_one() {
		System.out.println("Welcome to Food Order App");
		System.out.println("Are you already a customer ? (0/1)");
		int custchoice;
		Scanner sc =new Scanner(System.in);
		custchoice=sc.nextInt();
		//sc.close();
		if(custchoice==0) {
			menu_notcustomer();
		}
		else if(custchoice==1) {
			menu_already();
		}
		else {
			System.out.println("Wrong Choice!!!");
		}
		
	}
	void menu_already() {
		String str;
		System.out.println("Enter your Customer ID: ");
		Scanner sc = new Scanner(System.in);
		str=sc.next();
		//sc.close();
		//FoodOrderApp f1=new FoodOrderApp();
		//f1.calling(str);
		if(str.charAt(0)=='g') {
			Address a2=new Address("DB Road","Saharsa","Bihar","India",852121);
			Name n2=new Name("Raj","M","Kapoor");
			GuestCust g=new GuestCust("g1",n2,"raj34@gmail.com");
			g.getData("975453334",a2,"Guest");
			food_menu_general(g);
		}
		else if(str.charAt(0)=='r') {
			Name n1= new Name("Nikhil","S","Mani");
			Address a1=new Address("Vidyapuri","Madhepura","Bihar","India",852113);
			RegularCust r=new RegularCust("r1",n1,"nimani.ext@deloitte.com");
			r.getData("975453334",a1,"Regular");
			food_menu_general(r);
		}
		else {
			Address a3=new Address("Panchsheel Park","Varanasi","Uttar Pradesh","India",456443);
			Name n3=new Name("Mayank","B","Mishra");
			PremiumCust p=new PremiumCust("p1",n3,"mmishra@gmail.com");
			p.getData("975453335",a3,"Premium");
			food_menu_general(p);
		}
		//food_menu_general(ct);
	}
	void menu_notcustomer() {
		System.out.println("Signing up for the Food Order App");
		Name nametemp=new Name(null, null, null);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		nametemp.fName=sc.next();
		System.out.println("Enter your middle Name: ");
		nametemp.mName=sc.next();
		System.out.println("Enter your last name: ");
		nametemp.lName=sc.next();
		Address addresstemp=new Address(null, null, null, null, 0);
		System.out.println("Enter your locality: ");
		addresstemp.Locality=sc.next();
		System.out.println("Enter your City: ");
		addresstemp.City=sc.next();
		System.out.println("Enter your State: ");
		addresstemp.State=sc.next();
		System.out.println("Enter your Country: ");
		addresstemp.Country=sc.next();
		System.out.println("Enter your Pincode: ");
		addresstemp.pinCode=sc.nextLong();
		String phoneNum;
		System.out.println("Enter your phone number: ");
		phoneNum=sc.next();
		String email;
		System.out.println("Enter your email: ");
		email=sc.next();
		//
	
		//
		String custType="Guest";
		String custidtoken="g";
		int gcount=1;
		String custid=custidtoken+ (Integer.toString(++gcount));
		GuestCust ct=new GuestCust(custid,nametemp,email);
		ct.getData(phoneNum, addresstemp, custType);
		System.out.println("Sign up Successfull!!");
		//sc.close();
		food_menu_general(ct);
	}
	void food_menu_general(Customers ct) {
		System.out.println("1. Vegeterian Menu");
		System.out.println("2. Non-Veg Mneu");
		int choiceofmenu;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Choice (1/2) :");
		choiceofmenu=sc.nextInt();
		//sc.close();
		if(choiceofmenu==1) {
			veg_menu(ct);
		}
		else if(choiceofmenu==2) {
			non_veg_menu(ct);
		}
		else {
			System.out.println("Wrong Choice!!!");
		}
	}
	
	void veg_menu(Customers ct) {
		//menu show kro
		String[] vegItems = {"Paneer Tikka Masala", "Dal Makhani", "Vegetable Biryani", "Malai Kofta", "Aloo Gobi"};
        double[] vegItemPrices = {20, 20, 15, 25, 10};

        // Display the veg menu
        System.out.println("Welcome to the Veg Menu!");
        for (int i = 0; i < vegItems.length; i++) {
            System.out.println((i + 1) + ". " + vegItems[i] + " - Rs " + vegItemPrices[i]);
        }
		//uske baad pucho usse ki konsa chiz lena hai
        System.out.println("Enter your choice: ");
		Scanner sc =new Scanner(System.in);
		int foodchoice;
		foodchoice=sc.nextInt()-1;
		int quantity;
		System.out.println("Enter Quantity: ");
		quantity=sc.nextInt();
		double amount=quantity*vegItemPrices[foodchoice];
		//sc.close();
		String billMet=vegItems[foodchoice]+" * "+quantity+" = "+amount;
		
		Address roneadd=new Address("Ward 21", "Madhepura", "Bihar", "India", 852113);
		Restaurant re1=new Restaurant(1,"Zaika",roneadd);
		
		Address rtwoadd=new Address("Yadav Chowk", "Saharsa", "Bihar", "India", 852121);
		Restaurant re2=new Restaurant(1,"Amritpaan",rtwoadd);
		
		Address rthreeadd=new Address("Post Office Road", "Madhepura", "Bihar", "India", 782113);
		Restaurant re3=new Restaurant(1,"Amrit",rthreeadd);
		
		Address rfouradd=new Address("Subhas Chowk", "Murliganj", "Bihar", "India", 183649);
		Restaurant re4=new Restaurant(1,"Makhan Bhog",rfouradd);
		
		Address rfiveadd=new Address("B.P. Mandal Chowk", "Tikuliya", "Bihar", "India", 9073730);
		Restaurant re5=new Restaurant(1,"Chowka",rfiveadd);
		String restName=null;
		switch(foodchoice+1) {
		case 1:
			restName=re1.restName;
			break;
		case 2:
			restName=re2.restName;
			break;
		case 3:
			restName=re3.restName;
			break;
		case 4:
			restName=re4.restName;
			break;
		case 5:
			restName=re5.restName;
			break;
		default:
			restName="NULL";
		}
		
		Order o=new Order(1,billMet,amount);
		o.getData(LocalTime.now(), LocalDate.now());
		ct.payBill(amount,restName,billMet);

		//phir quantity pucho
		//phir order class bula lo
		//phir paybill bulao according to type of customer
	}
	
	void non_veg_menu(Customers ct) {
		//menu show kro
		 String[] nonVegItems = {"Chicken Tikka Masala", "Butter Chicken", "Mutton Biryani", "Fish Curry", "Tandoori Chicken"};
	        double[] nonVegItemPrices = {20, 15, 25, 50, 10};

	        // Display the non-veg menu
	        System.out.println("Welcome to the Non-Veg Menu!");
	        for (int i = 0; i < nonVegItems.length; i++) {
	            System.out.println((i + 1) + ". " + nonVegItems[i] + " - Rs" + nonVegItemPrices[i]);
	        }
		//uske baad pucho usse ki konsa item lena hai
	        System.out.println("Enter your choice: ");
			Scanner sc =new Scanner(System.in);
			int foodchoice;
			foodchoice=sc.nextInt()-1;
			int quantity;
			System.out.println("Enter Quantity: ");
			quantity=sc.nextInt();
			double amount=quantity*nonVegItemPrices[foodchoice];
			//sc.close();
			String billMet=nonVegItems[foodchoice]+" * "+quantity+" = "+amount;
			
			Address roneadd=new Address("Ward 21", "Madhepura", "Bihar", "India", 852113);
			Restaurant re1=new Restaurant(1,"Zaika",roneadd);
			
			Address rtwoadd=new Address("Yadav Chowk", "Saharsa", "Bihar", "India", 852121);
			Restaurant re2=new Restaurant(1,"Amritpaan",rtwoadd);
			
			Address rthreeadd=new Address("Post Office Road", "Madhepura", "Bihar", "India", 782113);
			Restaurant re3=new Restaurant(1,"Amrit",rthreeadd);
			
			Address rfouradd=new Address("Subhas Chowk", "Murliganj", "Bihar", "India", 183649);
			Restaurant re4=new Restaurant(1,"Makhan Bhog",rfouradd);
			
			Address rfiveadd=new Address("B.P. Mandal Chowk", "Tikuliya", "Bihar", "India", 9073730);
			Restaurant re5=new Restaurant(1,"Chowka",rfiveadd);
			String restName=null;
			switch(foodchoice+1) {
			case 1:
				restName=re1.restName;
				break;
			case 2:
				restName=re2.restName;
				break;
			case 3:
				restName=re3.restName;
				break;
			case 4:
				restName=re4.restName;
				break;
			case 5:
				restName=re5.restName;
				break;
			default:
				restName="NULL";
			}
			Order o=new Order(1,billMet,amount);
			o.getData(LocalTime.now(), LocalDate.now());
			ct.payBill(amount,restName,billMet);

		//phir quantity pucho
		//phir order class bula lo
		//phir pay bill bulao according to customer
	}
}