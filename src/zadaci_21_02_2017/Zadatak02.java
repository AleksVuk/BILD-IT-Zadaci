package zadaci_21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean works = true;
		//petlja koja kontrolise pravilan unos broja (pozitivan cijeli broj tipa int)
		while (works){
			try{
				System.out.print("Unesite pozitivan cijeli broj tipa int: ");
				number = input.nextInt();
				if (number <= 0){
					System.out.println("Pogresan unos.");
					continue;
				}
				else {
					break;
				}
			}catch (InputMismatchException ex){
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		System.out.print("Uneseni broj ispisan obrnuto: ");
		//poziv metode za ispis broja obrnuto
		reverse(number);
		
		input.close();
		
	}
	//metoda koja vraca proslijedjeni broj ispisan obrnuto
	public static void reverse(int number){
		while(number != 0){
			int digit = number % 10;
			System.out.print(digit);
			number = number / 10;
		}
	}
}
