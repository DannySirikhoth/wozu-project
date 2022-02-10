
public class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public Address address;

	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}

	 Customer(String customerName,long contactNumber,Address address){
	       this.customerName=customerName;
	       this.contactNumber=contactNumber;
	       this.address=address;
	   }
	  
	 Customer(String customerId, String customerName,long contactNumber,Address address){
	       this.customerName=customerName;
	       this.contactNumber=contactNumber;
	       this.address=address;
	   }

	public String getCustomerid() {
	       return customerId;
	   }
	   public void setCustomerid(String customerid) {
	       this.customerId = customerid;
	   }
	   public String getCustomerName() {
	       return customerName;
	   }
	   public void setCustomerName(String customerName) {
	       this.customerName = customerName;
	   }
	   public long getContactNumber() {
	       return contactNumber;
	   }
	   public void setContactNumber(long contactNumber) {
	       this.contactNumber = contactNumber;
	   }
	   public Address getAddress() {
	       return address;
	   }
	   public void setAddress(Address address) {
	       this.address = address;
	   }
	   public void displayCutomerDetails() {//DISPLAY ALL DETAILS ABOUT CUSTOMER
	       System.out.println("Customer id: "+customerId);
	       System.out.println("Customer name: "+customerName);
	System.out.println("Customer mobile Number: "+contactNumber );
	System.out.println("Cutomer Address is: ");
	System.out.println("Door No: "+address.doorNo+", Street "+address.street+", city: "+address.city+", zipcode: "+address.zipcode);
	   }
	   public double payBill(double totalPrice) {
	       return totalPrice;  
	       
	   }

	public String payTotalPrice(double d) {
		// TODO Auto-generated method stub
		System.out.println("total price payed");
		return null;
	}
}
