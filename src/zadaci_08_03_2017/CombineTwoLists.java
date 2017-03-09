package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CombineTwoLists {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		boolean works1 = true;

		// initializing first list
		while (works1) {
			try {
				System.out.print("Enter 5 integers for list1: ");
				for (int i = 0; i < 5; i++) {
					int el1 = input.nextInt();
					list1.add(el1);
				}
				works1 = false;
				
			} catch (InputMismatchException ex) {
				System.out.println("Invalid input, try again.");
				list1.clear();
				input.nextLine();
			}
		}

		ArrayList<Integer> list2 = new ArrayList<>();
		boolean works2 = true;
		
		// initializing second list
		while (works2) {
			try {
				System.out.print("Enter 5 integers for list2: ");
				for (int i = 0; i < 5; i++) {
					int el2 = input.nextInt();
					list2.add(el2);
				}
				works2 = false;

			} catch (InputMismatchException ex) {
				System.out.println("Invalid input, try again.");
				list2.clear();
				input.nextLine();
			}
		}
		
		//initializing union list by invoking the method union
		ArrayList<Integer> union = union(list1, list2);
		
		//print union list
		System.out.println("\nUnion of the two entered lists is: ");
		for (int i = 0; i < union.size(); i++){
			System.out.print(union.get(i) + " ");
		}
		
		input.close();
	}
	
	//method which returns the union of the two array lists
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for (int i = 0; i < list2.size(); i++){
			list1.add(list2.get(i));
		}
		
		return list1;
		
	}
}
