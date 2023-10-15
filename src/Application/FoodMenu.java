package Application;

public class FoodMenu {
	static String rest_name;
	private int menuID;
	private String foodName;
	private double foodPrice;
	private String category;
	
	static void setRes() {
		rest_name="Chowka";
	}
	 
	FoodMenu(int menuID,String foodName){
		this.menuID=menuID;
		this.foodName=foodName;
	}
	
	void getData(double foodPrice,String category) {
		this.foodPrice=foodPrice;
		this.category=category;
	}
	void displayData() {
		System.out.println(this.menuID);
		System.out.println(this.foodName);
		System.out.println(this.foodPrice);
		System.out.println(category);
		System.out.println(rest_name);
	}
	
}
