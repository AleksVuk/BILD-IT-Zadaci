package zadaci_15_02_2017;

import java.util.InputMismatchException;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner (System.in);
		
		int number1 = (int)(Math.random()*31);			//generisanje 3 nasumicna broja od 0 do 30
		int number2 = (int)(Math.random()*31);
		int number3 = (int)(Math.random()*31);
		int result = 0;
		boolean works = true;
		System.out.println("Unesite rezultat zbira, koliko je?");
		
		//petlja koja kontrolise pravilnost unosa, i jednakost zbira tri nasumicna broja i unesenog rezultata od strane korisnika
		while (works){
			try{
				System.out.print(number1 + "+" + number2 + "+" + number3 + " = ");
				result = input.nextInt();
				
				if((number1 + number2 + number3) == result){					//tacan rezultat prekida rad programa
					System.out.println("Cestitamo pogodili ste rezultat.");
					works = false;
				}
				else {
					System.out.println("Pokusajte ponovo.");			//netacan rezultat daje novu sansu korisniku da pogodi rezultat
					works = true;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Pokusajte ponovo, koliko je?");
				input.nextLine();
			}
		}
		
		input.close();
	}

}
