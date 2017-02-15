package zadaci_14_02_2017;

import java.util.InputMismatchException;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int investmentAmount = 0;
		double annualInterestRate = 0;
		int numberOfYears = 0;
		
		boolean works1 = true;
		boolean works2 = true;
		boolean works3 = true;
		
		//petlja koja kontrolise unos iznosa investicije (mora da bude veci od 0)
		while(works1){										
			try{
				System.out.print("Unesite iznos investicije: ");
				investmentAmount = input.nextInt();
				
				if (investmentAmount <= 0){
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
		
		//petlja koja kontrolise unos godisnje interesne stope koja mora biti veca od 0 a manja od 100.
		while(works2){										
			try{
				System.out.print("Unesite godisnju interesnu stopu: ");
				annualInterestRate = input.nextDouble();
				
				if (annualInterestRate <= 100 && annualInterestRate > 0 ){
					works2 = false;
				}
				else {
					System.out.println("Unesite broj veci od 0 a manji od 100!");
					works2 = true;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Unesite cijeli broj veci od 0 a manji od 100!");
				input.nextLine();
			}
		}
		
		//petlja koja kontrolise unos broja godina, koji mora biti veci od 0
		while(works3){
			try{
				System.out.print("Unesite broj godina: ");
				numberOfYears = input.nextInt();
				
				if (numberOfYears <= 0){
					System.out.println("Unesite cijeli broj veci od nule!");
					works3 = true;
				}
				else {
					works3 = false;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Unesite cijeli broj veci od nule!");
				input.nextLine();
			}
		}
		
		double monthlyInterestRate = annualInterestRate / 100 / 12;		//mjesecna interesna stopa
		
		double first = 1+monthlyInterestRate;							//broj koji se stepenuje
		
		double second = numberOfYears * 12;								//eksponent
		
		double futureInvestmentAmount = investmentAmount * Math.pow(first, second); //racunanje buduce vrijednosti investicije
		
		System.out.print("\nBuduca vrijednost investicije za period od "+numberOfYears+" godina, i vrijednost godisnje "
																+ "interesne stope od " + annualInterestRate+"%, iznosice: ");
		
		System.out.printf("%.2f",futureInvestmentAmount);		
		
		input.close();
	}

}
