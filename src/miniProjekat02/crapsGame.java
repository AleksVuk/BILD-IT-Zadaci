package miniProjekat02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class crapsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		boolean gameWorks = true;
		//petlja koja kontrolise rad igrice, radi sve dok korisnik ne odabre izlaz, u jednom od prozora
		while (gameWorks){
			System.out.println("Dobro dosli u igricu \"craps\". ");
			System.out.println("1. Igraj novu igru.");
			System.out.println("2. Izlaz.");
			
			boolean works1 = true;
			int choice1 = 0;
			
			//petlja koja kontrolise pravilan unos (1 ili 2) u pocetnom prozoru
			while (works1){
				try{
					System.out.print("Odaberite: ");
					choice1 = input.nextInt();
					
					if (choice1 != 1  &&  choice1 != 2){
						System.out.println("Nemoguc unos, unesite 1 ili 2.");
					}
					works1 = false;
					
				}catch (InputMismatchException ex){
					System.out.println("Nemoguc unos, unesite 1 ili 2.");
					works1 = false;
					input.nextLine();
				}
			}
			
			if (choice1 == 1){
				boolean works2 = true;
				int choice2 = 0;
				//petlja koja kontrolise pravilan odabir (1, 2 ili 3) u drugom prozoru
				while (works2){
					try{
						System.out.println("----------------------");
						System.out.println("1. Bacite kockice.");
						System.out.println("2. Nazad na pocetak.");
						System.out.println("3. Izlaz.");
						System.out.print("Odaberite: ");
						choice2 = input.nextInt();
						
						if (choice2 != 1  &&  choice2 != 2  &&  choice2 != 3){
							System.out.println("Nemoguc unos, unesite 1, 2 ili 3.");
							continue;
						}
						else if(choice2 == 1){
							//generisanje dva nasumicna cijela broja od 1 do 6 (bacanje kocki)
							int dice1 =1 + (int)(Math.random() * 6);
							int dice2 =1 + (int)(Math.random() * 6);
							//generisane brojeve saberemo da bismo mogli da testiramo ishod igre uz pomoc metode "checkSum"
							int sum = dice1 + dice2;
							
							//ukoliko je suma jednaka brojevima 2, 3 ili 12, metoda "checkSum" vraca vrijednost 0 (korisnik je izgubio)
							if (checkSum(sum) == 0){
								System.out.println("----------------------");
								System.out.println("Bacili ste: " + dice1 + " + " + dice2 + " = " + sum);
								System.out.println("Izgubili ste.");
								System.out.println("----------------------");
								works2 = false;
							}
							//ukoliko je suma jednaka brojevima 7 ili 11, metoda "checkSum" vraca vrijednost 1 (korisnik je pobijedio)
							else if(checkSum(sum) == 1){
								System.out.println("----------------------");
								System.out.println("Bacili ste: " + dice1 + " + " + dice2 + " = " + sum);
								System.out.println("Cestitamo Vam, pobijedili ste.");
								System.out.println("-------------------------------");
								works2 = false;
							}
							//u ostalim slucajevima metoda "checkSum" vraca vrijednost 2, sto nastavlja igru i trazi ponovo bacanje kocki
							else if(checkSum(sum) == 2){
								System.out.println("----------------------");
								System.out.println("Bacili ste: " + dice1 + " + " + dice2 + " = " + sum);
								System.out.println("Poen je: " + sum);
								boolean works3 = true;
								
								//petlja koja kontrolise pravilan odabir u trecem prozoru u slucaju ponovnog bacanja kocki ili zapocinjanja nove igre
								while (works3){
									try{
										System.out.println("----------------------");
										System.out.println("1. Bacite ponovo. ");
										System.out.println("2. Zapocni novu igru.");
										System.out.print("Odaberite: ");
										int choice3 = input.nextInt();
										
										//pri ponovnom bacanju kocke generisu se nova dva cijela broja u rasponu od 1 do 6
										if (choice3 == 1){
											dice1 =1 + (int)(Math.random() * 6);
											dice2 =1 + (int)(Math.random() * 6);
											
											//sabiraju se nova dva broja
											int sum2 = dice1 + dice2;
											
											//ako je nova suma jednaka prvobitnoj sumi korisnik je pobijedio, program ga vraca na pocetak
											if (sum2 == sum){
												System.out.println("----------------------");
												System.out.println("Bacili ste: " + dice1 + " + " + dice2 + " = " + sum2);
												System.out.println("Cestitamo Vam, pobijedili ste.");
												System.out.println("-------------------------------");
												works2 = false;
												gameWorks = true;
												break;
											}
											//ako je nova suma jednaka 7, korisnik je izgubio, program ga vraca na pocetak
											else if (sum2 == 7){
												System.out.println("----------------------");
												System.out.println("Bacili ste: " + dice1 + " + " + dice2 + " = " + sum2);	
												System.out.println("Izgubili ste.");
												System.out.println("----------------------");
												works2 = false;
												gameWorks = true;
												break;
											}
											//ako nova suma nije jednaka ni 7 ni prvobitnoj sumi, program zahtjeva ponovno bacanje kocki
											else{
												System.out.println("----------------------");
												System.out.println("Bacili ste: " + dice1 + " + " + dice2 + " = " + sum2);
												continue;
											}
										}
										//ukoliko je korisnik odabrao u trecem prozoru da zeli da zapocne novu igru, program prekida trenutnu igru
										//i zapocinje novo bacanje kocki
										else if (choice3 == 2){
											works2 = true;
											gameWorks = true;
											break;
										}
										//unosi u trecem prozoru koji nisu jednaki 1 ili 2, zahtjevaju ponovan odabir
										else {
											System.out.println("Nemoguc unos, unesite 1 ili 2.");
										}
									}
									catch (InputMismatchException ex){
										System.out.println("Nemoguc unos, unesite 1 ili 2.");
										input.nextLine();
									}
								}
							}
							
						}
						//u slucaju odabira 2 u drugom prozoru, program korisnika vraca na pocetni prozor
						else if (choice2 == 2){
							works2 = false;
						}
						//u slucaju odabira 3 u drugom prozoru, program prekida sa radom
						else if (choice2 == 3){
							works2 = false;
							gameWorks = false;
						}
					}catch (InputMismatchException ex){
						System.out.println("Nemoguc unos, unesite 1, 2 ili 3.");
						input.nextLine();
					}
					
				}
			}
			//u slucaju odabira 2 u pocetnom prozoru program prekida sa radom
			else if (choice1 == 2){
				gameWorks = false;
			}
		
		}
		System.out.println("Napustili ste igricu \"craps\".");
		input.close();
	}
	//metoda za provjeravanje sume 
	public static int checkSum(int sum){
		if (sum == 2 || sum == 3 || sum == 12){
			return 0;							//ukoliko je korisnik izgubio vrati vrijednost 0
		}
		else if (sum == 7 || sum == 11){
			return 1;						//ukoliko je korisnik pobijedio vrati vrijednost 1
		}
		else{
			return 2;			//ukoliko je korisnik dobio poen vrati 2
		}
	}
	
	
	
	
	
	
	
	

}
