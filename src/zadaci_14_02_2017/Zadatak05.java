package zadaci_14_02_2017;

import java.util.InputMismatchException;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double velocity = 0;
		double acceleration = 0;
		boolean works1 = true;
		
		//petlja koja kontrolise unos brzine pri kojoj avion uzlijece (brzina mora da bude veca od 0)
		while(works1){										
			try{
				System.out.print("Unesite brzinu aviona pri kojoj avion uzlijece, u [m/s]: ");
				velocity = input.nextDouble();
				
				if (velocity <= 0){
					System.out.println("Unesite broj veci od nule!");
					works1 = true;
				}
				else {
					works1 = false;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Unesite broj veci od nule!");
				input.nextLine();
			}
		}
		
		boolean works2 = true;
		//petlja koja kontrolise unos ubrzanja aviona (ubrzanje mora da bude vece od nule)
		while(works2){										
			try{
				System.out.print("\nUnesite ubrzanje aviona u [m/s^2]: ");
				acceleration = input.nextDouble();
				
				if (acceleration <= 0){
					System.out.println("Unesite broj veci od nule!");
					works2 = true;
				}
				else {
					works2 = false;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Unesite broj veci od nule!");
				input.nextLine();
			}
		}
		//racunanje minimalne duzine piste za uzlijetanje aviona za unesene vrijednosti brzine i ubrzanja
		double minimalRunwayLength = (velocity * velocity) / (2 * acceleration);		
																						
		System.out.printf("\nMinimalna duzina piste da bi avion brzine uzlijetanja " + velocity + "[m/s], i ubrzanja od " +
							acceleration + "[m/s^2], uzletio, je: %.3f [m].", minimalRunwayLength);
		
		input.close();
	}

}
