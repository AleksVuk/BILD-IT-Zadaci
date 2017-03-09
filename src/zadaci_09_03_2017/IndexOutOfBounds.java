package zadaci_09_03_2017;

import java.util.Scanner;

public class IndexOutOfBounds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		
		//initializing array with random numbers between 0-999
		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
		
		boolean works = true;
		//loop which controls correct input of index in array
		while (works) {
			try {
				System.out.print("Enter an index: ");
				int i = input.nextInt();

				System.out.println("Value on index " + i + " is " + array[i]);
				works = false;
				
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("Out of Bounds!");
				input.nextLine();
			}
		}

		input.close();
	}

}
