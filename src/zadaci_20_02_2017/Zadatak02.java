package zadaci_20_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		boolean works1 = true;
		
		System.out.println("Unesite dva pozitivna cijela broja tipa int.");
		//petlja koja kontrolise pravilan unos prvog broja
		while(works1){										
			try{
				System.out.print("Prvi broj: ");
				number1 = input.nextInt();
						
				if (number1 <= 0){
					System.out.println("Unesite pozitivan cijeli broj!");
					works1 = true;
				}
				else {
					works1 = false;
				}
						
			}catch (InputMismatchException ex){
				System.out.println("Nemoguc unos. Unesite pozitivan cijeli broj tipa int!");
				input.nextLine();
			}
		}
		
		boolean works2 = true;
		//petlja koja kontrolise pravilan unos drugog broja
		while(works2){										
			try{
				System.out.print("Drugi broj: ");
				number2 = input.nextInt();
						
				if (number2 <= 0){
					System.out.println("Unesite pozitivan cijeli broj!");
					works2 = true;
				}
				else {
					works2 = false;
				}
						
			}catch (InputMismatchException ex){
				System.out.println("Nemoguc unos. Unesite pozitivan cijeli broj tipa int!");
				input.nextLine();
			}
		}
		
		int smaller = Math.min(number1, number2);
		//petlja radi sve dok ne naidje na prvi broj sa kojim su djeljiva oba unesena broja (pocevsi od manjeg broja od ta dva pa do jedan)
		for (int i = smaller; i >= 1; i--){
			if (number1 % i == 0  &&  number2 % i == 0){
				System.out.println("Najveci zajednicki djelilac brojeva " + number1 + " i " + number2 + " je broj: " + i + ".");
				break;
			}
		}
		
		int count = 0;
		//petlja radi dok ne naidje na prvi broj sa kojim su djeljiva oba unesena broja (pocevsi od 2 pa do manjeg broja od dva unesena)
		for (int i = 2; i <= smaller; i++){
			if (number1 % i == 0  && number2 % i ==0){
				count++;
				System.out.println("Najmanji zajednicki djelilac brojeva " + number1 + " i " + number2 + " je broj: " + i + ".");
				break;
			}
		}
		//ukoliko nismo nasli nijedan drugi broj sa kojim su oba unesena broja djeljiva, program ce ispisati da je to ipak broj jedan
		if(count == 0){
			System.out.println("Najmanji zajednicki djelilac brojeva " + number1 + " i " + number2 + " je broj: 1.");
		}
		input.close();
	}

}
