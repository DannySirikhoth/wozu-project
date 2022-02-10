
public class Order {

	//methods assignment 1
	//initialize
	private int orderId ;
	private  Food orderedFoods;
	private String status;
	double totalPrice;
	Customer customer;
	
	private static int orderIdCounter;
	static
	{
		orderIdCounter = 100;
	}
	
	//constructor
	
	
	
	Order()
	{
		 setStatus("Ordered");
	}
	
	 Order (Food orderedFoods, Customer customer){
		this.orderedFoods = orderedFoods;
		this.customer = customer;
		orderIdCounter++;
	}
	
	Order(int orderID, Food orderedFoods)
	{
		this.setOrderId(orderID);
		this.setOrderedFoods(orderedFoods);
	}
	Order(int orderID, Food orderedFoods, String status)
	{
	this.setOrderId(orderID);
	this.setOrderedFoods(orderedFoods);
	this.setStatus(status);
	}
	
	//--------------Getter & Setter-----------
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public  Food getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(Food orderedFoods2) {
		this.orderedFoods = orderedFoods2;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	//Method--------------------------------------
	public double calculateTotalPrice(int unitPrice) {
		
		totalPrice = (unitPrice * .05) + unitPrice;
		
		System.out.println("Order Details");
		System.out.println("Order ID: " + getOrderId() );
		System.out.println("Ordered Food: " + getOrderedFoods() );
		System.out.println("Order Status: " + getStatus() );
		System.out.println("Total Price: " + totalPrice);
		return totalPrice;
	}

	
	public static int getTotalNumberofOrders() {
		
		return orderIdCounter - 100;
		
	}
	
	
}
