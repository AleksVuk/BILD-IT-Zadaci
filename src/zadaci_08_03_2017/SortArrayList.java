package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> elements = new ArrayList<>();
		boolean works = true;
		
		// initializing list elements
		while (works) {
			try {
				System.out.print("Enter 5 integers: ");
				for (int i = 0; i < 5; i++) {
					int el = input.nextInt();
					elements.add(el);
				}
				works = false;

			} catch (InputMismatchException ex) {
				System.out.println("Invalid input, try again.");
				elements.clear();
				input.nextLine();
			}
		}
		
		System.out.print("\nEntered list is: ");
		for (int i = 0; i < elements.size(); i++){
				System.out.print(elements.get(i) + " ");
		}
		
		//invoking sort method
		sort(elements);
		
		System.out.print("\nSorted list: ");
		for (int i = 0; i < elements.size(); i++){
			System.out.print(elements.get(i) + " ");
		}
		
		input.close();
	}
	
	//method which sorts array list in increasing order
	public static void sort(ArrayList<Integer> list){
		for (int i = 0; i < list.size(); i++){
			for (int j = 0; j < list.size() - 1; j++){
				if (list.get(j) > list.get(j + 1)){
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}
}
