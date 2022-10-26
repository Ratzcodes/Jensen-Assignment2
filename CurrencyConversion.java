package Assignment2;

import java.util.Scanner;

public class CurrencyConversion {

	/*
	 * Enter the brazilian value
	 * Calculate SEk value:
	 * 		sekValue = brazilianValue * 2.64;
	 * Print output
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Brazilian Real value to convert into SEK: ");
		float brazilianReal = sc.nextFloat();
		
		double sekValue = brazilianReal * 2.64 ;
		
		System.out.println("Value of " +brazilianReal+ " BRL in Swedish krona is: "+ sekValue + " SEK.");
		
		sc.close();
	}

}
