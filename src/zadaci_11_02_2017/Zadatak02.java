package zadaci_11_02_2017;

import java.util.InputMismatchException;

public class Zadatak02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		int [] isbn = new int [9];
		
		try {
			System.out.println("Unesite 9 cijelih brojeva: ");			//unos devet brojeva od strane korisnika
			for (int i=0; i<9; i++){
				isbn[i] = input.nextInt();								
			}
			int sum = 0;
			for (int i=0; i<isbn.length; i++){							//sabiramo proizvode svih unesenih brojeva 
				sum = sum + (isbn[i]*(i+1));							//sa odgovarajucim brojevima
			}
			int checksum = sum%11;
			
			if (checksum==10){
				System.out.println("ISBN-10 broj je: ");				//ukoliko je rezultat 10 na 9 unesenih brojeva dodajemo "X"
				for (int i=0;i<isbn.length;i++){
					System.out.print(isbn[i]);
				}
				System.out.println("X");
			}else{
				System.out.println("ISBN-10 broj je: ");				//ukoliko rezultat nije 10, onda na unesenih 9 brojeva
				for (int i=0;i<isbn.length;i++){						//dodajemo broj koji je rezultat modalnog dijeljenja
					System.out.print(isbn[i]);
				}
				System.out.println(checksum);
			}
		}catch (InputMismatchException ex){									//"hvatamo" Exception ukoliko je korisnikov unos pogresan
			System.out.println("Pogresan unos, unesite cijele brojeve!");
		}
			input.close();
	}

}
