package zadaci_16_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;		//brojac koji broji brojeve djeljive i sa 5 i sa 6, i koristimo ga za kontrolu ispisa brojeva po linijama
		
		System.out.println("Svi brojevi od 100 do 1000 koji su djeljivi i sa 5 i sa 6 su:\n ");
		
		for (int i=100; i<=1000; i++){					//petljom ispitujemo svaki broj od 100 do 1000 da li je djeljiv i sa 5 i sa 6
			if (i % 5 == 0 && i % 6 == 0){				//ukoliko jeste ispisemo ga, a ukoliko nije ispituje se prvi sledeci broj
				count++;								
				if (count % 10 != 0){
					System.out.print(i + " ");
				}
				else if(count % 10 == 0){
					System.out.println(i + " ");
				}
			}
		}
		
	}

}
