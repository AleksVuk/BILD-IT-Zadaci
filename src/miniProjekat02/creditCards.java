package miniProjekat02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class creditCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		long cardNumber = 0;
		int cardType = 0;
		int choice1 = 0;
		boolean worksAplication = true;
		
		//petlja koja kontrolise rad aplikacije
		while (worksAplication){
			boolean works1 = true;
			//petlja koja kontrolise pravilan odabir opcija u pocetnom prozoru
			while (works1){
				try{
					System.out.println("1. Provjerite validnost kreditne kartice.");
					System.out.println("2. Izlaz.");
					System.out.print("Odaberite: ");
					choice1 = input.nextInt();
					
					//pravilan unos su brojevi 1 i 2
					if (choice1 == 1 || choice1 ==2){
						break;
					}
					else{
						System.out.println("Pogresan unos, unesite 1 ili 2.");
						continue;
					}
					
				}catch (InputMismatchException ex){
				System.out.println("Pogresan unos, unesite 1 ili 2." );
				input.nextLine();
				}
			}
			//ukoliko je odabir u pocetnom prozoru 1 unosimo tip kartice i broj kartice
			if (choice1 == 1){
				boolean works2 = true;
				
				//petlja koja kontrolise pravilan odabir tipa kreditne kartice
				while (works2){
					try{
						System.out.println("---------------------------------------");
						System.out.println("1. Visa - kartica.");
						System.out.println("2. Master - kartica.");
						System.out.println("3. American Express - kartica.");
						System.out.println("4. Discover - kartica.");
						System.out.print("Odaberite tip vase kreditne kartice: ");
						cardType = input.nextInt();
						
						//pravilan unos su brojevi u rasponu od 1 do 4
						if (cardType >= 1 && cardType <= 4){								
							break;
						}
						else{
							System.out.println("Unesite cijeli broj u rasponu od 1 do 4.");
							continue;
						}
					}catch (InputMismatchException ex){
						System.out.println("Unesite cijeli broj u rasponu od 1 do 4." );
						input.nextLine();
					}
				}
		
				boolean works3 = true;
				//petlja koja kontrolise pravilan unos broja kreditne kartice
				while (works3){
					try{
						System.out.print("Unesite broj kreditne kartice kao cijeli broj tipa long: ");
						cardNumber = input.nextLong();
						
						//broj kartice mora da bude pozitivan
						if (cardNumber < 0){
							System.out.println("Broj kreditne kartice mora da bude pozitivan!");
							continue;
						}
						//broj kartice mora da ima izmedju 13 i 16 cifara
						else if (getSize(cardNumber) < 13  || getSize(cardNumber) > 16){				
							System.out.println("Broj kreditne kartice mora da ima izmedju 13 i 16 cifara.");
							continue;
						}
						System.out.println("-------------------------------------------------------");
						works3 = false;
					}catch (InputMismatchException ex){
						System.out.println("Pogresan unos.");
						input.nextLine();
					}
				}
				//provjeravanje validnosti Visa-kartice
				if (cardType == 1){
					//provjeravanje prefiksa Visa-kartice
					if (prefixMatched(cardNumber, 4)){
						if (isValid(cardNumber)){
							System.out.println("Vasa \"Visa\" kartica sa brojem: " + cardNumber + " je validna.");
						}
						else {
							System.out.println("Vasa \"Visa\" kartica sa brojem: " + cardNumber + " nije validna.");
						}
				
					}
					else{
						System.out.println("Vasa \"Visa\" kartica nije validna jer ne pocinje odgovarajucim prefixom.");
					}
				}
				//provjeravanje validnosti Master-kartice
				else if (cardType == 2){
					//provjeravanje prefiksa Master-kartice
					if (prefixMatched(cardNumber, 5)){
						if (isValid(cardNumber)){
							System.out.println("Vasa \"Master\" kartica sa brojem: " + cardNumber + " je validna.");
						}
						else {
							System.out.println("Vasa \"Master\" kartica sa brojem: " + cardNumber + " nije validna.");
						}
					}
					else{
						System.out.println("Vasa \"Master\" kartica nije validna jer ne pocinje odgovarajucim prefixom.");
					}
				}
				//provjeravanje validnosti American Express-kartice
				else if (cardType == 3){
					//provjeravanje prefiksa American Express-kartice
					if (prefixMatched(cardNumber, 37)){
						if (isValid(cardNumber)){
							System.out.println("Vasa \"American Express\" kartica sa brojem: " + cardNumber + " je validna.");
						}
						else {
							System.out.println("Vasa \"American Express\" kartica sa brojem: " + cardNumber + " nije validna.");
						}
					}
					else{
						System.out.println("Vasa \"American Express\" kartica nije validna jer ne pocinje odgovarajucim prefixom.");
					}
				}
				//provjeravanje validnosti Discover-kartice
				else if (cardType == 4){
					//provjeravanje prefiksa Discover-kartice
					if (prefixMatched(cardNumber, 6)){
						if (isValid(cardNumber)){
							System.out.println("Vasa \"Discover\" kartica sa brojem: " + cardNumber + " je validna.");
						}
						else {
							System.out.println("Vasa \"Discover\" kartica sa brojem: " + cardNumber + " nije validna.");
						}
					}
					else{
						System.out.println("Vasa \"Discover\" kartica nije validna jer ne pocinje odgovarajucim prefixom.");
					}
				}
			}
			//odabir 2 u pocetnom prozoru, predstavlja izlaz iz aplikacije
			else if (choice1 == 2){
				break;
			}
		}
		System.out.println("Napustili ste aplikaciju.");
		input.close();
	}
	
	//metoda za provjeravanje validnosti broja kartice
	public static boolean isValid(long number) {
		int sumEven = sumOfDoubleEvenPlace(number); 
		int sumOdd = sumOfOddPlace(number);
		int total = sumEven + sumOdd;
		
		if (total % 10 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	//metoda koja sabira cifre broja kartice pomnozene sa 2, koje se nalaze na parnim pozicijama sa desna na lijevo 
	public static int sumOfDoubleEvenPlace(long number) {
		long sum = 0;
		while(number != 0){
			//broj kartice podijelimo cjelobrojno sa 10, a zatim modalno sa 10 da dobijemo cifru na parnoj poziciji sa desne strane
			number = number /10;
			long digit = number % 10;
			
			//dobijenu cifru mnozimo sa 2
			long doubleDigit = digit * 2;
			//ako je proizvod jednocifren dodajemo ga na sumu
			if (doubleDigit < 10){
				sum = sum + doubleDigit;
			
			}
			//ukoliko je dvocifren njegove cifre sabiramo sa sumom
			else{
				long digit1 = doubleDigit % 10;
				long digit2 = doubleDigit / 10;
				sum = sum + digit1 + digit2;
			}
			//broju "otkidamo" cifru koju smo dodali na sumu 
			number = number /10;
		}
			
		return (int)sum;
	}
	
	//metoda koja sabira sve cifre broja kreditne kartice sa desna na lijevo koji se nalaze na neparnim pozicijama
	public static int sumOfOddPlace(long number) {
		long sum = 0;
		//dok broj nije jednak nuli
		while(number != 0){
			//dijelimo ga modalno sa 10 da dobijemo prvu cifru
			long digit = number % 10;
			//a zatim ga dijelimo cjelobrojno sa 100 da mu "otkinemo" cifru koju smo dodali na sumu i prvu sledecu cifru na parnom mjestu
			number = number /100;
			sum = sum + digit;
		}
		return (int)sum;
	}
	
	//metoda koja provjerava da li proslijedjeni broj kartice pocinje odgovarajucim prefiksom
	public static boolean prefixMatched(long number, int d) {
		//broj kartice i prefiks pretvorimo u stringove
		String strNumber = number + "";
		String prefix = d+"";
		if (strNumber.startsWith(prefix)){
			return true;
		}
		return false;
	}
	
	//metoda koja vraca broj cifara broja kartice
	public static int getSize(long d) {
		String cardNumber = d + "";
		return cardNumber.length();
	}

}





