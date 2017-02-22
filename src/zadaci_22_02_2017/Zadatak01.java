package zadaci_22_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {
		
		int month = 1 + (int)(Math.random() * 12);
		switch (month) {
		case 1:
			System.out.println(month + " - Januar.");
			break;
		case 2:
			System.out.println(month + " - Februar.");
			break;
		case 3:
			System.out.println(month + " - Mart.");
			break;
		case 4:
			System.out.println(month + " - April.");
			break;
		case 5:
			System.out.println(month + " - Maj.");
			break;
		case 6:
			System.out.println(month + " - Jun.");
			break;
		case 7:
			System.out.println(month + " - Jul.");
			break;
		case 8:
			System.out.println(month + " - Avgust.");
			break;
		case 9:
			System.out.println(month + " - Septembar.");
			break;
		case 10:
			System.out.println(month + " - Oktobar.");
			break;
		case 11:
			System.out.println(month + " - Novembar.");
			break;
		case 12:
			System.out.println(month + " - Decembar.");
			break;
		}
	}

}
