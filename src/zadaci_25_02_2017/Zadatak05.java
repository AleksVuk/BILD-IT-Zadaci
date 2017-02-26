package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double [][] matrix1 = new double [3][3];
		double number1 = 0;
		boolean works1 = true;
		//loop which controls correct input of values of first matrix
		while (works1){
			int control1 = 1;
			System.out.println("Enter first 3x3 matrix row by row: ");
			for (int i = 0; i < matrix1.length; i++){
				for (int j = 0; j < matrix1[i].length; j++){
					try{
						number1 = input.nextDouble();
						matrix1[i][j] = number1;
						works1 = false;
					}catch (InputMismatchException ex){
						System.out.println("Wrong input, you can enter only numbers of the type double!");
						input.nextLine();
						works1 = true;
						//if there was wrong input in a row, variable control gets value 0 
						control1 = 0;
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
		double number2 = 0;
		boolean works2 = true;
		//loop which controls correct input of values of second matrix
		while (works2){
			int control2 = 1;
			System.out.println("Enter second 3x3 matrix row by row: ");
			for (int i = 0; i < matrix2.length; i++){
				for (int j = 0; j < matrix2[i].length; j++){
					try{
						number2 = input.nextDouble();
						matrix2[i][j] = number2;
						works2 = false;
					}catch (InputMismatchException ex){
						System.out.println("Wrong input, you can enter only numbers of the type double!");
						input.nextLine();
						works2 = true;
						//if there was wrong input in a row, variable control2 gets value 0 
						control2 = 0;
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
		double [][] sumMatrix = addMatrix(matrix1, matrix2);
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(matrix1[i][j] + " ");
			}
			//loop which prints spaces between first and second matrices 
			if (i == 1){
				System.out.print("  +   ");
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
				System.out.print(sumMatrix[i][l] + " ");
			}
			System.out.println();
		}
		input.close();	
	}
	//method which checks is a row valid
	public static boolean isValidRow(int i){
		if (i == 1){
			return true;
		}
		else{
			return false;
		}
	}
	//method which adds two matrices
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double [][] c = new double [3][3];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				c[i][j] = a [i][j] + b[i][j];
			}
		}
		return c;
	}
}
