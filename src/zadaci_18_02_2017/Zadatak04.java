package zadaci_18_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long minutes = 0;
		boolean works = true;
		
		//petlja koja kontrolise pravilan unos broja minuta (cijeli broj veci od 0, tipa long)
		while(works){										
			try{
				System.out.print("Unesite broj minuta: ");
				minutes = input.nextLong();
						
				if (minutes <= 0){
					System.out.println("Morate da unesete cijeli broj veci od 0 a manji od 9223372036854775808.");
					works = true;
				}
				else {
					works = false;
				}
						
			}catch (InputMismatchException ex){
				System.out.println("Morate da unesete cijeli broj veci od 0 a manji od 9223372036854775808.");
				input.nextLine();
			}
		}
		
		//promjenljivu "temp" koristimo za ispis prvobitno unesenog broja minuta
		long temp = minutes;
		
		//minute dijelimo sa 525600, da bi dobili godine (jer godina koja ima 365 dana ima 525600 minuta)
		long years = minutes / 525600;
		minutes = minutes % 525600;
		
		//ostatak minuta od djeljenja sa godinama dijelimo sa 1440 (jer jedan dan ima 1440 minuta)
		double days = minutes / 1440.0;
		
		System.out.printf(temp + " minuta je: " + years + " godina/e, i %.2f dan/a.", days);
		input.close();
	}

}
