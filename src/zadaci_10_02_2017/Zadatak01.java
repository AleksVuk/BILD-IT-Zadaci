package zadaci_10_02_2017;

import java.util.InputMismatchException;

public class Zadatak01 {
	
	public static void printPrimes(int n1, int n2, int n3){
		int countDivisors = 0;								
		int countPrimes = 0;
		for (int i=n1;i<=n2;i++){							//ispitujemo svaki proj od pocetnog broja do krajnjeg broja
			for (int j=2;j<i;j++){							//da li je djeljiv sa nekim brojem od 2 do broja koji je manji za jedan.
				if(i%j==0){									//ukoliko je djeljiv sa nekim brojem ,
					countDivisors++;						//uvecamo brojac djelilaca za jedan.
				}
			}
			if (countDivisors==0){							//ukoliko je broj djelilaca 0, znaci da je ispitani broj prost broj
				countPrimes++;								//uvecamo brojac prostih brojeva za jedan
				if (countPrimes%n3!=0){						//dio koda koji kontrolise ispis prostih brojeva po linijama
					System.out.print(i+" ");				//u zavisnosti od "n3" to jest broja koji definise
				}											//zeljeni broj prostih brojeva po liniji
				else if(countPrimes%n3==0){
					System.out.println(i+" ");
				}
			
			}
			countDivisors=0;								//resetujemo brojac djelilaca na nulu za sledeci prolaz kroz petlju
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner (System.in);
		try{
			System.out.print("Unesite pocetni broj: ");										//preko skenera kupimo unos
			int n1 = input.nextInt();                                                       //od korisnika za pocetni broj "n1",
		
			System.out.print("Unesite krajnji broj: ");										//krajnji broj "n2" i za zeljeni broj
			int n2 = input.nextInt();														//ispisanih brojeva po liniji "n3".
		
			System.out.print("Koliko prostih brojeva zelite da bude ispisano po liniji? ");
			int n3 = input.nextInt();
		
			printPrimes(n1, n2, n3);   //pozivanje metode za ispis prostih brojeva
			
		}catch (InputMismatchException ex){
			System.out.println("Pogresan unos, unesite cijele brojeve!");
		}
		
		input.close();
		
	}

}
