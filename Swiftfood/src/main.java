
public class main {

	//methods exercise 1
	public static void main(String[] args) {
		
		int a = 12;
		int b = 8;
		int c = 15;
	Tester tess = new Tester();
	tess.findAverage(a,b,c);
	

	//methods asssignment 1
	Food food = new Food();
	food.setFoodName("Pizza margherita");
	food.setCuisine("Italian");
	food.setFoodType("veg");
	food.setQuantityAvailable(10);
	food.setUnitPrice(8.0);
	
	
	
	//methods assignment 2
	Restaraunt restaraunt = new Restaraunt("Mcdonalds",9988676767l,"SH1109, Carolina",4.1f);
	
	restaraunt.displayRestarauntDetails();
	
	//Constructor and this keyword assignment1
	System.out.println("*****************************");
	Order order1 = new Order(101, food);
	
	System.out.println("Status of Order 1: " + order1.getStatus());
	System.out.println("Status of Order 2: " + order1.getStatus());
	System.out.println("Id of Order 2: " + order1.getOrderId());
	System.out.println("Items Ordered in Order 2: " + order1.getOrderedFoods());
	
	//Constructor and this keyword assignment2
	System.out.println("*****************************");
	Restaraunt restaraunt2 = new Restaraunt("Mcdonalds",9988676767l,"D089, St Louis Street, Springfield",4.1f);
	restaraunt2.displayRestarauntDetails();
	
	//aggregation exercise
	System.out.println("You have ordered: " + order1.getOrderedFoods().getFoodName());
	
	
	 Address ad =new Address("43-1/5","ABC street","UK",12451);
	 Customer cz =new Customer("Mounika",74589612,ad);
     cz.displayCutomerDetails();
     System.out.println("The total price is : $"+ cz.payTotalPrice(20000.0));
     
     //Unit Testing and code coverage exercise 1
     // Creating object for Employee class
     Employee emp = new Employee("Maria Francis",2500.50,18);
    
     // Creating object for Validator class
     Validator validator = new Validator();
    
     // checking methods
     System.out.println(validator.validateName(emp.getName()));
     System.out.println(validator.validateAge(emp.getAge()));
     emp.calculateAnnualSalary();
		
		
		
	}}

