package zadaci_08_02_2017;

public class Zadatak02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		System.out.println("Unesite string: ");
		//unos stringa od strane korisnika
		String str = input.nextLine();
		int countVocal = 0;
		int countConsonant = 0;
		//provjeravanje svakog karaktera u stringu i brojanje suglasnika i samoglasnika
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if (Character.isLetter(ch)){
				char ch2 = Character.toUpperCase(ch);
				if (ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'){
					countVocal++;
				}else{
					countConsonant++;
				}
				
			}
		}
		System.out.println("Broj samoglasnika u unesenom stringu je: "+countVocal);
		System.out.println("Broj suglasnika u unesenom stringu je: "+countConsonant);
		input.close();
	}

}
