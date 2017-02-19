package zadaci_18_02_2017;

public class Zadatak02 {
	//metoda koja provjerava da li je broj prost
	public static boolean isPrime(int number){ 
		//brojac djelilaca broja
		int count = 0;
		for(int i = 1; i <= number; i++){
			//ovaj dio koda je dodat da metoda ne bi vratila vrijednost "true" za broj 2
			if (number % 2 == 0){
				continue;
			}
			if (number % i == 0){				
				count += 1;
			}
		}
		if (count == 2){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//brojac prostih brojeva koji nam koristi za ispis odredjenog broja prostih brojeva po linijii
		int countPrimes = 0;     
		for (int i = 2; i <= 1000; i++){
			if (isPrime(i)){
				countPrimes++;
				if (countPrimes % 8 != 0){
					System.out.print(i + " ");
				}
				else{
					System.out.println(i + " ");
				}
			}
		}
	}

}
