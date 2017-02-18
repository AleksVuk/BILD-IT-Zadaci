package zadaci_17_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//brojac mogucih kombinacija
		int countCombination = 0;
		
		System.out.println("Sve moguce kombinacije za biranje dva broja u rasponu od 1 do 7 su: ");
		//prva petlja prolazi kroz brojeve od 1 do 6
		for (int i = 1; i <= 6; i++){
			//pocetni broj druge petlje je broj iz prve petlje +1, krajnji broj je 7
			for (int j = i + 1; j <= 7; j++){
				countCombination++;
				if (countCombination % 5 == 0){
					System.out.println(i + " " + j + "   ");
				}
				else {
					System.out.print(i + " " + j + "   ");
				}
			}
		}
		System.out.println("\nBroj mogucih kombinacija je: " + countCombination + ".");
	}

}
