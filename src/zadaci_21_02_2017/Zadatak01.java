package zadaci_21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double total = 0;
		int percent = 0;
		
		boolean works1 = true;
		//petlja koja kontrolise pravilan unos iznosa racuna (pravilan unos pozitivan broj tipa double)
		while(works1){										
			try{
				System.out.print("Unesite iznos racuna: ");
				total = input.nextDouble();
						
				if (total <= 0){
					System.out.println("Unesite pozitivan broj.");
					continue;
				}
				else {
					break;
				}
						
			}catch (InputMismatchException ex){
				System.out.println("Unesite pozitivan broj tipa double!");
				input.nextLine();
			}
		}
		
		boolean works2 = true;
		//petlja koja kontrolise pravilan unos procenta za racunanje napojnice (pozitivan cijeli broj manji od 100)
		while (works2){
			try{
				System.out.print("Unesite iznos procenta racuna za napojnicu (cijeli broj tipa int): ");
				percent = input.nextInt();
						
				if (percent > 0  && percent < 100){
					break;
				}
				else {
					System.out.println("Unesite pozitivan cijeli broj tipa int manji od 100!");
					continue;
				}
						
			}catch (InputMismatchException ex){
				System.out.println("Unesite pozitivan cijeli broj tipa int manji od 100!");
				input.nextLine();
			}
		}
		//uneseni procenat dijelimo sa 100 da dobijemo procenat kao decimalni broj
		double tipPercent = percent / 100.0;
		
		//mnozimo procenat sa ukupnim iznosom racuna da dobijemo iznos napojnice
		double tip = total * tipPercent;
		
		//saberemo iznos racuna i iznos napojnice da dobijemo ukupan iznos racuna
		double totalAmount = total + tip;
		System.out.printf("Ukupan racun iznosi %.2fKM, a napojnica %.2fKM.", totalAmount, tip);
		
		input.close();
	}

}
