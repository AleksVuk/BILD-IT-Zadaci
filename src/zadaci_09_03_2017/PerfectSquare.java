package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		boolean works = true;
		int m = 0;
		
		//loop which controls correct input of number
		while(works){
			try{
				System.out.print("Enter an integer greater than 1: ");
				m = input.nextInt();
				
				if (m <= 1){
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
		ArrayList<Integer> list = new ArrayList<>();
		int temp = m;
		int i = 2;
		
		//get the smallest factors
		while(m >= i){
			if (m % i == 0){
				m = m / i;
				list.add(i);
			}
			else{
				i++;
			}
		}
		
		ArrayList<Integer> copiedList = copy(list);
		
		//remove duplicate factors
		removeDuplicate(list);
		
		int n = 1;
		int count = 0;
		
		//check is the number of repetitions of each factor an odd number
		for (int j = 0; j < list.size(); j++){
			for (int k = 0; k < copiedList.size(); k++){
				if (list.get(j) == copiedList.get(k)){
					count++;
				}
			}
			
			//if is number of repetitions an odd number multiply that number with n
			if (count % 2 != 0){
				n = n * list.get(j);
			}
			//reset counter of repetitions
			count = 0;
		}
		
		System.out.println("The smallest number n for m*n to be a perfect square is: " + n);
		System.out.println("m * n is " + temp*n);
		System.out.println("\nSmallest factors of number " + temp + " are " + copiedList.toString());
		
		input.close();
	}

	// method which removes duplicates from list
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
	}
	
	//copy array list
	public static ArrayList<Integer> copy(ArrayList<Integer> list){
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++){
			list1.add(list.get(i));
		}
		
		return list1;
	}
	
}
