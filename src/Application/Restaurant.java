package Application;

public class Restaurant {
	private int restaurantId;
	String restName;
	private Address restAdd;
	
	Restaurant(int restaurantId,String restName,Address restAdd){
		this.restaurantId=restaurantId;
		this.restName=restName;
		this.restAdd=restAdd;
	}
	void showRestDetails() {
		System.out.println(this.restaurantId);
		System.out.println(this.restName);
		System.out.println(this.restAdd.Locality+", "+this.restAdd.City);
	}
}
