package zadaci_21_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int number = 10;
		System.out.println("Prvih 100 palindrom prostih brojeva: ");
		while (count < 100){
			int reverseNumber = reverse(number);
			//ako je broj prost, ispitujemo da li je palindrom, ako je palindrom ispisemo ga, ako nije ispitujemo sledeci broj
			if (isPrime(number)  &&  number == reverseNumber){
				count++;
				if (count % 10 == 0){
					System.out.printf("%-6d\n", number);
				}
				else {
					System.out.printf("%-6d", number);
				}
			}
			
			number += 1;
		}
		
	}
	//metoda koja ispituje da li je broj prost
	public static boolean isPrime(int number){
		for (int i = 2; i < number; i++){
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}
	//metoda koja vraca broj ispisan naopako
	public static int reverse(int number){
		int reverseNumber = 0;
		while(number != 0){
			int digit = number % 10;
			reverseNumber = reverseNumber * 10 + digit;
			number = number / 10;
		}
		return reverseNumber;
	}
	

}
