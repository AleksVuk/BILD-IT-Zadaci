package zadaci_16_02_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Zadatak04 {
	//metoda koja vraca maksimalnu vrijednost iz liste
		public static int max(ArrayList<Integer> list){
			int max=list.get(0);
			for(int i=1;i<list.size();i++){
				if (max<list.get(i)){
					max=list.get(i);
				}
			}
			return max;
		}
		//metoda koja broji broj ponavljanja maksimalne vrijednosti iz liste
		public static int count(ArrayList<Integer> list, int max){
			int count=0;
			for (int i=0;i<list.size();i++){
				if (max==list.get(i)){
					count++;
				}
			}
			return count;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner (System.in);
		ArrayList<Integer> list = new ArrayList <>();
		System.out.println("Unesite niz brojeva (0 prekida unos): ");
		int number=1;
		boolean works1 = true;
		boolean works2 = true;
		
		//petlja koja kontrolise unos cijelih brojeva 
		while (works1){
			while (works2){
				try{
					number=input.nextInt();   //inicijalizacija liste unesenim brojevima (do unosa broja 0 koji prekida unos).
					if(number == 0){
						works2 = false;
					}
					else{
						list.add(number);
					}
				}catch (InputMismatchException ex){
					System.out.println("Morate da unesete cijele brojeve! Pokusajte ponovo: ");
					
					//u slucaju unesenog slova ili decimalnog broja brisu se sve do tada unesene vrijednosti u listi
					list.clear();			
					
					input.nextLine();
				}
			}
		//pozivanje metoda "max" i "count" da bi dobili najveci broj u listi i broj njegovih ponavljanja.
			try{
				int maxValue = max(list);				//poziv metode za dobijanje maksimalne vrijednosti u listi
				
				int countMax = count(list, maxValue);	//poziv metode za prebrojavanje broja ponavljanja maksimalne vrijednosti u listi
				works1 = false;
				System.out.println("Najveci uneseni broj je "+maxValue+" i pojavio se "+countMax+" puta.");
			}catch (IndexOutOfBoundsException ex){
				System.out.println("Unijeli ste prvo 0! Pokusajte ponovo: ");   //ukoliko je prvi unos 0 program se vraca na pocetak
				works2 = true;												   	//i trazi ponovni unos niza cijelih brojeva
				input.nextLine();
			}
			
		}
		input.close();
	}

}
