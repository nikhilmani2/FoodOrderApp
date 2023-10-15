package Application;

public class FoodOrderApp{

	public static void main(String[] args) {
		Name n1= new Name("Nikhil","S","Mani");
		Address a1=new Address("Vidyapuri","Madhepura","Bihar","India",852113);
	    RegularCust c1 = new RegularCust("r1",n1,"nimani.ext@deloitte.com");
		c1.getData("975453334",a1,"Regular");
		
		
		Address a2=new Address("DB Road","Saharsa","Bihar","India",852121);
		Name n2=new Name("Raj","M","Kapoor");
		GuestCust c2 = new GuestCust("g1",n2,"raj34@gmail.com");
		c2.getData("975453334",a2,"Guest");
		
		
		Address a3=new Address("Panchsheel Park","Varanasi","Uttar Pradesh","India",456443);
		Name n3=new Name("Mayank","B","Mishra");
		PremiumCust c3 = new PremiumCust("p1",n3,"mmishra@gmail.com");
		c3.getData("975453335",a3,"Premium");
		
		
		AppMenu a=new AppMenu();
		a.menu_one();
		
	}

}
