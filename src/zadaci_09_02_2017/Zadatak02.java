package zadaci_09_02_2017;

public class Zadatak02 {
	//metoda koja generise broj zadataka na osnovu korisnikovog unosa
	public static void divisionQuiz(int n){
		java.util.Scanner input = new java.util.Scanner (System.in);
		int countCorrect = 0;
		for (int i=0;i<n;i++){
			int number1=(int)(Math.random()*20);
			int number2=(int)(Math.random()*20);
			System.out.print("Koliko je "+number1+"-"+number2+"?");
			int result=input.nextInt();
			if ((number1-number2)==result){ //ako je odgovor tacan, povecava se brojac tacnih odgovora
				countCorrect++;
			}
		}
		System.out.println("Imali ste "+countCorrect+" tacnih odgovora.");
		input.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		System.out.print("Unesite broj zadataka: ");
		int number = input.nextInt();
		divisionQuiz(number);  //pozivanje metode i prosledjivanje broja zadataka
		input.close();
	}

}
