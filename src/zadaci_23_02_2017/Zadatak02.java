package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter string: ");
		String message = input.nextLine();
		
		System.out.println("The entered string contains: " + message.length() + " characters.");
		
		if (containsLetters(message)){
			char ch = firstLetter(message);
			System.out.println("First letter in the entered string is: " + ch + ".");
		}
		else{
			System.out.println("The entered string contains no letters, but the first characater is: '" + message.charAt(0) + "'.");
		}
			
		input.close();
	}
	//method which checks does the string contains any letters
	public static boolean containsLetters(String s){
		char ch = ' ';
		for (int i = 0; i < s.length(); i++){
			ch = s.charAt(i);
			if (Character.isLetter(ch)){
				return true;
			}
		}
		return false;
	}
	//method which returns first letter in string
	public static char firstLetter(String s){
		char ch = ' ';
		for (int i = 0; i < s.length(); i++){
			ch = s.charAt(i);
			if (Character.isLetter(ch)){
				return ch;
			}
		}
		return '0';
	}
}