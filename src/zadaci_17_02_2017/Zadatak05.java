package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		boolean works = true;
		//petlja koja kontrolise pravilan unos stringova (drugi string mora da ima manje karaktera od prvog stringa)
		while (works){
			System.out.print("Unesite prvi string: ");
			String str1 = input.nextLine();
			System.out.print("Unesite drugi string: ");
			String str2 = input.nextLine();
			
			if (str2.length() > str1.length()){
				System.out.println(str2 + " ne moze da bude substring prvog stringa " + str1 + ", jer ima vise karaktera od njega!");
				System.out.println("Pokusajte ponovo.");
			}
			else{
				if (str1.contains(str2)){
					System.out.println("String " + str2 + " je substring stringa " + str1 +".");
				}
				else {
					System.out.println("String " + str2 + " nije substring stringa "+ str1);
				}
				works = false;
			}
		}
		input.close();
	}

}
