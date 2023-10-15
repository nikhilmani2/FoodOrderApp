package Application;

public class Customers {
	public String custId;
	//protected String firstName;
	//private String lastName;
	protected Name name;
	private String email;
	private String phoneNumber;
	private Address address;
	private String custType;
	
	public Customers(String custId, Name name,String email) {
		this.custId=custId;
		//this.firstName=firstName;
		//this.lastName=lastName;
		this.name=name;
		this.email=email;
		
	}
	void displayData(){
		System.out.println(this.custId);
		//System.out.println(this.firstName);
		//System.out.println(this.lastName);
		System.out.println(this.name.fName+" "+this.name.mName+" "+this.name.lName);
		System.out.println(this.email);
		System.out.println(this.phoneNumber);
		System.out.println(this.address.Locality+", "+this.address.City+", "+this.address.State+", "+this.address.Country+", "+this.address.pinCode);
		System.out.println(this.custType);
	}
	void getData(String phoneNumber,Address address,String custType) {
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.custType=custType;
	}
	
	public void payBill(double amount,String restName,String billMet) {
        System.out.println("Customer "+this.name.fName+" "+this.name.mName+" "+ this.name.lName+" paid " + amount);

	}
}
