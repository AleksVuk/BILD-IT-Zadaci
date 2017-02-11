package zadaci_10_02_2017;

import java.util.InputMismatchException;

public class Zadatak05 {
	
	public static double[][] sortRows(double [][] matrix){
		
		for(int k=0; k<matrix.length;k++){					//prolazimo kroz matricu onoliko puta koliko ona ima redova
			for (int i=0; i<matrix.length; i++){
				for (int j=0; j<matrix[i].length-1; j++){
				
					if(matrix[i][j]>matrix[i][j+1]){		//pri svakom prolazu poredimo susjedne elemente u redu
						double temp = matrix[i][j];			//i ukoliko je potrebno zamijenimo im mjesta
						matrix[i][j] = matrix[i][j+1];
						matrix[i][j+1] = temp;
					
					}
				}
			}
		}
		
		return matrix;										//vrijednost koju vraca metoda (matrica sa sortiranim redovima)
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		
		try{
			System.out.print("Unesite velicinu matrice: ");
			int n = input.nextInt();										//definisanje velicine matrice
		
			double [][] matrix = new double [n][n];
			System.out.println("Unesite elemente "+n+"x"+n+" matrice: ");	//inicijalizacija elemenata matrice
			for (int i=0; i<n; i++){
				for (int j=0; j<n; j++){
					matrix[i][j] = input.nextDouble();
				}
			}
		
			double [][] sortedMatrix = sortRows(matrix);					//poziv metode za sortiranje redova matrice
		
			System.out.println("Matrica sa sortiranim redovima: ");			//ispis sortirane matrice
			for (int i=0; i<n; i++){
				for (int j=0; j<n; j++){
				System.out.print(sortedMatrix[i][j]+" ");
				}
				System.out.println();
			}
			
		}catch (InputMismatchException ex){									
			System.out.println("Pogresan unos!");
		}
		
		input.close();
	}

}
