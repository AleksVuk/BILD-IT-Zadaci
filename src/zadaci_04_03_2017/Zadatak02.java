package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak02 {

	public static void main(String[] args) {

		//creating BigInteger object with max value of type long
		BigInteger maxLong = new BigInteger(Long.MAX_VALUE + "");
		
		//get sqrt of max value of type long
		long maxSqrt = (long)Math.sqrt(Long.MAX_VALUE);
		
		BigInteger startNumber = new BigInteger(maxSqrt+"");
		int count = 0;
		
		while (count < 10){
			
			BigInteger squareNumber = startNumber.multiply(startNumber);
			
			if (squareNumber.compareTo(maxLong) > 0){
				count++;
				System.out.println(count + "." + squareNumber);
			}
			
			startNumber = startNumber.add(BigInteger.ONE);
			
		}
		
	}

}
