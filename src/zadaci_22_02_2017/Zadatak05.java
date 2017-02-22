package zadaci_22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean works1 = true;
		//petlja koja kontrolise pravilan unos broja
		while (works1) {
			try {
				System.out.print("Unesite cijeli broj tipa int: ");
				number = input.nextInt();
				if (number <= 0) {
					System.out.println("Unesite broj veci od nule!");
					continue;
				}
				works1 = false;
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		System.out.println("Matrica velicine: " + number + "x" + number + ".");
		printMatrix(number);
		input.close();
	}
	//metoda koja ispisuje nxn matricu
	public static void printMatrix(int n){
		int number = 0;
		for (int i=0; i < n; i++){
			for (int j = 0; j < n; j++){
				//sve vrijednosti u matrici su (0 ili 1)
				number = (int)(Math.random() * 2);
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}
}
