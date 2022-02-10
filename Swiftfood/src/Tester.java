
public class Tester {

	
	
		// Invoke the method findAverage of the Calculator class and display the average
		//methods exercise 1
		public void findAverage(int i, int a, int c)
		{
			double average = (i + a + c)/3.0;
			average = average * Math.pow(10, 2);
			average = Math.floor(average);
			average = average/Math.pow(10, 2);
		    
			
			System.out.println(average);
		}
	
}
