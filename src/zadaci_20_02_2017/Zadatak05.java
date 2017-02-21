package zadaci_20_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak05 {
	//metoda koja izdvaja po jedan broj iz liste unesenih brojeva i njima inicijalizira drugu listu
	public static void initializeUniqueNumbers (ArrayList<Integer> allNumbers, ArrayList<Integer> uniqueNumbers){
		//brojac pojavljivanja broja
		int count = 0;
		//praznoj listi dodajemo broj koji se nalazi na nultom indeksu u listi svih unesenih brojeva
		uniqueNumbers.add(allNumbers.get(0));
		
		//izdvajanje brojeva iz liste svih unesenih brojeva i inicijaliziranje druge liste
		for (int i = 0; i < allNumbers.size(); i++){
			for (int j = 0; j < uniqueNumbers.size(); j++){
				if (allNumbers.get(i) == uniqueNumbers.get(j)){		
					count++;
				}
			}
			//ukoliko je brojac ponavljanja nekog broja jednak 0 taj broj izdvajamo iz liste i dodajemo ga u drugu listu
			if (count == 0){
				uniqueNumbers.add(allNumbers.get(i));
			}
			
			count = 0;
		}
		
	}
	//metoda koja prebrojava broj ponavljanja brojeva u listi svih unesenih brojeva
	public static int countUniqueNumbers(ArrayList<Integer> allNumbers, int n){
		int countUnique = 0;
		for (int i = 0; i< allNumbers.size(); i++){
			if (allNumbers.get(i) == n){
				countUnique++;
			}
		}
		
		return countUnique;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//lista u koju cemo smjestati unesene brojeve
		ArrayList <Integer> allNumbers = new ArrayList<>();				
		//lista u koju cemo smjestati samo jedinstvene brojeve iz prve liste
		ArrayList <Integer> uniqueNumbers = new ArrayList<>();
		
		int number = 1;			//promjenljivoj "number" dodjeljujemo vrijednost 1 kako bi obezbijedili ulazak u petlju "while"
		
		System.out.println("Unesite niz cijelih brojeva u rasponu od 1 do 100 (nula prekida unos): ");
		boolean works = true;
		//petlja koja kontrolise pravilan unos niza cijelih brojeva
		while (works){
			try{
				//petlja ciji rad prekida unosenje broja 0 ili broja veceg od 100 ili manjeg od 0
				while (number!=0){				 
					number = input.nextInt();
					
					if (number >= 0  &&  number <= 100){
						allNumbers.add(number);		
					}
					else {
						allNumbers.clear();
						break;
					}
				}
				if (allNumbers.size() == 0){
					System.out.println("Nemoguc unos, unesite cijele brojeve u rasponu (od 1 do 100)! Pokusajte ponovo: ");
					number = 1;
					continue;
				}
				else if (allNumbers.get(0) == 0){
					System.out.println("Unijeli ste prvo 0, pokusajte ponovo: ");
					//ukoliko je prvi unos 0, brisemo sadrzaj liste, "number" resetujemo na jedan da omogucimo ulazak u petlju za inicijalizaciju liste
					allNumbers.clear();
					number = 1;
					continue;				
				} 
				//brisemo nulu iz liste 
				allNumbers.remove(allNumbers.size() - 1);
				//pozivanje metode za inicijalizaciju liste "uniqueNumbers"
				initializeUniqueNumbers(allNumbers, uniqueNumbers);
				for (int i = 0; i < uniqueNumbers.size(); i++){
					if (countUniqueNumbers(allNumbers, uniqueNumbers.get(i)) == 1){
						System.out.println("Broj " + uniqueNumbers.get(i) + " se ponovio jednom.");
					}
					else {
						System.out.println("Broj " + uniqueNumbers.get(i) + " se ponavlja " + countUniqueNumbers(allNumbers, uniqueNumbers.get(i)) + " puta.");
					}
				}
				
				works = false;
			
			}catch (InputMismatchException ex){									
				System.out.println("Nemoguc unos, unesite cijele brojeve u rasponu (od 1 do 100)! Pokusajte ponovo: ");
				//u slucaju Exception-a brisemo sadrzaj liste 
				allNumbers.clear();
				number = 1;
				input.nextLine();
			}
		}
		
		input.close();
	}

}
