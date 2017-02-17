package zadaci_16_02_2017;

import java.util.InputMismatchException;

public class Zadatak01 {
	
	public static String getDaysName(int number){		//metoda koja vraca naziv dana u sedmici
		int day = number +1;                        
		
		if (day % 7 == 1){
			return "ponedeljak";
		}
		else if (day % 7 == 2){
			return "utorak";
		}
		else if (day % 7 == 3){
			return "srijeda";
		}
		else if (day % 7 == 4){
			return "cetvrtak";
		}
		else if (day % 7 == 5){
			return "petak";
		}
		else if (day % 7 == 6){
			return "subota";
		}
		else 
			return "nedelja";
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		
		int startDay = 0;
		boolean works1 = true;
		
		//petlja koja kontrolise pravilan unos danasjneg dana u sedmici (pravilan unos 0 - 6)
		while (works1){
			try{
				System.out.print("Unesite cijeli broj za danasnji dan u sedmici (0 za ponedeljak, 6 za nedelju): ");
				startDay = input.nextInt();
				
				if (startDay >= 0 && startDay <= 6){
					works1 = false;
				}
				else {
					System.out.println("Pogresan unos!");			//nepravilan unos ponavlja petlju
					works1 = true;
				}
			}catch (InputMismatchException ex){
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		
		int days = 0;	
		boolean works2 = true;
		
		//petlja koja kontrolise pravilan unos broja dana nakon danasnjeg dana (pravilan unos je broj veci od 0) 
		while (works2){
			try{
				System.out.print("Unesite broj dana nakon danasnjeg dana: ");
				days = input.nextInt();
				
				if(days <= 0){
					System.out.println("Unesite cijeli broj veci od 0!");		//nepravilan unos ponavlja petlju
					works2 = true;
				}
				else{
					works2 = false;
				}
			}catch (InputMismatchException ex){
				System.out.println("Unesite cijeli broj veci od 0!");
				input.nextLine();
			}
		}
		
		int sum = startDay + days;
		System.out.println("Danasnji dan je " + getDaysName(startDay) + " a dan u buducnosti je " + getDaysName(sum) +"." );
		
		input.close();
	}

}
