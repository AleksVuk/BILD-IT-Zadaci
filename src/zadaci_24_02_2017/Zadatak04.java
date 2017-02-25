package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean works1 = true;
		//loop which controls correct input of number
		while (works1) {
			try {
				System.out.print("Enter an positive integer: ");
				number = input.nextInt();

				if (number >= 0) {
					break;
				} else {
					System.out.println("You entered number smaller than 0!");
					continue;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Your input must be an integer of type int!");
				input.nextLine();
			}
		}
		int width = 0;
		boolean works2 = true;
		//loop which controls correct input of width for number
		while (works2) {
			try {
				System.out.print("Enter width as an positive integer smaller than 15: ");
				width = input.nextInt();

				if (width > 0 && width <= 15) {
					break;
				} else {
					System.out.println("You entered number either smaller than 1 or greater than 15!");
					continue;
				}
			} catch (InputMismatchException ex) {
				System.out.println("You must input an integer!");
				input.nextLine();
			}
		}
		
		System.out.println(format(number, width));
		input.close();
		
	}
	
	//method which returns number as a string in specified format
	public static String format(int number, int width) {
		String str1 = number + "";
		if (str1.length() >= width){
			return str1;
		}
		else{
			int count0 = width - str1.length();
			String str2 = "";
			for (int i = 0; i < count0; i++){
				str2 = str2 + "0";
			}
			str2 = str2 + str1;
			return str2;
		}

	}

}
