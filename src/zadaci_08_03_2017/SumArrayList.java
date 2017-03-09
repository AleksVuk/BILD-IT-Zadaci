package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		boolean works = true;
		
		// initializing elements of the list
		while (works) {
			try {
				System.out.print("Enter 5 numbers: ");
				for (int i = 0; i < 5; i++) {
					double el = input.nextDouble();
					list.add(el);
				}
				works = false;

			} catch (InputMismatchException ex) {
				System.out.println("Invalid input, try again.");
				list.clear();
				input.nextLine();
			}
		}
		
		System.out.print("Entered list is: ");
		for (int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println("\nSum of the all elements in entered list is: " + sum(list));
		
		input.close();
	}
	
	//method which returns the sum of the elements in array list
	public static double sum(ArrayList<Double> list){
		double sum = 0;
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i);
		}
		
		return sum;
		
	}
}
