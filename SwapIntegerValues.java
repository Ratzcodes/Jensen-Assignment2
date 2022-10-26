package Assignment2;
// Program to swap values in variables

public class SwapIntegerValues {

	public static void main(String[] args) {
		method1();
		method2();

	}

	
	/* method -1: using a temporary variable
	 * initialize two integer variables a =10 and b =20
	 * Print vales of a and b
	 * take a temporary variable(third variable)
	 * store a in temp variable
	 * assign b to a
	 * and temp( which has value of a) to b variable
	 * Now print the values of a and b
	 */
	public static void method1() {
        int a = 10, b = 20;
		
		System.out.println("Value of a is: " +a+ " and value of b is: "+b);
		int temp = a;
		a= b;
		b= temp;
		System.out.println("Using method 1 the value of a is: " +a+ " and value of b is: "+b);
	}
	
	
	/*
	 * Method -2 : Without using a third variable
	 * initialize two variables a and b
	 * Print the values
	 * now perform these operations
	 * a = a + b;
	 * b = a -b;
	 * a = a -b;
	 */
	public static void method2() {
        int a = 10, b = 20;
		
		System.out.println("Value of a is: " +a+ " and value of b is: "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Using method 2 the value of a is: " +a+ " and value of b is: "+b);
	}
	
	
	
}
