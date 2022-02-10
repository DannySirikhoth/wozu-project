
public class Validator {

    // method to validate name
    public boolean validateName(String name){
        if(name.length() > 8){
            return true;
        }else{
            return false;
        }
    }

    // method to validate age
    public boolean validateAge(int age){
        if(age >= 18 && age <= 60){
            return true;
        }else{
            return false;
        }
    }

    // method to validate employee
    public void validate(Employee employee) throws InvalidNameException, InvalidAgeException {
        if(!validateName(employee.getName())){
            throw new InvalidNameException("Invalid Name");
        }else if(!validateAge(employee.getAge())){
            throw new InvalidAgeException("Invalid Age");
        }
    }

}

// InvalidNameException class
class InvalidNameException extends Exception {

    public InvalidNameException(String s){
        super(s);
    }

}

// InvalidAgeException class
class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
        super(s);
    }
}
