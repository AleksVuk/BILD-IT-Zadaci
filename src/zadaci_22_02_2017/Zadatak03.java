package zadaci_22_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {
		
		double x = 1;
		double y = 3;
		double sum = 0;
		while (y < 100){
			double result = x/y;
			sum = sum + result;
			x += 2;
			y += 2;
		}
		System.out.printf("Suma serije 1/3, 3/5... je: %.2f.", sum);
	}

}
