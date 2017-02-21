package zadaci_21_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int weight1 = 0;
		int weight2 = 0;
		double price1 = 0;
		double price2 = 0;
		boolean works1 = true;
		
		//petlja koja kontrolise pravilan unos tezine prvog paketa
		while (works1){
			try{
				System.out.print("Unesite tezinu (u kg) prvog paketa kao pozitivan cijeli broj tipa int: ");
				weight1 = input.nextInt();
				if (weight1 <= 0){
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
		//petlja koja kontrolise pravilan unos cijene prvog paketa 
		boolean works2 = true;
		while (works2){
			try{
				System.out.print("Unesite cijenu (u KM) prvog paketa kao pozitivan broj tipa double: ");
				price1 = input.nextDouble();
				if (price1 <= 0){
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
		//petlja koja kontrolise pravilan unos tezine drugog paketa
		boolean works3 = true;
		while (works3){
			try{
				System.out.print("Unesite tezinu (u kg) drugog paketa kao pozitivan cijeli broj tipa int: ");
				weight2 = input.nextInt();
				if (weight2 <= 0){
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
		//petlja koja kontrolise pravilan unos cijene drugog paketa 
		boolean works4 = true;
		while (works4){
			try{
				System.out.print("Unesite cijenu (u KM) drugog paketa kao pozitivan broj tipa double: ");
				price2 = input.nextDouble();
				if (price2 <= 0){
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
		//odnos cijena/tezina prvog paketa
		double ratio1 = price1/weight1; 
		
		//odnos cijena/tezina drugog paketa
		double ratio2 = price2/weight2;
		
		if (ratio1 > ratio2){
			System.out.println("Prvi paket ima povoljniju cijenu.");
		}
		else if (ratio1 < ratio2){
			System.out.println("Drugi paket ima povoljniju cijenu.");
		}
		else if (ratio1 == ratio2){
			System.out.println("Oba paketa imaju jednak odnos cijene i tezine. Necete pogrijesiti koji god da odaberete :)");
		}
		
		input.close();
	}

}
