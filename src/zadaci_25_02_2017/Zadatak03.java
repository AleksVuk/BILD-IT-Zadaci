package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 0;
		boolean works1 = true;
		//loop which controls correct input of number of values
		while (works1) {
			try {
				System.out.print("Enter the number of values (integer between 1 and 20): ");
				size = input.nextInt();

				if (size >= 5 && size <= 20) {
					break;
				} else {
					System.out.println("You entered either number smaller than 5 or greater than 20! Try again.");
					continue;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Your input must be an integer of type int! Try again.");
				input.nextLine();
			}
		}
		
		int [] values = new int [size];
		System.out.println("Enter " + size + " integers of type int: ");
		int count = 0;
		int number = 0;
		//loop which controls correct input of values
		while (count < size) {
			try {
				number = input.nextInt();
				values[count] = number;
				count++;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input, you can enter only integers of type int!");
				System.out.println("Enter " + size + " integers of type int: ");
				count = 0;
				input.nextLine();
			}
		}
		
		if(isConsecutiveFour(values)){
			System.out.println("The list has consecutive fours.");
		}
		else{
			System.out.println("The list has no consecutive fours.");
		}
		
		input.close();
	}
	//method which checks does the list has consecutive fours
	public static boolean isConsecutiveFour(int[] values){
		int count = 0;
		for (int i = 0; i< values.length - 1; i++){
			if (values[i] == values[i+1]){
				count++;
				if (count == 3){
					return true;
				}
			}
			else{
				count = 0;
			}
		}
		return false;
	}

}
