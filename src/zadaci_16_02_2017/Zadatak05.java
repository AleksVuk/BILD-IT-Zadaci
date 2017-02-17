package zadaci_16_02_2017;

import java.util.InputMismatchException;

public class Zadatak05 {
	public static String convertMillis(long millis){	//metoda koja pretvara milisekunde u sate, minute i sekunde.
		long hours = millis / 3600000;
		millis = millis % 3600000;
		long minutes = millis / 60000;
		millis = millis % 60000;
		long seconds = millis / 1000;
		
		String strHours = hours + "";					//pretvaranje cjelobrojnih vrijednosti u satima, minutama i sekundama
		String strMinutes = minutes + "";				//u String vrijednosti 
		String strSeconds = seconds + "";
		
		return strHours + ":" + strMinutes + ":" + strSeconds + ".";	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		long millis = 0;
		boolean works = true;
		
		//petlja koja kontrolise pravilan unos broja milisekundi
		while (works){
			try{
				System.out.print("Unesite broj milisekundi: ");
				millis = input.nextLong();
				
				if(millis <= 0){
					System.out.println("Unesite cijeli broj veci od 0!");		//nepravilan unos ponavlja petlju
					works = true;
				}
				else{
					works = false;
				}
			}catch (InputMismatchException ex){
				System.out.println("Nemoguc unos. Pokusajte ponovo!");
				input.nextLine();
			}
		}
		 //poziv metode za pretvaranje broja milisekundi u sate, minute i sekunde
		String time = convertMillis(millis);  
		System.out.println("\n" + millis + " milisekundi pretvoreno u format vremena hh:mm:ss je: " + time);
		input.close();
	}

}
