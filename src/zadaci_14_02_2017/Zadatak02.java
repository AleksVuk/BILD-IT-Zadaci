package zadaci_14_02_2017;

import java.util.InputMismatchException;

public class Zadatak02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int count = 0;
		int startYear = 0;
		int endYear = 0;
		
		boolean works1 = true;
		
		//petlja koja kontrolise unos pocetne godine (mora biti veca od nule)
		while(works1){										
			try{
				System.out.print("Unesite pocetnu godinu: ");
				startYear = input.nextInt();
				
				if (startYear <= 0){
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
		
		//petlja koja kontrolise unos krajnje godine (mora biti veca od pocetne godine)
		while (works2){
			try{
				System.out.print("Unesite krajnju godinu: ");
				endYear = input.nextInt();
				
				if (endYear < startYear){
					System.out.println("Krajnja godina mora biti veca od "+startYear);
					works2 = true;
				}
				else{
					works2 = false;
				}
						
			}catch (InputMismatchException ex){
				System.out.println("Krajnja godina mora biti veca od "+ startYear);
				input.nextLine();
			}
		}
		
		System.out.println("\nSve prestupne godine od " + startYear + ". godine do " + endYear + ". godine su: ");
		
		for (int i=startYear; i<=endYear; i++){				//racunanje svih prestupnih godina izmedju pocetne i krajnje godine
			int year=i;
			if ((year%4==0&&year%100!=0)||(year%400==0)){ 	//uslov koji mora biti ispunjen da bi godina bila prestupna.
				count++;
				if (count%10!=0){
					System.out.print(year+" ");
				} 
				else{
					System.out.println(year+" ");
				}
			}
		}
		
		input.close();
		
	}

}
