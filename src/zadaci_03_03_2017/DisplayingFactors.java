package zadaci_03_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayingFactors {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		boolean works = true;
		int number = 0;
		
		//loop which controls correct input of number
		while(works){
			try{
				System.out.print("Enter an positive integer greater than 1: ");
				number = input.nextInt();
				
				if (number <= 1){
					throw new Exception("invalid input");
				}
				works = false;
			}
			catch (InputMismatchException ex){
				System.out.println("Invalid input! Try again.");
				input.nextLine();
			}
			catch (Exception e){
				System.out.println("Enter integer greater than 1!");
				input.nextLine();
			}
		}
		int number2 = number;
		
		//creating new stack of integers object
		StackOfIntegers stack = new StackOfIntegers();
		int i = 2;
		while(number >= i){
			if (number % i == 0){
				number = number / i;
				stack.push(i);
			}
			else{
				i++;
			}
		}
		
		System.out.println("Prime factors of number " + number2 + " are: ");
		while (!stack.empty()){
			System.out.print(stack.pop() + " "); 
		}
		input.close();
	}

}
