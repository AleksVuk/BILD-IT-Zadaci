package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		int [] numbers = new int [10];
		System.out.println("Enter 10 integers in range from 1 to 54: ");
		int count = 0;
		//loop which controls correct input of 10 integers in defined range from 1 to 54
		while (count < 10) {
			try {
				number = input.nextInt();
				if (number < 1 || number > 54){
					throw new Exception("value is out of defined bounds");
				}
				numbers[count] = number;
				count++;

			} catch (InputMismatchException ex) {
				System.out.println("Wrog input, you can enter only integers of type int!");
				System.out.println("Enter 10 integers in range from 1 to 54: ");
				count = 0;
				input.nextLine();
			} catch (Exception ex){
				System.out.println("You entered number out of defined range from 1 to 54! Try again.");
				System.out.println("Enter 10 integers in range from 1 to 54: ");
				count = 0;
				input.nextLine();
			}
		}	
		System.out.println("Your 10 correct entered numbers are: ");
		for (int e: numbers){
			System.out.print(e + " ");
		}
		int random = getRandom(numbers);
		System.out.println("\nRandomly choosen number between 1 and 54 and not contained in list you entered is: " + random + ".");
		input.close();
	}
	//get random number between 1 and 54, which is not contained in the list numbers
	public static int getRandom(int[] numbers){
		boolean works = true;
		while (works){
			int count = 0;
			int random = 1 + (int)(Math.random() * 54);
			for (int i = 0; i < numbers.length; i++){
				if (random == numbers[i]){
					count++;
				}
			}
			if (count == 0){
				return random;
			}
			else{
				continue;
			}
		}
		return 0;
	}
	
}
