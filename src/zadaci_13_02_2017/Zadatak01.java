package zadaci_13_02_2017;

import java.util.InputMismatchException;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);

		int value = 0;
		int months = 0;

		boolean works = true;			//promjenljiva koja kontrolise unos 

		while (works) {	
			try {
				
				//program ponavlja unos sve dok unos od korisnika ne ispuni uslov (value<=10)
				while (value <= 10) {
					System.out.print("Unesite iznos za stednju u (KM): ");
					value = input.nextInt();
					works = false;
				}
				
				//program ponavlja unos sve dok unos od korisnika ne ispuni uslov (months<=0)
				while (months <= 0) {
					System.out.print("Nakon koliko mjeseci stednje zelite da znate stanje vaseg racuna? ");
					months = input.nextInt();
					works = false;
				}

				double monthlyInterest = 0.05 / 12; 					//mjesecna interesna stopa (godisnja je 5%)

				double total = 0;

				for (int i = 0; i < months; i++) {

					total = (value + total) * (1 + monthlyInterest);

				}

				System.out.printf("Vase stanje racuna nakon " + months + " mjeseci stednje za iznos od "+value+"KM ce iznositi %.3f KM", total);

			} catch (InputMismatchException ex) {
				
				System.out.println("Pogresan unos, morate da unesete cijeli broj veci od nule!");
				works = true;
				input.nextLine();
				
			}
		}
		input.close();

	}

}
