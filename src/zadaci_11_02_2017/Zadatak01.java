package zadaci_11_02_2017;

import java.util.InputMismatchException;

public class Zadatak01 {
	
	public static boolean isPrime(int number){			//metoda koja provjerava da li je uneseni broj prost
		int count = 0;
		for (int i=2; i<number; i++){
			if (number%i == 0){
				count++;
			}
		}
		if (count == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		System.out.print("Unesite jedan broj: ");
		try{
			int number = input.nextInt();											//kupimo unos od korisnika
																					
			if (isPrime(number)){													//provjeravamo je li uneseni broj prost broj
				System.out.println("Unijeli ste prost broj, njegovi faktori su: ");
				System.out.println("1, "+number+".");
			}else{
				System.out.println("Najmanji faktori unesenog broja su:" );			//ukoliko uneseni broj nije prost broj izvrsava 
				while(number>=1){													//racunamo njegove faktore u rastucem redoslijedu
					for(int i=2; i<=number; i++){
						if (number%i == 0){
							System.out.print(i+", ");
							number=number/i;
							break;
						}
					}
				}
			}
		}catch (InputMismatchException e){										//ukoliko korisnik nije unio cijeli broj
			System.out.println("Pogresan unos, unesite cijeli broj!");			//program ispisuje poruku da je unos pogresan.
		}
		
		input.close();
	}

}
