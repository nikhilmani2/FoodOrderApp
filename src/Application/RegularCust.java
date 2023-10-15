package Application;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegularCust extends Customers implements BillingInterface{
	 private double loyaltyPoints;

	    public RegularCust(String custId,Name name, String email) {
	        super(custId, name, email);
	        this.loyaltyPoints = 0;
	    }

	    public double getLoyaltyPoints() {
	        return loyaltyPoints;
	    }

	    public void addLoyaltyPoints(double loyaltyPoints) {
	        this.loyaltyPoints += loyaltyPoints;
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
	        double discountAmount = amount * 0.1;
	    	System.out.println("Discount Amount: "+discountAmount);
	        amount -= discountAmount;
	        double loyalityadd=amount*0.1;
	        addLoyaltyPoints(loyalityadd);
	        System.out.println("Your loyality points: "+getLoyaltyPoints());
	    	System.out.println("Amount Paid: "+amount);
	    	System.out.println();
	        System.out.println("Regular customer "+this.name.fName+" "+this.name.mName+" "+this.name.lName+" paid " + amount +" after a discount of "+ discountAmount);
	       System.out.println();
	        System.out.println("Thank You !");
	    }
}
