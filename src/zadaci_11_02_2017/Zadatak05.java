package zadaci_11_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		ArrayList <Integer> allNumbers = new ArrayList<>();						//lista u koju cemo smjestati unesene brojeve
		
		int number = 1;															//promjenljivoj "number" dodjeljujemo vrijednost 1
																				//kako bi obezbijedili ulazak u petlju "while"
		
		int count = 0;															//brojac unesenih brojeva
		
		double sum = 0;														
		
		System.out.println("Unesite niz cijelih brojeva (nula prekida unos): ");
		
		try{
			while (number!=0 && count<100){					//while petlja koja ima dva uslova 1. 0 prekida unos(izlazak iz petlje);  
				number = input.nextInt();					//2. ukoliko korisnik unese 100 brojeva izlazi se iz petlje;
				
				allNumbers.add(number);						//dodavanje unesenog broja u listu
				sum+=number;								//uvecavanje sume za uneseni broj
				count++;									//uvecavanje brojaca unesenih brojeva sa svakim unosom
			}
			
			double average = sum/(count-1);										//prosjek svih unesenih brojeva bez 0 (count-1)
			
			System.out.println("Prosjek svih unesenih brojeva je: "+average);
			int countLower = 0;													//brojac brojeva ispod prosjeka
			
			int countGreater = 0;												//brojac brojeva iznad ili jednakih prosjeku
			
			for (int i=0; i<allNumbers.size()-1; i++){							//sve brojeve iz liste (unesene brojeve (bez 0))
				if (allNumbers.get(i)>=average){								//poredimo sa prosjekom i uvecavamo brojace
					countGreater++;
				}else{
					countLower++;
				}
			}
			
			System.out.println("Brojeva iznad ili jednakih prosjeku ima: "+countGreater);
			System.out.println("Brojeva ispod prosjeka ima: "+countLower);
			
		}catch (InputMismatchException ex){									
			System.out.println("Pogresan unos, unesite cijeli broj!");
		}
		
		input.close();
		
	}

}
