package zadaci_11_02_2017;

public class Zadatak04 {
	public static void generateUpperCaseAndNumbers(){
		
		int countNumbers = 0;										//brojac brojeva
		int countLetters = 0;										//brojac slova
		
		System.out.println("100 nasumicnih brojeva od 0-100");
		for (int i=0; i<100; i++){
			int number = (int)(Math.random()*100);					//generisanje nasumicnog broja od 0 do 100
			if (countNumbers%10 != 0){								//i regulacija ispisa uz pomoc brojaca unijetih brojeva
				System.out.printf("%-4d", number);					
			}
			else if (countNumbers%10 == 0){
				System.out.printf("\n%-4d", number);
			}
			countNumbers++;
		}
		
		System.out.println("\n\n100 nasumicnih velikih slova: \n");
		
		for (int i=0; i<100; i++){									
			int number = 65+(int)(Math.random()*26);				//generisanje nasumicnog velikog slova i kontrola ispisa
			char letter = (char)(number);							//uz pomoc brojaca velikih slova (10 slova po liniji)
			countLetters++;
			if (countLetters%10 != 0){
				System.out.print(letter+" ");
			}
			else if (countLetters%10 == 0){							//ukoliko je slovo deseto u redu, ono se printa
				System.out.println(letter+" ");						//i prelazi se u novi red
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generateUpperCaseAndNumbers();			//pozivanje metode koja generise 100 nasumicnih brojeva od 0 do 100  
												//i 100 nasumicnih velikih slova
		
	}

}
