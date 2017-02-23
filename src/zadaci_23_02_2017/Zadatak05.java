package zadaci_23_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean works = true;
		
		//loop which controls correct input of number
		while (works) {
			try {
				System.out.print("Enter an integer in the range from 2 to 25: ");
				number = input.nextInt();
				if (number <= 1 || number > 25) {
					System.out.println("You must enter the number of the type int, in the range from 2 to 25!");
					continue;
				}
				works = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("You must enter the number of the type int!");
				input.nextLine();
			}
		}
		
		int spacesPerRow = number;
		System.out.println("\nThe pyramid with all numbers from 1 to " + number +":");
		//loop which prints rows of the pyramid
		for (int i = 1; i <= number; i++){
			//loop which prints spaces
			for (int spaces = spacesPerRow; spaces > 1; spaces--){
				System.out.print("   ");
			}
			//loop which prints left side of the pyramid
			if (i > 1){
				for (int k = i; k > 1; k--){
					System.out.printf("%-3d", k);
				}
			}
			//loop which prints right side of the pyramid
			for (int j = 1; j <= i; j++){
				System.out.printf("%-3d", j);
			}
			System.out.println();
			spacesPerRow --;
		}
		
		input.close();
	}
	
}
