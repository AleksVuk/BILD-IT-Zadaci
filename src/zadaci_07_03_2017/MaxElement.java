package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> elements = new ArrayList<>();
		
		boolean works = true;
		System.out.print("Enter the sequence of integers (0 breaks input): ");
		
		//initializing list elements
		while (works){
			try{
				//enter the loop
				int el = 5;
				while (el != 0){
				el = input.nextInt();
				
				//if input is 0, input ends
				if (el == 0){
					works = false;
					break;
				}
				elements.add(el);
			}
			
			}catch (InputMismatchException ex){
				System.out.println("Invalid input, try again.");
				System.out.print("Enter the sequence of integers (0 breaks input): ");
				elements.clear();
				input.nextLine();
			}
		}
		System.out.println(max(elements));
		input.close();
	}
	
	//method which returns the max element in array list
	public static Integer max(ArrayList<Integer> list){
		//if list is empty return null
		if (list.isEmpty()){
			return null;
		}
		
		Integer max = list.get(0);
		for(int i = 0; i < list.size(); i++){
			if (max < list.get(i)){
				max = list.get(i);
			}
		}
		return max;
	}
}
