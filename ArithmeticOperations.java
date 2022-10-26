package Assignment2;

import java.util.Scanner;

/*Create a program that prints out the operations +, -, * and / 
 * for two randomly picked numbers. 
 * (NOTE: What happens if you attempt to perform a division by zero?)
 */
public class ArithmeticOperations {

	public static void main(String[] args) {
		/*
		 *Ask user for input ( two numbers)
		 *Ask user to choose the operation
		 * use switch statement to perform operations and print result
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		
		System.out.println("Select which operation to perform ( +, -, *, / ): ");
		char operator = sc.next().charAt(0);
	
		Double result;
		switch(operator) {
		case '+':
			result = a + b;
			System.out.println("Result of addition is: " + result);
			break;
			
		case '-':
			result = a - b;
			System.out.println("Result of subtraction is: " + result);
			break;
		
		case '*':
			result = a * b;
			System.out.println("Result of multiplication is: " + result);
			break;
			
		case '/':
			result = a / b;
			System.out.println("Result of division is: " + result);
			break;
			
		default:
			System.out.println("Operation not defined.");
			break;
		}
		
		
		sc.close();
	}

}
