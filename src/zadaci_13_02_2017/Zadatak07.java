package zadaci_13_02_2017;

import java.util.InputMismatchException;

public class Zadatak07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		long numberOfYears = 0;
		boolean works = true;
		
		while (works) {
			try {
				
				boolean works2 = true;
				
				//prvi dio zadatka kada se u proslost vracamo uz pomoc aviona koji putuje jednu godinu po sekundi
				while (works2){
					System.out.print("Unesite broj godina koliko zelite da se vratite u proslost: ");
					numberOfYears = input.nextLong();
					if (numberOfYears <= 0) {
						System.out.println("Morate da unesete cijeli broj koji je veci nule!");
						works2 = true;
					} else {
						works2 = false;
					}
				}
				
				works = false;					
				
				//vrijednost unesenog broja godina dodjeljujemo promjenljivim temp1, temp2, temp3, i koristimo ih
				//kao broj godina da izracunamo trazene podatke u zadatku.
				
				long temp1 = numberOfYears;	
				long temp2 = numberOfYears;
				long temp3 = numberOfYears;
				
				System.out.println("\nUz pomoc aviona koji prelazi jednu godinu za jednu sekundu!!!");
				System.out.println("Da se vratite " + numberOfYears + " godina u proslost, potrebno vam je: ");

				long hours = numberOfYears / 3600;			//racunanje potrebnog broja sati, minuta i sekundi
				numberOfYears = numberOfYears % 3600;		//da se vratimo odredjeni broj godina u proslost
				long minutes = numberOfYears / 60;
				numberOfYears = numberOfYears % 60;
				long seconds = numberOfYears;

				System.out.println(hours + " sati, " + minutes + " minuta, i " + seconds + " sekundi.");

				long years = temp1 / 31557600;				//racunanje potrebnog broja godina, mjeseci, i dana
				temp1 = temp1 % 31557600;					//da se vratimo odredjeni broj godina u proslost
				long months = temp1 / 2629800;
				temp1 = temp1 % 2629800;
				double days = temp1 / 86400.0;

				System.out.println("\nIli drugacije izrazeno: ");
				System.out.printf(years + " godina, " + months + " mjeseci, i %.3f dana.\n", days);

				double mileniums = temp2 / 31557600000.0;			//racunanje broja milenijuma 

				System.out.println("\nIzrazeno u milenijumima: ");
				System.out.printf("%.8f milenijuma.\n", mileniums);

				long centuries = temp2 / 3155760000L;				//racunanje broja vijekova (stoljeca) i decenija
				temp2 = temp2 % 3155760000L;
				double decades = temp2 / 315576000.0;

				System.out.println("\nIzrazeno u vijekovima i decenijama: ");
				System.out.printf(centuries + " vijekova i %.5f decenija.", decades);
				
				//drugi dio zadatka, u kome nas jedan korak vraca jednu godinu u proslost
				
				System.out.println("\n\nUkoliko zamislimo da nas jedan korak (75cm) vraca jednu godinu u proslost!!!");
				System.out.println("Da se vratite " + temp3 + " godina u proslost, potrebno vam je da prohodate: ");
				
				double temp4 = temp3;
				double kilometers = temp4 / 1333.33;		//racunanje kilometara, metara i centimetara koje trebamo da prohodamo
				kilometers = Math.floor(kilometers);		// da se vratimo odredjeni broj godina u proslost
				temp4 = temp4 - (kilometers * 1333.33);
				
				double meters = temp4 / 1.3333;
				meters = Math.floor(meters);
				temp4 = temp4 - (meters * 1.3333);
				
				double centimeters = temp4 / 0.013333;
				System.out.printf("%.1f kilometara, %.1f metara i %.3f centimetara.\n", kilometers, meters, centimeters);
				
				//broj prosjecnih stadiona koje moramo da prehodamo da bi se vratili odredjeni broj godina u proslost
				double stadiums = temp3 / 140.0;
				System.out.printf("\n\nProsjecan fudbalski stadion bi prehodali %.2f puta.", stadiums);
				
				//koliko puta bi bilo botrebno prehodati zemljin obim da se vratimo odredjeni broj godina u proslost
				double earth = temp3 / 53433333.33;
				System.out.printf("\n\nObim zemlje bi prehodali %.3f puta.", earth);
				
			} catch (InputMismatchException ex) {
				System.out.println("Morate da unesete broj!");
				works = true;
				input.nextLine();
			}
		}
		
		
		input.close();

	}

}
