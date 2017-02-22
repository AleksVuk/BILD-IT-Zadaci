package zadaci_22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		long number = 0;
		boolean works1 = true;
		//petlja koja kontrolise pravilan unos broja
		while (works1) {
			try {
				System.out.print("Unesite cijeli broj tipa long: ");
				number = input.nextLong();
				if (number == 0) {
					System.out.println("Unesite cijeli broj razlicit od nule!");
					continue;
				}
				//ukoliko je broj negativan uzimamo njegovu apsolutnu vrijednost
				else if (number < 0){
					number = Math.abs(number);
					break;
				}
				else {
					break;
				}

			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		
		System.out.println("Suma svih cifara broja " + number + " je " + sumDigits(number) + ".");
		
		input.close();
	}
	//metoda koja vraca zbir svih cifara proslijedjenog broja
	public static int sumDigits(long n){
		long sum = 0;
		while (n != 0){
			long digit = n % 10;
			n = n / 10;
			sum += digit;
		}
		return (int)sum;
	}
}
