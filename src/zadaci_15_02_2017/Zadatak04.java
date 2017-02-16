package zadaci_15_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.println("Svi \"savrseni\" brojevi od 0 do 10000 su: ");
		for (int number=1; number<=10000; number++){						//provjeravamo svaki broj od 0 do 10000
			
			for (int i=number-1; i>=1; i--){					//ukoliko je neki broj djelilac broja koji se provjerava dodajemo ga
				if (number % i == 0){							//na sumu, zatim provjeravamo prvi manji cijeli broj i tako sve dok ne 
					sum = sum + i;								//dodjemo do 1, kada petlja zavrsava svoj rad
				}
			}
			if (sum == number){									//uporedjujemo broj sa sumom svih njegovih djelilaca, ukoliko je 
				System.out.print(number + "  ");				//jednak sumi, taj broj se ispisuje, a ukoliko nije, istim postupkom 
			}													//se provjerava prvi veci cijeli broj
			
			sum = 0;							               //nakon svakog prolaska kroz petlju resetujemo sumu na 0
		}
		
	}

}
