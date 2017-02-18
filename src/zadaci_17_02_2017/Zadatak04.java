package zadaci_17_02_2017;

import java.util.Scanner;

public class Zadatak04 {
	//metoda koja broji broj ponavljanja karaktera u stringu
	public static int count(String str, char a){  
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == a){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite string: ");
		String str = input.nextLine();
		char ch = ' ';
		boolean works = true;
		
		//petlja koja onemogucava unos vise od jednog karaktera za provjeru njegovog ponavljanja u stringu
		while (works){
			System.out.print("Unesite karakter koji zelite prebrojati: ");
			String character = input.next();
			if(character.length() == 1){
				ch = character.charAt(0);
				works = false;
			}
			else{
				System.out.println("Unesite samo jedan karakter!"); 
				input.nextLine();
				works = true;
			}
		}
		//kontrola pravilnog ispisa u pri razlicitim brojevima ponavljanja karaktera u stingu
		if (count(str, ch) == 0){
			System.out.println("Navedeni karakter \"" + ch +"\" se ne nalazi u unesenom stringu!");
		}
		else if (count(str, ch) == 1){
			System.out.println("U unesenom stringu, karakter \"" + ch + "\" se ponavlja " + count(str, ch) + " put.");
		}
		else {
			System.out.println("U unesenom stringu, karakter \"" + ch + "\" se ponavlja " + count(str, ch) + " puta.");
		}
		
		input.close();
	}

}
