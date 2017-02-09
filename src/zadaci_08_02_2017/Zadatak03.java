package zadaci_08_02_2017;

public class Zadatak03 {
	//metoda koja vraca najveci zajednicki djelilac za dva proslijedjena broja
	public static int maxCommonDivisor(int n1, int n2){
		int number=Math.min(n1, n2);
		for (int i=number;i>=1;i--){
			if (n1%i==0&&n2%i==0){
				return i;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		System.out.print("Unesite prvi broj: ");
		int n1 = input.nextInt();
		System.out.print("Unesite drugi broj: ");
		int n2 = input.nextInt();
		//pozivanje metode i dodjeljivanje njene vrijednosti promjenljivoj
		int result = maxCommonDivisor(n1,n2);
		System.out.println("Najveci zajednicki djelilac za brojeve "+n1+" i "+n2+" je "+result+".");
		input.close();
	}

}
