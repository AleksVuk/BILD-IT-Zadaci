package zadaci_20_02_2017;

public class Zadatak03 {
	//metoda koja ispituje da li je broj prost 
	public static int isPrime(int n){
		for (int i = 2; i < n; i++){
			if (n % i == 0){
			return 0;					//nije prost vraca vrijednost 0
			}
		}
	return 1;							//jeste prost vraca vrijednost 1
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//brojac prostih brojeva, koristimo ga za kontrolu ispisa po linijama (10 brojeva po liniji)
		int count = 0;
		System.out.println("Svi prosti brojevi u rasponu od 0 do 100000: ");
		for (int i = 3; i <=100000; i++){			
			if (isPrime(i) == 1){
				count++;
				if (count % 10 == 0){
					System.out.printf("%-6d\n", i);
				}
				else {
					System.out.printf("%-6d", i);
				}
			}
		}
	}

}
