package zadaci_17_02_2017;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Zadatak01 {
	public static int numberOfDayInAYear(int year){						//metoda koja vraca broj dana u godini
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			return 366;													//ako je prestupna godina, vraca 366
		}
		else {
			return 365;													//ako je regularna godina vraca 365 
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		int count = 0;
		int startYear = 0;
		int endYear = 0;
		boolean works1 = true;
		
		//petlja koja kontrolise unos pocetne godine (mora biti veca od nule)
		while(works1){										
			try{
				System.out.print("Unesite pocetnu godinu: ");
				startYear = input.nextInt();
						
				if (startYear <= 0){
					System.out.println("Unesite cijeli broj veci od nule!");
					works1 = true;
				}
				else {
					works1 = false;
				}
						
			}catch (InputMismatchException ex){
				System.out.println("Unesite cijeli broj veci od nule!");
				input.nextLine();
			}
		}
		
		boolean works2 = true;
		//petlja koja kontrolise unos krajnje godine (mora biti veca od pocetne godine)
		while (works2){
			try{
				System.out.print("Unesite krajnju godinu: ");
				endYear = input.nextInt();
						
				if (endYear < startYear){
					System.out.println("Krajnja godina mora biti veca od "+startYear);
					works2 = true;
				}
				else{
					works2 = false;
				}
								
			}catch (InputMismatchException ex){
				System.out.println("Krajnja godina mora biti veca od "+ startYear);
				input.nextLine();
			}
		}
		
		System.out.println("\nBroj dana svake godine od " + startYear + ". godine do " + endYear + ". godine: ");
		
		// promjenljivu "count" koristimo za kontrolu ispisa broja godina po linijama (5 po liniji)
		for (int year = startYear; year <= endYear; year++){
			count++;
			if (count % 5 == 0){
				System.out.println(year + ". godina ima: " + numberOfDayInAYear(year) + "dana.   " );
			}
			else{
				System.out.print(year + ". godina ima: " + numberOfDayInAYear(year) + "dana.   " );
			}
		}
		input.close();
	}

}
