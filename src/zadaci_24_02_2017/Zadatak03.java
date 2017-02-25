package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		short number = 0;
		boolean works = true;
		//loop which controls correct input of number
		while (works){
			try{
				System.out.print("Enter an positive integer of the short type: ");
				number = input.nextShort();
				
				if (number <= 0){
					System.out.println("You entered the number smaller than 1!");
					continue;
				}
				works = false;
				
			}catch (InputMismatchException ex){
				System.out.println("Wrong input, try again.");
				input.nextLine();
			}
		}
		String binaryRepresentation = "0";
		//loop which calculates binary representation of the entered number
		for (short i = 14; i >= 0; i--){
			if(number >= Math.pow(2, i)){
				binaryRepresentation = binaryRepresentation + "1";
				number -= (short)(Math.pow(2, i));
			}
			else{
				binaryRepresentation += "0";
			}
		}
		System.out.println("Binary representation of the number " + number + " is: " + binaryRepresentation + ".");
		
		input.close();
	}

}
