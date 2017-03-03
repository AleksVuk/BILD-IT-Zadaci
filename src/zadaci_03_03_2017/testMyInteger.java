package zadaci_03_03_2017;

public class testMyInteger {

	public static void main(String[] args) {
		
		//new MyInteger object
		MyInteger x = new MyInteger (5);
		
		//invoking methods from MyInteger class using object variable x
		System.out.println("Value of x is " + x.getValue());
		System.out.println("Is even x? " + x.isEven());
		System.out.println("Is odd x? " + x.isOdd());
		System.out.println("Is prime x? " + x.isPrime());
		
		//invoking static methods from MyInteger class using the class name
		System.out.println("\nIs even 11? " + MyInteger.isEven(11));
		System.out.println("Is odd 2? " + MyInteger.isOdd(2));
		System.out.println("Is prime 77? " + MyInteger.isPrime(77));
		
		
		MyInteger y = new MyInteger (6);
		MyInteger z = new MyInteger (6);
		System.out.println("\nValue of y is " + y.getValue());
		System.out.println("Value of z is " + z.getValue());
		System.out.println("Is y even? " + MyInteger.isEven(y));
		System.out.println("Is y odd? " + MyInteger.isOdd(y));
		System.out.println("Is y prime? " + MyInteger.isPrime(y));
		
		System.out.println("\nIs x equal to 10? " + x.equals(10));
		System.out.println("Is x equal to y? ");
		System.out.println("Is y equal to z? " + y.equals(z));
		
		char [] numbers = {'4', '5', '3', '2'};
		System.out.println("Integer value of array numbers is: " + MyInteger.parseInt(numbers));
		
		String s = "12345";
		
		System.out.println("Integer value of string " + s + " is: " + MyInteger.parseInt(s));
		
		
		
		
		
	}

}
