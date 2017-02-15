package miniProjekat01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Calendar {
	
	public static ArrayList<String> reminders = new ArrayList<>();	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Program funkcionise za unose iznad 1950. godine!\n");
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Path path = Paths.get("podsjetnici.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		
		int choice1 = 0;     
		int choice2 = 0;
		int year = 0;
		int month = 0;
		
		boolean works = true;
		while (works) {						//petlja koja kontrolise rad programa, ponavlja se sve dok korisnik ne odabere "Exit"
			
				boolean works1 = true;					//petlja koja kontrolise odabir prve cetiri stavke, pri pokretanju programa
				while (works1) {									
					try {
						System.out.println("1.Stampaj mjesec.");
						System.out.println("2.Stampaj podsjetnike.");
						System.out.println("3.Obrisi sve podsjetnike.");
						System.out.println("4.Exit");
						System.out.print("Odaberite: ");
						choice1 = input.nextInt();

						if (choice1 >= 1 && choice1 <= 4) {					//pri unosu broja od 1 do 4 program nastavlja sa radom 
							works1 = false;
						} else {
							System.out.println("Unesite cijeli broj od 1 do 4!");
							works1 = true;
						}
					} catch (InputMismatchException ex) {
						System.out.println("Unesite cijeli broj od 1 do 4!");
						input.nextLine();
						works1 = true;
					}
				}
				
				boolean works2 = true;
				
				if (choice1 == 1) {
					while (works2){					//petlja koja kontrolise drugi dio programa, ispis kalendara za drugi mjesec,
													//unos podsjetnika za odabrani mjesec, povratak na pocetak, i "Exit".
						boolean works3 = true;
						boolean works4 = true;
						boolean works5 = true;
						boolean works6 = true;
						boolean works7 = true;
						
						try{
						while (works3) {						//petlja koja kontrolise pravilan unos godine
							try {
								System.out.print("Unesite jednu godinu (npr., 2017): ");
								year = input.nextInt();

								if (year >= 1950) {
									works3 = false;
								} else {
									System.out.println("Unesite godinu iznad 1950.!!!");
									works3 = true;
								}

							} catch (InputMismatchException ex) {
								System.out.println("Pogresan unos unesite godinu iznad 1950.!");
								input.nextLine();
								works3 = true;
							}

						}

						while (works4) {							//petlja koja kontrolise pravilan unos mjeseca
							try {
								System.out.print("Unesite mjesec kao broj od 1 do 12: ");
								month = input.nextInt();

								if (month >= 1 && month <= 12) {
									works4 = false;
								} else {
									System.out.println("Unesite mjesec izmedju 1 i 12!!!");
									works4 = true;
								}
							}catch (InputMismatchException ex){
								System.out.println("Pogresan unos");
								input.nextLine();
								works4 = true;
							}
						}
					
								System.out.println();
								printCalendar(year, month); 		// pozivanje metode za ispis kalendara za unesenu godinu i mjesec
							
								while (works5){
									while (works6){		//kontrola odabira ponudjenih funkcija (unos od 1 do 4 program nastavlja sa radom) 
										try{
											System.out.println("\n1.Stampaj kalendar za drugi mjesec.");
											System.out.println("2.Dodaj podsjetnik za ovaj mjesec.");
											System.out.println("3.Nazad na pocetak.");
											System.out.println("4.Exit.");
											System.out.print("Odaberite: ");
											choice2 = input.nextInt();
										
											if (choice2>=1 && choice2<=4){
												works6 = false;
											}
											else{
												System.out.println("Pogresan unos, unesite cijeli broj od 1 do 4!");
												works6 = true;
											}
								
										}catch(InputMismatchException ex){
											System.out.println("Pogresan unos, unesite cijeli broj od 1 do 4!");
											input.nextLine();
											works6 = true;
										}
								
									}
									if (choice2 == 1){		//drugi odabir="1", prekida petlju "works5" i vraca na pocetak petlje "works2"
															//tako da mozemo ponovo da unesemo godinu i mjesec za stampanje
										works5 = false;
										works2 = true;
									}
									else if (choice2 == 2){	  //drugi odabir="2" omogucava nam unos podsjetnika za dan koji odaberemo 
										
										while(works7){		//petlja koja kontrolise pravilan unos dana u mjesecu
											try{
												System.out.print("Za koji dan u mjesecu zelite podsjetnik?");
												int day = input.nextInt();
												int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
											
												if (day>=1 && day<=numberOfDaysInMonth){				//pravilan odabir dana u mjesecu
																										//omogucava nam da unesemo 
																										//podsjetnik za taj dan
													System.out.println("Unesite tekst podsjetnika:");
													input.nextLine();
													String reminder = input.nextLine();
													addNewReminder(day, month, year, reminder);	//poziv metode za dodavanje novog podsjetnika
													System.out.println("Dodali ste podsjetnik.");
													
													works7 = false;				//povratak na pocetak petlje "works5"
													works5 = true;
													works6 = true;
												}
												else{
													System.out.println("Unesite broj izmedju 1 i "+ numberOfDaysInMonth);
												}
										
											}catch (InputMismatchException ex){
												System.out.println("Unesite cijeli broj");
												works7 = true;
												input.nextLine();
											}
										}
									}
									else if (choice2 == 3){  //drugi odabir = "3" vraca nas na pocetak programa
										works2 = false;
										works3 = false;
										works5 = false;
										works = true;
									}
									else if (choice2 == 4){	 //drugi odabir = "4" prekida rad programa
										works2 = false;
										works3 = false;
										works5 = false;
										works = false;
									}
								}
						
							} catch (InputMismatchException ex) {
								input.nextLine();
								works2 = true;
							}
					}
					
				}
				else if (choice1 == 2) {										
					printAllReminders();									//pozivanje metode za ispis svih podsjetnika
					works = true;
				}
				else if(choice1 == 3){										
					System.out.println("Obrisali ste sve podsjetnike!");
					deleteAllReminders();									//pozivanje metode za brisanje svih podsjetnika
					works = true;
				}
				else if (choice1 == 4) {				//napustanje programa
					works = false;
				}

		}
		System.out.println("Napustili ste program!");
		input.close();

	}

	public static void printCalendar(int year, int month) { 	// metoda koja ispisuje kalendar poziva dvije metode
																// jednu za ispis zaglavlja kalendara a drugu za tijelo

		printTitle(year, month); 		// pozivanje metode za ispis zaglavlja kalendara

		printBody(year, month);		    // pozivanje metode za ispis tijela kalendara

	}

	public static void printTitle(int year, int month) { 			// metoda za ispis zaglavlja kalendara
		
		System.out.println("        " + getMonthName(month) + " " + year + ".");
		System.out.println("-----------------------------");
		System.out.println(" Ned Pon Uto Sre Cet Pet Sub");
	}

	public static String getMonthName(int month) { // metoda za dobijanje naziva mjeseca na osnovu unesenog broja mjeseca
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "Januar";
			break;
		case 2:
			monthName = "Februar";
			break;
		case 3:
			monthName = "Mart";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "Maj";
			break;
		case 6:
			monthName = "Jun";
			break;
		case 7:
			monthName = "Jul";
			break;
		case 8:
			monthName = "Avgust";
			break;
		case 9:
			monthName = "Septembar";
			break;
		case 10:
			monthName = "Oktobar";
			break;
		case 11:
			monthName = "Novembar";
			break;
		case 12:
			monthName = "Decembar";
			break;
		}

		return monthName;
	}

	public static void printBody(int year, int month) { // metoda za ispisivanje tijela kalendara

		int startDay = getStartDay(year, month); // poziv metode za dobijanje prvog dana u sedmici u mjesecu

		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month); // poziv metode za dobijanje broja dana mjeseca

		for (int i = 0; i < startDay; i++) { // stampaj prazna polja prije prvog dana u sedmici
			System.out.print("    ");
		}

		for (int i = 1; i <= numberOfDaysInMonth; i++) { // stampaj dane u mjesecu
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0) { // kad dodje do 7 dana u sedmici prebaci u novi red
				System.out.println();
			}
		}

		System.out.println();
	}

	public static int getStartDay(int year, int month) { // metoda koja vraca pocetni dan u sedmici

		final int START_DAY_FOR_JAN_1_1950 = 7; // datum na osnovu koga racunamo pocetni dan

		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1950) % 7; // vraca prvi dan u sedmici
	}

	public static int getTotalNumberOfDays(int year, int month) {   // metoda za dobijanje ukupnog broja dana od 1.1.1950. do
																	// mjeseca u godini koju smo unijeli
		int total = 0; 

		for (int i = 1950; i < year; i++) { // ukupan broj dana od 1.1.1950. do unijete godine
			if (isLeapYear(i)) {
				total = total + 366;
			} else {
				total = total + 365;
			}
		}

		for (int i = 1; i < month; i++) { // ukupan broj dana od 1. januara unesene godine
			total = total + getNumberOfDaysInMonth(year, i); // do mjeseca u unesenoj godini
		}

		return total;
	}

	public static int getNumberOfDaysInMonth(int year, int month) { // metoda koja vraca broj dana u mjesecu
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}

		if (month == 2) {
			if (isLeapYear(year)) {			//ukoliko je godina prestupna, za februar vraca vrijednost 29
				return 29;
			} else {
				return 28;					//rgularna godina, za februar vraca vrijednost 28 
			}

		}

		return 0;
	}

	public static boolean isLeapYear(int year) { // metoda koja ispituje da li je godina prestupna
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void copyAllRemindersToList(){					//metoda koja kopira sve podsjetnike iz fajla u listu
		Path path = Paths.get("podsjetnici.txt");
		String line = "";
		
		try (BufferedReader reader = Files.newBufferedReader(path)){
				while ((line = reader.readLine()) != null){
					reminders.add(line);
				}
		}catch (IOException ex){
			ex.printStackTrace();
			
		}
	}
	
	public static void printAllReminders(){									//metoda koja ispisuje sve kreirane podsjetnike
		System.out.println("\nSvi vasi podsjetnici:\n ");
		Path path = Paths.get("podsjetnici.txt");
		String line = "";
		try (BufferedReader reader = Files.newBufferedReader(path)){
			while ((line = reader.readLine()) != null){
				System.out.println(line);
			}
		}catch (IOException ex){
			ex.printStackTrace();
			
		}
		System.out.println("--------------------------");
	}
	
	public static void addNewReminder(int day, int month, int year, String reminder){		//metoda koja dodaje novi podsjetnik
		
		copyAllRemindersToList();					//prvo kopira sve u ArrayList-u reminders
		
		String dayT = day+"";
		String monthT = month +"";
		String yearT = year+"";
		String fullReminder = dayT+"."+monthT+"."+yearT+". " + reminder;
		
		reminders.add(fullReminder);				//zatim dodaje i uneseni podsjetnik u ArrayList-u "reminders"
		
		writeAllRemindersToFile();					//zatim upisuje sve podsjetnike koji se nalaze u ArrayList-i "reminders"
		
		reminders.clear();							//brise sadrzaj ArrayList-e "reminders"
		
	}
	
	public static void writeAllRemindersToFile(){		//metoda koja upisuje iz ArrayList-e "reminders" u fajl
		Path path = Paths.get("podsjetnici.txt");
		
		try {
			BufferedWriter writer = Files.newBufferedWriter(path);
			for(int i=0; i<reminders.size(); i++){
				writer.write(reminders.get(i));
				writer.newLine();
			}
				writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteAllReminders(){			//metoda koja brise sve podsjetnike
		
		copyAllRemindersToList();						
		Path path = Paths.get("podsjetnici.txt");
		
		try {
			BufferedWriter writer = Files.newBufferedWriter(path);
			for(int i=0; i<1; i++){
				writer.write("");
			}
				writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		reminders.clear();			
	}

}
