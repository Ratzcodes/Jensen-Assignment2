package Assignment2;

import java.util.Scanner;

/* The relation between Celsius and Fahrenheit is given by the following formula 
 * 𝑇(°F)= 𝑇(°C)∗ 1.8 + 32, where 𝑇(°𝐹) is the value of degrees in Farenheit and 
 * 𝑇(°C) is the value of degree in Celsius. Based on this relation, 
 * create a program that converts degrees from Celsius to Fahrenheit to a given number.
 */
public class CelsiusToFarenheit {

	public static void main(String[] args) {
		
		/* Enter the degree celsius value
		calculate the valuein farenheit sing formula given
		print the degree farenheit
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in degree celsius: ");
		int degCelsius = sc.nextInt();
		
		Double degFarenheit = degCelsius * 1.8 + 32;
		System.out.println("The value of "+ degCelsius + " degree celsius in degreee farenheit is : " + degFarenheit);

		sc.close();
	}

}
