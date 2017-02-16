package zadaci_15_02_2017;

import java.util.InputMismatchException;

public class Zadatak03 {
	
	public static boolean isLeapYear(int year){				//metoda koja provjerava da li je godina prestupna
		
		if ((year%4==0&&year%100!=0)||(year%400==0)){		
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner (System.in);
		int year = 0;
		boolean works1 = true;
		
		//petlja koja kontrolise unos godine (mora biti veca od nule)
		while(works1){										
			try{
				System.out.print("Unesite godinu: ");
				year = input.nextInt();
				
				if (year <= 0){
					System.out.println("Unesite cijeli broj veci od nule!");
					works1 = true;
				}
				else {
					works1 = false;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Unesite cijeli broj veci od nule!");
				input.nextLine();
			}
		}
		boolean works2 = true;
		String month = "";
		
		//petlja koja kontrolise unos prva tri slova mjeseca, ukoliko se prva tri slova slazu sa nekim od naziva mjeseci
		//stampa se broj dana za taj mjesec, a ukoliko se prva tri slova ne zlazu ni sa jednim nazivom trazi se ponovni unos
		while (works2){
			System.out.print("Unesite prva tri slova naziva mjeseca (npr., dec): ");
			month = input.next();
			month = month.toLowerCase();
			
			if (month.equals("jan")){
				System.out.println("Jan " + year + ". ima 31 dan.");
				works2 = false;
			}
			else if(month.equals("feb")){
				if (isLeapYear(year)){											//poziv metode za provjeru je li godina prestupna
					System.out.println("Feb " + year + ". ima 29 dana.");
				}
				else{
					System.out.println("Feb " + year + ". ima 28 dana.");
				}
				works2 = false;
			}
			else if (month.equals("mar")){
				System.out.println("Mar " + year + ". ima 31 dan.");
				works2 = false;
			}
			else if (month.equals("apr")){
				System.out.println("Apr " + year + ". ima 30 dana.");
				works2 = false;
			}
			else if (month.equals("maj")){
				System.out.println("Maj " + year + ". ima 31 dan.");
				works2 = false;
			}
			else if (month.equals("jun")){
				System.out.println("Jun " + year + ". ima 30 dana.");
				works2 = false;
			}
			else if (month.equals("jul")){
				System.out.println("Jul " + year + ". ima 31 dan.");
				works2 = false;
			}
			else if (month.equals("avg")){
				System.out.println("Avg " + year + ". ima 31 dan.");
				works2 = false;
			}
			else if (month.equals("sep")){
				System.out.println("Sep " + year + ". ima 30 dana.");
				works2 = false;
			}
			else if (month.equals("oct")){
				System.out.println("Oct " + year + ". ima 31 dan.");
				works2 = false;
			}
			else if (month.equals("nov")){
				System.out.println("Nov " + year + ". ima 30 dana.");
				works2 = false;
			}
			else if (month.equals("dec")){
				System.out.println("Dec " + year + ". ima 31 dan.");
				works2 = false;
			}else{
				works2 = true;
			}
		}
		
		input.close();
		
	}

}
