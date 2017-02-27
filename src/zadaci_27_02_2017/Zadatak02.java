package zadaci_27_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double [][] matrix1 = new double [3][3];
		System.out.println("Enter numbers of the type double in range from -50 to 50.");
		boolean works1 = true;
		//loop which controls correct input of values of the first matrix
		while (works1){
			boolean control1 = true;
			System.out.println("Enter first 3x3 matrix row by row: ");
			for (int i = 0; i < matrix1.length; i++){
				for (int j = 0; j < matrix1[i].length; j++){
					try{
						matrix1[i][j] = input.nextDouble();
						if (matrix1[i][j] < - 50 || matrix1[i][j] > 50){
							throw new Exception ("Entered number is not valid!");
						}
						works1 = false;
					}catch (InputMismatchException ex){
						System.out.println("Wrong input! Enter numbers of the type double in range from -50 to 50!");
						input.nextLine();
						works1 = true;
						//if there was wrong input in a row, variable control gets value false 
						control1 = false;
						break;
					}
					catch (Exception e){
						System.out.println("Wrong input! Enter numbers of the type double in range from -50 to 50");
						control1 = false;
						works1 = true;
						input.nextLine();
						break;
					}
				}
				//check is entered row valid
				if(!isValidRow(control1)){
					System.out.println("Try again.");
					break;
				}
			}
		}
		
		double [][] matrix2 = new double [3][3];
		boolean works2 = true;
		//loop which controls correct input of values of the second matrix
		while (works2){
			boolean control2 = true;
			System.out.println("Enter second 3x3 matrix row by row: ");
			for (int i = 0; i < matrix2.length; i++){
				for (int j = 0; j < matrix2[i].length; j++){
					try{
						matrix2[i][j] = input.nextDouble();
						if (matrix2[i][j] < - 50 || matrix2[i][j] > 50){
							throw new Exception ("Entered number is not valid!");
						}
						works2 = false;
					}catch (InputMismatchException ex){
						System.out.println("Wrong input! Enter numbers of the type double in range from -50 to 50!");
						input.nextLine();
						works2 = true;
						//if there was wrong input in a row, variable control2 gets value false 
						control2 = false;
						break;
					}
					catch (Exception e){
						System.out.println("Wrong input! Enter numbers of the type double in range from -50 to 50");
						control2 = false;
						works2 = true;
						input.nextLine();
						break;
					}
				}
				//check is entered row valid
				if(!isValidRow(control2)){
					System.out.println("Try again.");
					break;
				}
			}
		}	
		
		System.out.println("\nThe multiplication of the matrices is: ");
		double [][] matrix3 = multiplyMatrices(matrix1, matrix2);
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(matrix1[i][j] + " ");
			}
			//loop which prints spaces between first and second matrices 
			if (i == 1){
				System.out.print("  *   ");
			}
			else{
				System.out.print("      ");
			}
			for (int k = 0; k < 3; k++){
				System.out.print(matrix2[i][k] + " ");
			}
			//loop which prints spaces between second and sumMatrix matrices 
			if (i == 1){
				System.out.print("  =   ");
			}
			else{
				System.out.print("      ");
			}
			for (int l = 0; l < 3; l++){
				System.out.printf("%.1f ", matrix3[i][l]);
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
	//method which multiplies two matrices 
	public static double[][] multiplyMatrices(double[][] a, double[][] b) {
		double [][] c = new double [3][3];
		for (int i = 0; i < c.length; i++){
			for (int j = 0; j < c[i].length; j++){
				c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
			}
		}
		return c;
	}
}
