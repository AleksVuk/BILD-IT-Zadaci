package zadaci_15_02_2017;

import java.util.InputMismatchException;

public class Zadatak02 {
	
	public static boolean isLeapYear(int year){			//metoda koja provjerava da li je godina prestupna
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
		
		int month = 0;
		boolean works2 = true;
		//petlja koja kontrolise pravilan unos za odabir mjeseca (pravilan unos je broj od 1 do 12)
		while (works2){
			try{
				System.out.print("Unesite mjesec (broj od 1 do 12): ");
				month = input.nextInt();
				
				if (month >= 1 && month <= 12){			
					works2 = false;
				}
				else {
					works2 = true;
				}
				
			}catch (InputMismatchException ex){
				input.nextLine();
			}
			
		}
		
		int numberOfDays = 0;
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "Januar";
			numberOfDays = 31;
			break;
		case 2:
			monthName = "Februar";
			if (isLeapYear(year)) {					//ukoliko je godina prestupna, februar ima 29 dana
				numberOfDays = 29;
			} else {
				numberOfDays = 28;					//rgularna godina, februar ima 28 dana
			}
			
			break;
		case 3:
			monthName = "Mart";
			numberOfDays = 31;
			break;
		case 4:
			monthName = "April";
			numberOfDays = 30;
			break;
		case 5:
			monthName = "Maj";
			numberOfDays = 31;
			break;
		case 6:
			monthName = "Jun";
			numberOfDays = 30;
			break;
		case 7:
			monthName = "Jul";
			numberOfDays = 31;
			break;
		case 8:
			monthName = "Avgust";
			numberOfDays = 31;
			break;
		case 9:
			monthName = "Septembar";
			numberOfDays = 30;
			break;
		case 10:
			monthName = "Oktobar";
			numberOfDays = 31;
			break;
		case 11:
			monthName = "Novembar";
			numberOfDays = 30;
			break;
		case 12:
			monthName = "Decembar";
			numberOfDays = 31;
			break;
		}
		
		System.out.println(monthName + " " + year + ". godine, ima " + numberOfDays + " dana.");
		input.close();
	}

}
