package zadaci_14_02_2017;

import java.util.InputMismatchException;

public class Zadatak03 {
	public static boolean isPalindrome(int number){
		
		int reverseNumber = reverse(number);			//pozivamo "reverse" metodu da dobijemo proslijedjeni broj ispisan obrnuto,
														//i ukoliko je broj jednak broju koji vrati metoda "reverse"
		if (reverseNumber == number){					//znaci da je broj palindrom
			return true;
		}else{
			return false;
		}
	}
	
	public static int reverse(int number){				//metoda koja proslijedjeni broj ispisuje obrnuto
		int reverseNumber = 0;
		int digit = 0;
		while (number != 0){							 
			digit = number % 10;							//poslednja cifra broja je ostatak dijeljenja broja sa 10
			reverseNumber = (reverseNumber * 10) + digit;
			number = number/10;								//broj uzima novu vrijednost, koja predstavlja rezultat 
		}													//cjelobrojnog djeljenja sa 10
		return reverseNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		boolean works1 = true;
		int number = 0;
		
		//petlja koja kontrolise unos broja koji mora biti veci od 0
		while(works1){										
			try{
				System.out.print("Unesite cijeli broj: ");
				number = input.nextInt();
				
				if (number <= 0){
					System.out.println("Unesite cijeli broj veci od 0!");
					works1 = true;
				}
				else {
					works1 = false;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Unesite cijeli broj veci od 0!");
				input.nextLine();
			}
		}
		
		System.out.println("\nUneseni broj je palindrom? " + isPalindrome(number));  
		input.close();
	}

}
