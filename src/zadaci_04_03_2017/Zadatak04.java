package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak04 {

	public static void main(String[] args) {
		
		BigInteger two = new BigInteger("2");
		BigInteger p = new BigInteger("1");
		int count = 0;
		
		System.out.println("All Mersenne prime numbers: ");
		System.out.println("p    2^p - 1");
		System.out.println("----------------------");
		
		while(count <= 100){
			
			BigInteger number = calculateNumber(two, count);
			
			if (isPrime(number)){
				System.out.printf("%-5s", p);
				System.out.println(number);
			}
			
			//increment count and p by one
			count++;
			p = p.add(BigInteger.ONE);
			
		}
	}
	
	//check is BigInteger object prime number
	public static boolean isPrime(BigInteger number){
		BigInteger two = new BigInteger("2");
		BigInteger border = number.divide(two);
		BigInteger start;
		
		for (start = two; start.compareTo(border) <= 0; start = start.add(BigInteger.ONE)){
			if (number.remainder(start).equals(BigInteger.ZERO)){
				return false;
			}
		}
		
		return true;
	}
	
	//method which calculates number using this formula 2^p - 1
	public static BigInteger calculateNumber(BigInteger two, int count){
		BigInteger number = new BigInteger("1");
		
		for (int i = 0; i <= count; i++){
			number = number.multiply(two);
		}
		number = number.subtract(BigInteger.ONE);
		return number;
	}
}
