package selenium.week_1;

public class webDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	        String firstName = "John";
	        String lastName = "Doe";
	        int age = 30;
	        
	        // Using the concatenation operator (+)
	        String fullName = firstName + " " + lastName;
	        System.out.println("Full Name: " + fullName);
	        
	        // Using the concat() method
	        String info = fullName.concat(" is " + age + " years old.");
	        System.out.println("Info: " + info);
	    }
	}



