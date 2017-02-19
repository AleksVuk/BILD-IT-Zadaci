package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		ArrayList <Integer> allNumbers = new ArrayList<>();						//lista u koju cemo smjestati unesene brojeve
		
		int number = 1;			//promjenljivoj "number" dodjeljujemo vrijednost 1 kako bi obezbijedili ulazak u petlju "while"
		
		int count = 0;			//brojac unesenih brojeva
		
		double sum = 0;														
		
		System.out.println("Unesite niz cijelih brojeva (nula prekida unos): ");
		boolean works = true;
		while (works){
			try{
				//while petlja koja ima dva uslova 1. 0 prekida unos(izlazak iz petlje); 2. ukoliko korisnik unese 100 brojeva izlazi se iz petlje;
				while (number!=0 && count<100){				 
					number = input.nextInt();					
				
					allNumbers.add(number);						
					sum+=number;								
					count++;									
				}
				if (allNumbers.get(0) == 0){
					System.out.println("Unijeli ste prvo 0, pokusajte ponovo: ");
					//ukoliko je prvi unos 0, brisemo sadrzaj liste, resetujemo "count", "number" resetujemo na 1
					allNumbers.clear();
					count = 0;
					number = 1;
					continue;				
				}
				
				double average = sum/(count-1);										//prosjek svih unesenih brojeva bez 0 (count-1)
				System.out.println("Suma svih unesenih brojeva je: " + sum + ".");
				System.out.printf("Prosjek svih unesenih brojeva je: %.3f", average);
			
				int countNegative = 0;													
				int countPositive = 0;												
			
				for (int i=0; i<allNumbers.size()-1; i++){							//sve brojeve iz liste (unesene brojeve (bez 0))
					if (allNumbers.get(i) > 0){										//poredimo sa 0 i uvecavamo brojace
						countPositive++;
					}else{
						countNegative++;
					}
				}
			
				System.out.println("\nPozitivnih brojeva ima: "+countPositive);
				System.out.println("Negativnih brojeva ima: "+countNegative);
				works = false;
			
			}catch (InputMismatchException ex){									
				System.out.println("Nemoguc unos, unesite cijele brojeve u rasponu (-2147483648 do 2147483647)! Pokusajte ponovo: ");
				//u slucaju Exception-a brisemo sadrzaj liste, sumu resetujemo na 0, i brojac unesenih brojeva resetujemo na 0 
				allNumbers.clear();
				sum = 0;
				count = 0;
				input.nextLine();
			}
		}
		input.close();
	}

}
