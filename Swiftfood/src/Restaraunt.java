
public class Restaraunt {
//initialize
	
	String restarauntName;
	long restarauntContact;
	String restarauntAddress;
	float rating;
	
	Restaraunt(String restarauntName, long restarauntContact, String restarauntAddress, float rating)
	{
		this.restarauntName = restarauntName;
		this.restarauntContact = restarauntContact;
		this.restarauntAddress = restarauntAddress;
		this.rating = rating;
		
	}
	
	
	public void displayRestarauntDetails() {
		
		System.out.println("Restaraunt Details");
		System.out.println("*******************");
		System.out.println("Restaraunt Name : " + restarauntName );
		System.out.println("Restaraunt Rating : " + rating );
		System.out.println("Restaraunt Contact : " + restarauntContact );
		System.out.println("Restaraunt Address : " + restarauntAddress);
	}
}
