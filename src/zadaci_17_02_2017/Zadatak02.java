package zadaci_17_02_2017;

public class Zadatak02 {
	//metoda koja provjerava da li je broj prost, (prost broj, vraca true; nije prost broj, vraca false),
	public static boolean isPrime(int number){ 
		//brojac djelilaca broja
		int count = 0;
		for(int i = 1; i <= number; i++){		
			if (number % i == 0){				
				count += 1;
			}
		}
		//ukoliko je brojac djelilaca broja jednak 2, znaci da je broj prost jer je djeljiv samo sa 1 i samim sobom
		if (count == 2){
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Svi \"twin prime\" brojevi od 0 do 10000 su: \n");
		//prvi broj koji ispitujemo da li je prost broj je broj 3, jer za 1 znamo da je poseban slucaj, i ne svrstava se u proste
		//brojeve, a broj dva takodje nije prost broj
		int first = 3;				
		
		//drugi broj koji ispitujemo da li je prost je definisan kao 5 jer "twin prime" brojevi se razlikuju za 2
		int second = 5;
		
		//brojac "twin prime" brojeva
		int countTwinPrimes = 0;
		
		//petlja radi dok drugi broj "second" ne postane jednak 10000, sto znaci da smo ispitali sve parove brojeva do 10000 
		while(second < 10000){
			if (isPrime(first) && isPrime(second)){
				countTwinPrimes += 1;
				
				//kontrola ispisa "twin prime" brojeva po linijama (10 parova po liniji)
					if (countTwinPrimes  % 10 != 0){
						System.out.printf("%6d %-6d", first, second);
					}
					else if (countTwinPrimes  % 10 == 0){
						System.out.printf("%6d %-6d\n", first, second);
					}
			}
			first = first+1;
			second = second+1;
		}
		
		
		
	}

}
