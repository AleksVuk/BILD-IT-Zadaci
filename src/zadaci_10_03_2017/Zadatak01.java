package zadaci_10_03_2017;

import java.math.BigInteger;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter a binary number: ");
			String binaryString = input.next();

			BigInteger number = bin2Dec(binaryString);
			System.out.println("Number is: " + number);
			
		} catch (NumberFormatException e) {
			System.out.println("Binary number is contained of 1's and 0's, and starts with 1.");
		}

		System.out.println();

		input.close();
	}

	public static BigInteger  bin2Dec(String binaryString) throws NumberFormatException{
		//if first character in binaryString is not 1 throw exception
		if (binaryString.charAt(0) != '1'){
			throw new NumberFormatException("Binary number has to start with 1");
		}
		
		//if any character from first to last index in binaryString is not equal to 0 or to 1, throw exception
		for (int i = 0; i < binaryString.length(); i++){
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1'){
				throw new NumberFormatException("Binary number contains only 1's and 0's");
			}
		}
		
		//if no exceptions thrown, calculate number from binary string
		BigInteger number = new BigInteger("0");
		int index = 0;
			for (int i = binaryString.length() -1; i >= 0; i--){
				if(binaryString.charAt(i) == '1'){
					long n = (long) (Math.pow(2, index));
					String s = n+"";
					BigInteger number2 = new BigInteger (s);
					number = number.add(number2);
				}
				index++;
			}
		return number;
		
	}
	
}
