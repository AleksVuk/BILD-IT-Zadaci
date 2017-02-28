package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double [][] matrix = new double [3][3];
		System.out.println("Enter numbers of the type double in range from -50 to 50.");
		boolean works = true;
		//loop which controls correct input of values of the matrix
		while (works){
			boolean control = true;
			System.out.println("Enter the 3x3 matrix row by row: ");
			for (int i = 0; i < matrix.length; i++){
				for (int j = 0; j < matrix[i].length; j++){
					try{
						matrix[i][j] = input.nextDouble();
						if (matrix[i][j] < - 50 || matrix[i][j] > 50){
							throw new Exception ("Entered number is not valid!");
						}
						works = false;
					}catch (InputMismatchException ex){
						System.out.println("Wrong input! Enter numbers of the type double in range from -50 to 50!");
						input.nextLine();
						works = true;
						//if there was wrong input in a row, variable control gets value false 
						control = false;
						break;
					}
					catch (Exception e){
						System.out.println("Wrong input! Enter numbers of the type double in range from -50 to 50");
						control = false;
						works = true;
						input.nextLine();
						break;
					}
				}
				//check is entered row valid
				if(!isValidRow(control)){
					System.out.println("Try again.");
					break;
				}
			}
		}
		
		System.out.println("Entered matrix is: ");
		for (int i = 0 ; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " " );
			}
			System.out.println();
		}
		
		double [][] sortedMatrix = sortRows(matrix);
		System.out.println("\nEntered matrix with sorted rows is: ");
		for (int i = 0 ; i < sortedMatrix.length; i++){
			for (int j = 0; j <  sortedMatrix[i].length; j++){
				System.out.print(sortedMatrix[i][j] + " " );
			}
			System.out.println();
		}
		
		input.close();
	}
	//method which checks is a row valid
	public static boolean isValidRow(boolean control){
		if (control){
			return true;
		}
		else{
			return false;
		}
	}
	//method which sorts rows of the sent matrix but the matrix stays intact
	public static double[][] sortRows(double[][] m){
		double [][] sort = new double [m.length][m[0].length];
		//copying sent matrix
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				sort[i][j]=m[i][j];
			}
		}
		//sorting rows of the copied matrix
		for (int i = 0; i < sort.length; i++){
			java.util.Arrays.sort(sort[i]);
		}
		return sort;
	}

}
