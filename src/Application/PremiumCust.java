package Application;

import java.time.LocalDate;
import java.time.LocalTime;

public class PremiumCust extends Customers implements BillingInterface {
	private double loyaltyPoints;

	private double discountPercentage;

    public PremiumCust(String custId, Name name, String email) {
        super(custId, name, email);
        this.discountPercentage = 0.2;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
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
    	System.out.println("Discount Percentage: "+(discountPercentage*100));
        double discountAmount = amount * discountPercentage;
        amount -= discountAmount;
        double loyalityadd=amount*0.2;
        addLoyaltyPoints(loyalityadd);
        System.out.println("Your loyality points: "+getLoyaltyPoints());
    	System.out.println("Amount Paid: "+amount);
    	System.out.println();
        System.out.println("Premium customer "+this.name.fName+" "+this.name.mName+" "+this.name.lName+" paid "+ amount +" after a discount of "+ discountAmount);
        System.out.println();
        System.out.println("Thank You !");

        
    }

}
