package zadaci_09_02_2017;

public class Zadatak05 {
	public static void simulateHeadOrTails(int n){
		int countHeads = 0;
		int countTails = 0;
		for (int i=0;i<n;i++){
			int simulation = (int)(Math.random()*2);
			if(simulation==0){
				countTails++;
			}else {
				countHeads++;
			}
		}
		System.out.println("Pismo se pojavilo "+countTails+" puta.");
		System.out.println("Glava se pojavila "+countHeads+" puta.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		System.out.print("Unesite broj bacanja novcica: ");
		int n = input.nextInt();
		simulateHeadOrTails(n);
		input.close();
	}

}
