package zadaci_16_02_2017;

import java.util.InputMismatchException;

public class Zadatak02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner (System.in);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		
		System.out.println("Sve vrijednosti unesite u stepenima!");
		boolean works1 = true;
		
		//petlja koja kontrolise pravilan unos geografske sirine prve tacke (x1)
		while (works1){
			try{
				System.out.print("Unesite geografsku sirinu prve tacke: ");
				x1 = input.nextDouble();
				
				if (x1 >= -90 && x1 <= 90){
					works1 = false;
				}
				else{
				System.out.println("Pogresan unos, unesite broj u rasponu od -90 do 90");	//iz razloga sto istok i jug oznacavamo
					works1 = true;															// predznakom (-), unos je ogranicen na
				}																			//raspon brojeva od -90 do 90 za geografsku
																							//sirinu, a za geografsku duzinu unos je 
			} catch (InputMismatchException ex){											//ogranicen na raspon brojeva od -180 do 180
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		
		boolean works2 = true;
		
		//petlja koja kontrolise pravilan unos geografske duzine prve tacke (y1)
		while (works2){
			try{
				System.out.print("Unesite geografsku duzinu prve tacke: ");
				y1 = input.nextDouble();
				
				if (y1 >= -180 && y1 <= 180){
					works2 = false;
				}
				else{
				System.out.println("Pogresan unos, unesite broj u rasponu od -180 do 180");
					works2 = true;
				}
				
			} catch (InputMismatchException ex){
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		
		boolean works3 = true;
		
		//petlja koja kontrolise pravilan unos geografske sirine druge tacke (x2)
		while (works3){
			try{
				System.out.print("\nUnesite geografsku sirinu druge tacke: ");
				x2 = input.nextDouble();
				
				if (x2 >= -90 && x2 <= 90){
					works3 = false;
				}
				else{
				System.out.println("Pogresan unos, unesite broj u rasponu od -90 do 90");
					works3 = true;
				}
				
			} catch (InputMismatchException ex){
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		boolean works4 = true;
		
		//petlja koja kontrolise pravilan unos geografske duzine druge tacke (y2)
		while (works4){
			try{
				System.out.print("Unesite geografsku duzinu druge tacke: ");
				y2 = input.nextDouble();
				if (y2 >= -180 && y2 <= 180){
					works4 = false;
				}
				else{
				System.out.println("Pogresan unos, unesite broj u rasponu od -180 do 180");
					works4 = true;
				}				
			} catch (InputMismatchException ex){
				System.out.println("Pogresan unos!");
				input.nextLine();
			}
		}
		
		x1 = Math.toRadians(x1);				//pretvaranje vrijednosti unesenih u stepenima u vrijednosti u radijanima
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		double earthRadius = 6371.01;		//radius zemlje izrazen u [km]
		
		double greatCircleDistance = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)) ;
		
		System.out.println("Udaljenost dviju unesenih tacaka na povrsini sfere je: " + greatCircleDistance + "[km]");
		input.close();
	}

}
