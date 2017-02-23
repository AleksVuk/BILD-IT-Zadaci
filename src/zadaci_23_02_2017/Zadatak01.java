package zadaci_23_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean works1 = true;
		
		//loop which controls correct input of number
		while (works1) {
			try {
				System.out.print("Enter an integer greater than 9: ");
				number = input.nextInt();
				if (number <= 9) {
					System.out.println("You must enter two or more digits number, of the type int!");
					continue;
				}
				works1 = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("You must enter the number of the type int!");
				input.nextLine();
			}
		}
		if (isPalindrome(number)){
			System.out.println("Number " + number + " is palindrome.");
		}
		else{
			System.out.println("Number " + number + " is not palindrome.");
		}
		
		input.close();
	}
	//method which checks if number is palindrome (true), or not (false)
	public static boolean isPalindrome(int number){
			int n = number;
			int reverseNumber = 0;
			while(number != 0){
				int digit = number % 10;
				reverseNumber = reverseNumber * 10 + digit;
				number = number / 10;
			}
			if (n == reverseNumber){
				return true;
			}
			return false;
		}

}
