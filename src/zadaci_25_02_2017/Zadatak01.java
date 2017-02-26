package zadaci_25_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {
		
		int [] numbers = new int [10];
		for (int i = 0; i < 100; i++){
			int number = (int)(Math.random() * 10);
			switch(number){
			case 0: numbers[0]++; break;
			case 1: numbers[1]++; break;
			case 2: numbers[2]++; break;
			case 3: numbers[3]++; break;
			case 4: numbers[4]++; break;
			case 5: numbers[5]++; break;
			case 6: numbers[6]++; break;
			case 7: numbers[7]++; break;
			case 8: numbers[8]++; break;
			case 9: numbers[9]++; break;
			}
		}
		for (int i = 0; i < numbers.length; i++){
			System.out.println("Number " + i + " is generated " + numbers[i] + " times.");
		}
	}

}
