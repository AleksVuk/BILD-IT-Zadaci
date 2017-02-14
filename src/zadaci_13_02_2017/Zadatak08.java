package zadaci_13_02_2017;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class Zadatak08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		long lightYears = 0;
		boolean works = true;
		while (works) {
			try {
				
				boolean works2 = true;
				
				//unos broja svjetlosnih godina koje bi zeljeli putovati
				while (works2){
					System.out.print("Unesite broj svjetlosnih godina koje bi zeljeli putovati: ");
					lightYears = input.nextLong();
					if (lightYears <= 0) {
						System.out.println("Morate da unesete broj koji je veci nule!");
						works2 = true;
					} else {
						works2 = false;
					}
				}
				
				works = false;
				
				String years = lightYears+"";                                    //pretvaranje broja godina u string
				
				BigDecimal temp1 = new BigDecimal (years);						//pretvaranje broja godina u velliki decimalni broj
				
				BigDecimal kilometersPerYear = new BigDecimal ("9460730472580.8");	//broj kilometara koje svjetlost prijedje za jednu godinu
				
				BigDecimal totalKilometers = temp1.multiply(kilometersPerYear);  	//ukupan broj kilometara koje svjetlost prijedje za uneseni broj 
																					//svjetlosnih godina
				
				System.out.println("Za "+lightYears+" svjetlosnih godina, svjetlost prijedje "+totalKilometers+" kilometara.");
				
				BigDecimal astronomicalUnit = new BigDecimal("149600000.0");		//duzina astronomske jedinice u kilometrima		
				
				//ukupan broj astronomskih jedinica koje svjetlost prijedje za 
				//odredjeni broj svjetlosnih godina
				BigDecimal astronomicalUnits = totalKilometers.divide(astronomicalUnit, 5, BigDecimal.ROUND_UP); 
				
				System.out.println("\nZa " + lightYears + " svjetlosnih godina, svjetlost prijedje " + astronomicalUnits + " astronomskih jedinica");
				
				
				//broj parseka koje svjetlost prijedje za odredjeni broj svjetlosnih godina
				double parsecs = lightYears / 3.26;
				
				System.out.printf("\nZa vrijeme od " + lightYears + " svjetlosnih godina, svjetlost prijedje %.3f parseka.", parsecs );
				
				double heliosSpeed = 252792.537; //Helios 2 - brzina u [km/h]
				
				double lightYear = 9460730472580.800; //udaljenost od jedne svjetlosne godine iskazane u [km]
				
				double timeInHours = lightYear / heliosSpeed; //broj sati da se sa Helios 2 prijedje jedna svjetlosna godina
				
				double oneYearHours = 8766;  //ukupan broj sati koiji ima jedna godina
				
				double totalYears = timeInHours / oneYearHours;
				totalYears = Math.floor(totalYears);
				
				timeInHours = timeInHours - (totalYears * oneYearHours);
				
				double months = timeInHours / 730.5;   //730.5 je priblizna vrijednost sati koje sadrzi jedan mjesec (8766/12)
				months = Math.floor(months);
				
				timeInHours = timeInHours - (months * 730.5);
				
				double days = timeInHours / 24;			
				
				System.out.printf("\n\nDa bi presli udaljenost od " + lightYears + " svjetlosnih godina, sa Helios 2 objektom"
						+ " potrebno nam je " + totalYears +" godina, " + months + " mjeseci, i %.1f dana.\n", days);
				
				
			} catch (InputMismatchException ex) {
				System.out.println("Morate da unesete broj!");
				works = true;
				input.nextLine();
			}
		}
		
		
		input.close();

	}

}
