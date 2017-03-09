package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		boolean works = true;
		
		// initializing elements of the list
		while (works) {
			try {
				System.out.print("Enter 10 integers: ");
				for (int i = 0; i < 10; i++) {
					int el = input.nextInt();
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
			System.out.print(list.get(i) +" ");
		}
		
		//invoking removeDuplicate method
		removeDuplicate(list);
		
		System.out.print("\nDistinct numbers are: ");
		for (int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) +" ");
		}
		
		input.close();
	
	}
	//method which removes duplicates from list
	public static void removeDuplicate(ArrayList<Integer> list){
		for (int i = 0; i < list.size() - 1; i++){
			for(int j = list.size() - 1; j > i; j--){
				if (list.get(i) == list.get(j)){
					list.remove(j);
				}
			}
		}
	}

}
