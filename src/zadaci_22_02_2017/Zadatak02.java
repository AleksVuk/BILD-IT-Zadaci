package zadaci_22_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Dobro dosli u igricu kamen-papir-makaze.");
		System.out.println("0-kamen");
		System.out.println("1-papir");
		System.out.println("2-makaze");
		int user = 0;
		//petlja koja radi sve dok ishod igre ne dobije pobjednika
		boolean works = true;
		while (works) {
			boolean works1 = true;
			//petlja koja kontrolise pravilan odabir ponudjenih mogucnosti
			while (works1) {
				try {
					System.out.print("Vas odabir je: ");
					user = input.nextInt();
					if (user >= 0 && user <= 3) {
						break;
					} else {
						System.out.println("Pogresan unos!");
						continue;
					}

				} catch (InputMismatchException ex) {
					System.out.println("Pogresan unos!");
					input.nextLine();
				}
			}

			int computer = (int) (Math.random() * 3);
			//ako je isho nerijesen, ponavlja se igra
			if (user == computer) {
				System.out.println("Nerijeseno.");
				System.out.println("Nasumican broj je " + computer + ".");
				System.out.println("---------------------");
				System.out.println("Pokusajte ponovo.");
				continue;
			} else if (user == 0 && computer == 1) {
				System.out.println("Izgubili ste. Papir omotava kamen.");
			} else if (user == 0 && computer == 2) {
				System.out.println("Pobijedili ste. Kamen razbija makaze.");
			} else if (user == 1 && computer == 0) {
				System.out.println("Pobijedili ste. Papir omotava kamen.");
			} else if (user == 1 && computer == 2) {
				System.out.println("Izgubili ste. Makaze sijeku papir.");
			} else if (user == 2 && computer == 0) {
				System.out.println("Izgubili ste. Kamen razbija makaze.");
			} else if (user == 2 && computer == 1) {
				System.out.println("Pobijedili ste. Makaze sijeku papir.");
			}
			System.out.println("Nasumican broj je " + computer + ".");
			works = false;
		}
		input.close();
	}

}
