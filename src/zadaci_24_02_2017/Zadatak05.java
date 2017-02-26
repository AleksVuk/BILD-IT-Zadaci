package zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList <Integer> allNumbers = new ArrayList<>();				
		ArrayList <Integer> uniqueNumbers = new ArrayList<>();
		int number = 0;
		System.out.print("Enter 10 integers of type int: ");
		//loop which controls correct input of number
		while (allNumbers.size() < 10) {
			try {
				number = input.nextInt();
				allNumbers.add(number);

			} catch (InputMismatchException ex) {
				System.out.println("Your can enter only numbers of type int!");
				System.out.print("Enter 10 integers of type int: ");
				allNumbers.clear();
				input.nextLine();
			}
		}	
		//method call
		initializeUniqueNumbers(allNumbers, uniqueNumbers);
		System.out.println("You entered " + uniqueNumbers.size() + " unique numbers.");
		System.out.println("Unique numbers are: ");
		for (int e: uniqueNumbers){
			System.out.print(e + " ");
		}
		input.close();
	}
	
	//method which initializes list with the unique numbers
	public static void initializeUniqueNumbers (ArrayList<Integer> allNumbers, ArrayList<Integer> uniqueNumbers){
		uniqueNumbers.add(allNumbers.get(0));
			
		for (int i = 0; i < allNumbers.size(); i++){
			if (uniqueNumbers.contains(allNumbers.get(i))){	
				continue;
			}
			else{					
				uniqueNumbers.add(allNumbers.get(i));
			}
		}
			
	}
}
