
public class Employee {

	  // instance variables
    private String name;
    private double monthlySalary;
    private int age;

    // constructor
    public Employee() {
    }

    // constructor
    public Employee(String name, double monthlySalary, int age) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.age = age;
    }

    // method to calculate Annual Salary
    public void calculateAnnualSalary(){
        double percent = 0;
        double finalSalary = 0;
        if(age >= 18 && age <= 50){
            percent = 0.06*monthlySalary;
            finalSalary = monthlySalary + percent;
        }else if(age > 50 && age <= 60){
            percent = 0.07*monthlySalary;
            finalSalary = monthlySalary + percent;
        }
      
        System.out.println("Final Salary : $"+finalSalary);
    }

    //getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	



}
