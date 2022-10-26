package Assignment2;

import java.util.Scanner;

/*
 * A store is offering 13% of the price for all its products. 
 * Create a program that calculates how much is 13% of a given total price and prints.
 */
public class DiscountPrice {

	public static void main(String[] args) {
		/*
		 * Enter the price of the product
		 * Calculate the discount
		 * value = (percentagedicount*originalprice)/100
		 *  discount price = original price - value
		 * 
		 */

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Original price of the product: ");
		float originalPrice = sc.nextFloat();
		
		System.out.println("Enter the percentage discount on the product: ");
		int perDiscount = sc.nextInt();
		
		float valueDiscount = (perDiscount * originalPrice)/100;	
		float discountPrice = originalPrice - valueDiscount;
		
		System.out.println("The new discounted price of the product is: " +discountPrice);
	
		sc.close();
	}

}
