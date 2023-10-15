package Application;

import java.time.LocalDate;
import java.time.LocalTime;

public class GuestCust extends Customers implements BillingInterface {
   
	private double deliveryCharge=50;
	public GuestCust(String custId, Name name, String email) {
        super(custId, name, email);
    }
	
	@Override
	public void payBill(double amount,String restName,String billMet) {
		LocalDate date=LocalDate.now();
    	LocalTime time=LocalTime.now();
    	System.out.println("Time: "+time);
    	System.out.println("Date: "+date);
    	System.out.println("Restaurant Name: "+restName);
    	System.out.println(billMet);
    	System.out.println("Total amount: "+amount);
    	System.out.println("Delivery Charge: "+deliveryCharge);
    	amount+=deliveryCharge;
    	System.out.println("Amount Paid: "+amount);
    	System.out.println();
		System.out.println("Guest customer "+this.name.fName+" "+this.name.mName+" "+this.name.lName+" paid " + amount+" after adding the delivery charge");
        System.out.println();
		System.out.println("To get big discounts on every order please become our premium member!!!");
        System.out.println();
		System.out.println("Thank You !");


	}

}
