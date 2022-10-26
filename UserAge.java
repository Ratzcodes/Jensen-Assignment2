package Assignment2;

import java.util.Scanner;

/*
 * Request the user's age.
Store the user's age in a variable called age.
if age is greater or equal to 18
then print "the user is not a minor!"
else
then print "the user is a minor!"
 */

public class UserAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the User age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("User is not a minor.");
		}else {
			System.out.println("User is a minor.");
		}

		sc.close();
	}

}
