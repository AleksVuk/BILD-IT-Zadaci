package zadaci_15_02_2017;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		
		System.out.println("Pravilo: sifra moze biti sastavljena samo od slova i brojeva, " + 
									"pri cemu mora imati najmanje 8 karaktera od kojih najmanje 2 broja.");
		
		int countLetters = 0;		//brojac slova
		int countDigits = 0;		//brojac brojeva
		boolean works = true;
		
		//petlja koja kontrolise unos, ponavlja se sve dok unesena sifra ne ispuni sve uslove definisane prema pravilu
		while (works){
			System.out.print("Unesite vasu sifru: ");
			String password = input.nextLine();
			
			for(int i=0; i<password.length(); i++){		//provjeravamo svaki karakter u unesenoj sifri
				char ch = password.charAt(i);
				if (Character.isLetterOrDigit(ch)){     
					if (Character.isLetter(ch)){		//ukoliko je karakter slovo uvecavamo brojac slova za 1
						countLetters++;
					}
					else{
						countDigits++;					//ukoliko je karakter broj uvecavamo brojac brojeva za 1
					}
				}
				else {
					System.out.println("Sifra moze da sadrzi samo slova i brojeve!");	//svi drugi karakteri osim slova i brojeva
					break;																//prekidaju petlju i ponavljaju unos sifre
				}
			}
			
			int sum = countDigits + countLetters;
			if (countDigits >= 2 && sum >= 8){			//svi uslovi ispunjeni prihvata se sifra
				System.out.println("Vasa sifra: " + password + " je prihvacena.");
				works = false;
			}
			else {
				System.out.println("Sifra nije prihvacena, pokusajte ponovo!");		//neki od uslova nije ispunjen, ponavlja se unos
				works = true;
			}
		}
		
		input.close();
		
	}

}
