package zadaci_09_02_2017;

public class Zadatak04 {
	public static void printMatrix(int n){
		int [][] matrix = new int [n][n];
		for (int i=0;i<n;i++){                       //inicijalizacija elemenata matrice random
			for (int j=0;j<n;j++){                   //vrijednostima 0 ili 1
				matrix[i][j]=(int)(Math.random()*2);
			}
		}
		for (int i=0;i<matrix.length;i++){           //ispis kvadratne matrice
			for (int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		System.out.print("Unesite velicinu kvadratne matrice: ");
		int n = input.nextInt();
		printMatrix(n);          //pozivanje metode za ispis kvadratne matrice
		input.close();
	}

}
