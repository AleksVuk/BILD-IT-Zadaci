package zadaci_13_02_2017;

public class Zadatak05 {
	public static int countLetters(String s){			//metoda koja broji slova u stringu
		
		int countLetters = 0;							//brojac slova
		
		for (int i=0; i<s.length(); i++){
			char ch = s.charAt(i);						//uzimanje karaktera na poziciji (i), i provjeravanje
			if (Character.isLetter(ch)){				//da li je uzeti karakter slovo, ukoliko jeste povecavamo brojac slova
				countLetters++;
			}
		}
		
		return countLetters;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		 
		int numberOfLetters = countLetters(str);
		
		System.out.println("\nUneseni string sadrzi: " + numberOfLetters + " slova.");
		
		input.close();
		
	}

}
