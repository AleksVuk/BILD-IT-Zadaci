package zadaci_20_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vase registarske tablice su: ");
		
		//generisanje tri nasumicna velika slova i ispis u istoj liniji
		char letter1 = (char)(65 + (int)(Math.random()*26));	
		System.out.print(letter1);
		char letter2 = (char)(65 + (int)(Math.random()*26));
		System.out.print(letter2);
		char letter3 = (char)(65 + (int)(Math.random()*26));
		System.out.print(letter3 + "-");
		
		//generisanje cetiri nasumicna broja i ispis u istoj liniji
		int number1 = (int)(Math.random()*10);
		System.out.print(number1);
		int number2=(int)(Math.random()*10);
		System.out.print(number2);
		int number3=(int)(Math.random()*10);
		System.out.print(number3);
		int number4=(int)(Math.random()*10);
		System.out.print(number4);
	}

}
