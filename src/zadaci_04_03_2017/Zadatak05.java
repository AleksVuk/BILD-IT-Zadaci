package zadaci_04_03_2017;

import java.math.BigInteger;

public class Zadatak05 {

	public static void main(String[] args) {
		
		//creating BigInteger objects
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		BigInteger n1 = new BigInteger("1");
		BigInteger n5 = new BigInteger("5");
		BigInteger n6 = new BigInteger("6");
		
		int count = 0;
		
		while(count < 10){
			//check if the number is divisible by 5 or 6
			if (number.remainder(n5) == BigInteger.ZERO || number.remainder(n6) == BigInteger.ZERO){
				count ++;
				System.out.println(count + "." + number);
			}
			
			//increment number by 1
			number = number.add(n1);
		}
	}

}
