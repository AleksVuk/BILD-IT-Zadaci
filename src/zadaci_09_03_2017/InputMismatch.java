package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		boolean works = true;
		int [] a = new int [2];
		
		//loop which controls correct input of two integers
		while(works){
			try{
				System.out.print("Enter two integers: ");
				a[0] = input.nextInt();
				a[1] = input.nextInt();
				
				works = false;
				
			}catch (InputMismatchException ex){
				System.out.println("Your input is incorrect! Try again.");
				input.nextLine();
			}
		}
		
		System.out.println("Sum of the entered numers is: " + (a[0] + a[1]));
		input.close();
	}

}
