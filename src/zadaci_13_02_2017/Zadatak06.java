package zadaci_13_02_2017;

import java.util.InputMismatchException;

public class Zadatak06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean works = true;

		while (works) {
			try {
				System.out.print("Unesite prvi broj: ");						//unos prvog broja
				double number1 = input.nextDouble();
				works = false;

				int choice = 0;
				boolean works2 = true;
				while (works2) {
					try {
						System.out.println("Odaberite operaciju: ");			//odabir operacije
						System.out.println("1. Saberi");
						System.out.println("2. Oduzmi");
						System.out.println("3. Pomnozi");
						System.out.println("4. Podijeli");
						System.out.println("5. Modalno dijeljenje");
						System.out.println("6. Korijenovanje");
						System.out.println("7. Kvadriranje");

						choice = input.nextInt();
						if (choice > 0 && choice < 8) {							
							works2 = false;
						} else {
							System.out.println("Unesite broj od 1-7.");		//ponovno zahtjevanje odabira oeracije ukoliko korisnik 
							works2 = true;									//nije odabrao ni jednu od navedenih
						}
					} catch (InputMismatchException ex) {
						System.out.println("Unesite broj");
						works2 = true;
						input.nextLine();
					}
				}

				double result = 0;
				double number2;

				boolean works3 = true;
				while (works3) {
					
					try {

						switch (choice) {													//unos drugog broja i ispis rezultata
																							//u zavisnosti od odabrane operacije.
						case 1:
							System.out.println("Unesite drugi broj: ");						
							number2 = input.nextDouble();
							result = number1 + number2;											//sabiranje
							System.out.println(number1 + " + " + number2 + " = " + result);
							
							works3 = false;
							break;

						case 2:
							System.out.println("Unesite drugi broj: ");
							number2 = input.nextDouble();
							result = number1 - number2;											//oduzimanje
							System.out.println(number1 + " - " + number2 + " = " + result);
							works3 = false;
							break;

						case 3:
							System.out.println("Unesite drugi broj: ");
							number2 = input.nextDouble();
							result = number1 * number2;											//mnozenje
							System.out.println(number1 + " * " + number2 + " = " + result);
							works3 = false;
							break;

						case 4:
							System.out.println("Unesite drugi broj: ");
							number2 = input.nextDouble();
							result = number1 / number2;											//dijeljenje
							System.out.println(number1 + " / " + number2 + " = " + result);
							works3 = false;
							break;

						case 5:
							System.out.println("Unesite drugi broj: ");
							number2 = input.nextDouble();
							result = number1 % number2;											//modalno dijeljenje
							System.out.println(number1 + " % " + number2 + " = " + result);
							works3 = false;
							break;

						case 6:
							result = Math.sqrt(number1);										//korijenovanje
							System.out.println("Korijen broja " + number1 + " = " + result);	
							works3 = false;
							break;

						case 7:
							System.out.println("Unesite drugi broj: ");
							number2 = input.nextDouble();
							result = Math.pow(number1, number2);								//kvadriranje
							System.out.println(number1 + " ^ " + number2 + " = " + result);
							works3 = false;
							break;
						}
					} catch (InputMismatchException ex) {
						System.out.println("Pogresan unos, unesite broj!");
						works3 = true;
						input.nextLine();
					}
				}

			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos, unesite broj!");
				works = true;
				input.nextLine();
			}
		}

		input.close();
	}

}
