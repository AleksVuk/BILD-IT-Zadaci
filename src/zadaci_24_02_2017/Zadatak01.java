package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		boolean works = true;
		//loop which controls correct input of ASCII code (integer from 0 to 127)
		while (works){
			try{
				System.out.print("Enter ASCII code (an integer in range from 0 to 127): ");
				number = input.nextInt();
				
				if (number >= 0  && number <= 127){
					break;
				}
				else{
					System.out.println("You entered number either greater than 127 or smaller than 0!");
					continue;
				}
			}catch (InputMismatchException ex){
				System.out.println("Your input must be an integer from 0 to 127.");
				input.nextLine();
			}
		}
		
		char ch = (char)(number);
		System.out.println("For ASCII code " + number + " is defined character '" + ch + "'.");
		
		input.close();
	}

}
