package zadaci_24_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "";
		char ch = ' ';
		boolean works = true;
		//loop which controls correct input of character
		while (works){
			try{
				System.out.print("Enter one character: ");
				str = input.nextLine();
				
				if (str.length() == 1){
					ch = str.charAt(0);
					break;
				}
				else{
					System.out.println("Enter only one character!");
					continue;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Wrong input!");
				input.nextLine();
			}
		}
		
		int number = (int)(ch);
		System.out.println("Unicode for character '" + ch + "' is " + number + ".");
		
		input.close();
	}

}
