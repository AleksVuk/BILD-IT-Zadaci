package zadaci_14_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite string: ");
		String string = input.nextLine();
		
		String oddCharacters = "";					//novi string na koji dodajemo karaktere na neparnim pozicijama
		
		for (int i=0; i<string.length(); i++){		
			if ((i+1) % 2 != 0){						//ako se karakter nalazi na neparnoj poziciji,
				oddCharacters += string.charAt(i);		//dodajemo ga u novi string
			}
		}
		
		System.out.println("\nKarakteri na neparnim pozicijama u unesenom stringu su: ");
		System.out.println(oddCharacters);													//ispis stringa sa neparnim karakterima
		input.close();
		
		
	}

}
