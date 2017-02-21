package zadaci_21_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int number = 10;
		System.out.println("Prvih 100 emirp brojeva: ");
		while (count < 100){
			//ako je broj prost, ispitamo da li je taj broj prost kad je ispisan naopako, ako jeste, ispitujemo da li je palindrom
			//ako nije palindrom ispisemo ga, ako jest ispitujemo sledeci broj
			if (isPrime(number)){
				int reverseNumber = reverse(number);
				if (isPrime(reverseNumber) && number != reverseNumber){
					count++;
					if (count % 10 == 0){
						System.out.printf("%-5d\n", number);
					}
					else {
						System.out.printf("%-5d", number);
					}
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
