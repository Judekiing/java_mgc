// add "import" statement from java
/*  
Obi is a boy.
Simbi is a girl.

*/
import java.util.Scanner;

class Calculator {
              public static void main(String args[]){
	
	// Here we declare variables for our calculator 
	
	String firstName ="";
	String lastName = "";
	char operator;
	double number1, number2;
	double result;
	

	//create an object of scanner class
	Scanner input = new Scanner(System.in);
	
	//At this point we want to request user first name 
	System.out.println("First Name");
	firstName = input.next();

	//At this point we want to request user last name 
	System.out.println("Last Name");
	lastName = input.next();
	
	String fullName = firstName + lastName;
	System.out.println(" ");
	System.out.println("Welcome "+fullName + "!");
	
	while (true) {

	//At this point we want to request user to choose an operator 
	System.out.println(" ");
	System.out.println("Choose an operator: +, -, *,  / or");
	System.out.println("Enter E to exit");

	operator = input.next().charAt(0);
	if (operator == 'E'){
	System.out.println( "Thank you for using our Calculator, " + firstName +"! See you soon.");
	
		break;
	}

	//ask users to enter numbers
	System.out.println("Enter first value");
	number1 = input.nextInt();

	System.out.println("Enter second value");
	number2 = input.nextInt();
	
	//performs addition between numbers
	// checking if the operstor is "+"
	if (operator == '+') {
		result = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " +result);
		
	}
	
	//performs subtraction between numbers
	// checking if the operstor is "-"
	else if (operator == '-') {
		result = number1 - number2;
		System.out.println(number1 + " - " + number2 + " = " +result);
		
	}

	//performs multiplication between numbers
	// checking if the operstor is "*"
	else if (operator == '*') {
		result = number1*number2;
		System.out.println(number1 + " * " + number2 + " = " +result);
		
	}
	
	//performs division between numbers
	// checking if the operstor is "/"
	else if (operator == '/') {
		result =  number1 / number2;
		System.out.println(number1 + " / " + number2 + " = " +result);
		
	}
	
	//condition to display incorrect operator 
	else {
		System.out.println(firstName +" Kindly confirm the operator you choose exist");
	}
	}

	 

	
}
}
