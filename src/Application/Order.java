package Application;
import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
	int orderId;
	LocalDate date;
	LocalTime time;
	String item;
	double totalPrice;
	public Order(int orderId,String item,double totalPrice) {
		this.orderId=orderId;
		this.item=item;
		this.totalPrice=totalPrice;
	}
	void displayData() {
		System.out.println(this.orderId);
		System.out.println(this.item);
		System.out.println(this.totalPrice);
		System.out.println(this.time);
		System.out.println(this.date);
	}
	void getData(LocalTime time, LocalDate date) {
		this.time=time;
		this.date=date;
	}
	
}
