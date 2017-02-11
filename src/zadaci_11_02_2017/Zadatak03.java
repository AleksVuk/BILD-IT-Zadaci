package zadaci_11_02_2017;

import java.util.InputMismatchException;

public class Zadatak03 {
	public static void displaySortedNumbers(double num1, double num2, double num3){			//metoda koja sortira i printa 
																							//proslijedjene brojeve u 
		if (num1<=num2 && num1<=num3){														//rastucem redoslijedu
			System.out.println(num1+" "+Math.min(num2, num3)+" "+Math.max(num2, num3));	
		}
		else if (num2<=num1 && num2<=num3){
			System.out.println(num2+" "+Math.min(num1, num3)+" "+Math.max(num1, num3));
		}
		else if (num3<=num1 && num3<=num2){
			System.out.println(num3+" "+Math.min(num1, num2)+" "+Math.max(num1, num2));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		try{
			System.out.print("Unesite prvi broj: ");							//unos prvog broja od strane korisnika
			double num1 = input.nextDouble();
			
			System.out.print("Unesite drugi broj: ");							//unos drugog broja od strane korisnika
			double num2 = input.nextDouble();
			
			System.out.print("Unesite treci broj: ");							//unos treceg broja od strane korisnika
			double num3 = input.nextDouble();
			
			System.out.print("Vasi brojevi sortirani u rastucem redoslijedu: ");
			displaySortedNumbers(num1, num2, num3);								//poziv metode za sortiranje unesena tri broja
		
		}
		catch (InputMismatchException ex){										//ukoliko je korisnikov unos nepravilan
			System.out.println("Pogresan unos, unesite broj!");					//program uhvati Exception i printa poruku
			
		}
		input.close();
	}

}
