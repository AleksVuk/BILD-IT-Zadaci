package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak03 {

	public static void main(String[] args) {
		
		//creating BigInteger object with max value of type long
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		number = number.add(BigInteger.ONE);
		
		int count = 0;
		while (count < 5){
			if (isPrime(number)){
				count++;
				System.out.println(number);
			}
			
			//increment number by 1
			number = number.add(BigInteger.ONE);
			
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

}