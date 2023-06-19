// add "import" statement from java
import java.util.Scanner;

class Calculator {
              public static void main(String args[]){
	
	// Here we declare variables for our calculator 
	String name;
	char operator;
	double number1, number2;
	double result;

	//create an object of scanner class
	Scanner input = new Scanner(System.in);
	
	while (true) {

	//At this point we want to request user to choose an operator 
	System.out.println("Choose an operator: +, -, *, or /");
	System.out.println("Enter E to exit");

	operator = input.next().charAt(0);
	if (operator == 'E'){
	System.out.println("Thank you for using our Calculator! See you soon.");
	
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
		System.out.println(number1 + "+" + number2 + "=" +result);
		
	}
	
	//performs subtraction between numbers
	// checking if the operstor is "-"
	else if (operator == '-') {
		result = number1 - number2;
		System.out.println(number1 + "-" + number2 + "=" +result);
		
	}

	//performs multiplication between numbers
	// checking if the operstor is "*"
	else if (operator == '*') {
		result = number1*number2;
		System.out.println(number1 + "*" + number2 + "=" +result);
		
	}
	
	//performs division between numbers
	// checking if the operstor is "/"
	else if (operator == '/') {
		result =  number1 / number2;
		System.out.println(number1 + "/" + number2 + "=" +result);
		
	}
	
	//condition to display incorrect operator 
	else {
		System.out.println("Kindly confirm the operator you choose exist");
	}
	}

	 

	
}
}