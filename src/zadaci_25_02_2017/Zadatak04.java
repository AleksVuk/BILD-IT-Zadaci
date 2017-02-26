package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double [][] matrix = new double [3][4];
		double number = 0;
		boolean works = true;
		//loop which controls correct input of matrix's values
		while (works){
			int control = 1;
			System.out.println("Enter a 3-by-4 matrix row by row: ");
			for (int i = 0; i < matrix.length; i++){
				for (int j = 0; j < matrix[i].length; j++){
					try{
						number = input.nextDouble();
						matrix[i][j] = number;
						works = false;
					}catch (InputMismatchException ex){
						System.out.println("Wrong input, you can enter only numbers of the type double!");
						input.nextLine();
						works = true;
						//if there was wrong input in a row, variable control gets value 0 
						control = 0;
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
		for (int i = 0; i < 4; i++){
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
		}
		input.close();
	}
	
	//method which adds columns values
	public static double sumColumn(double[][] m, int columnIndex){
		double sum = 0;
		for (int i = 0; i < 3; i++){
			sum = sum + m[i][columnIndex];
		}
		return sum;
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
}
