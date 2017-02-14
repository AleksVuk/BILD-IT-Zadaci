package zadaci_13_02_2017;

import java.util.InputMismatchException;

public class Zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);

		int[] numbers = new int[10];			//niz u koji cemo smjestiti vrijednosti koje unosi korisnik

		
		boolean works = true;					//promjenljiva koja kontrolise rad programa (omogucava nam da trazimo 
												//unos od korisnika sve dok unos ne bude pravilan)
		while (works) {

			try {
				
				System.out.println("Unesite deset cijelih brojeva: ");
				
				for (int i = 0; i < 10; i++) {							//unos deset cijelih brojeva u niz (numbers[])
					int number = input.nextInt();
					numbers[i] = number;
					works = false;
				}

				System.out.println("Uneseni brojevi ispisani u obrnutom redoslijedu: ");

				for (int i = 9; i >= 0; i--) {							//ispis niza numbers[] u obrnutom redoslijedu
					System.out.print(numbers[i] + " ");
				}

			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos, svi uneseni brojevi moraju biti cijeli brojevi!");
				works = true;
				input.nextLine();
			}
			
		}
		
		input.close();

	}

}
