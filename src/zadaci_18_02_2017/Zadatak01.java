package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> cities = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unesite naziv prvog grada: ");			//nazive gradova smjestamo u ArrayList-u "cities"
		String str1 = input.nextLine();
		cities.add(str1);
		System.out.print("Unesite naziv drugog grada: ");
		String str2 = input.nextLine();
		cities.add(str2);
		System.out.print("Unesite naziv treceg grada: ");
		String str3 = input.nextLine();
		cities.add(str3);
		
		//nakon sto su svi nazivi gradova smjesteni u listu, pozivamo metodu sort da ih sortira po abecednom redoslijedu
		Collections.sort(cities);
		System.out.println("\nUneseni nazivi gradova ispisani u abecednom redoslijedu: ");
		
		//ispis sadrzaja liste
		for(int i=0; i < cities.size(); i++){
			if (i == cities.size() - 1){
				System.out.print(cities.get(i) + ".");
				break;
			}
			System.out.print(cities.get(i) + ", ");
		}
		input.close();
	}

}
