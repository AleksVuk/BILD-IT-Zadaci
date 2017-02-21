package zadaci_20_02_2017;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak04 {
	//metoda koja sortira tri proslijedjena broja u rastucem redoslijedu
	public static void printSortedNumbers (int n1, int n2, int n3){
		int [] numbers = {n1, n2, n3};
		Arrays.sort(numbers);
		
		for(int i = 0; i <= 2; i++){
			System.out.print(numbers[i] + "  ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		boolean works1 = true;
		
		System.out.println("Unesite tri cijela broja tipa int.");
		//petlja koja kontrolise pravilan unos prvog broja
		while(works1){										
			try{
				System.out.print("Prvi broj: ");
				number1 = input.nextInt();
				works1 = false;		
			}catch (InputMismatchException ex){
				System.out.println("Nemoguc unos. Unesite cijeli broj tipa int!");
				input.nextLine();
			}
		}
		
		boolean works2 = true;
		//petlja koja kontrolise pravilan unos drugog broja
		while(works2){										
			try{
				System.out.print("Drugi broj: ");
				number2 = input.nextInt();
				works2 = false;
			}catch (InputMismatchException ex){
				System.out.println("Nemoguc unos. Unesite cijeli broj tipa int!");
				input.nextLine();
			}
		}
		
		boolean works3 = true;
		//petlja koja kontrolise pravilan unos treceg broja
		while(works3){										
			try{
				System.out.print("Treci broj: ");
				number3 = input.nextInt();
				works3 = false;
			}catch (InputMismatchException ex){
				System.out.println("Nemoguc unos. Unesite cijeli broj tipa int!");
				input.nextLine();
			}
		}
		
		System.out.println("Uneseni brojevi sortirani u rastucem redoslijedu: ");
		//poziv metode za sortiranje i ispis tri broja u rastucem redoslijedu
		printSortedNumbers(number1, number2, number3);
		
		input.close();
	}

}
