package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] matrix1 = new int [3][3];
		System.out.println("Enter numbers of the type int in range from -99 to 99.");
		boolean works1 = true;
		//loop which controls correct input of values of the first matrix
		while (works1){
			boolean control1 = true;
			System.out.println("Enter first 3x3 matrix row by row: ");
			for (int i = 0; i < matrix1.length; i++){
				for (int j = 0; j < matrix1[i].length; j++){
					try{
						matrix1[i][j] = input.nextInt();
						if (matrix1[i][j] < - 99 || matrix1[i][j] > 99){
							throw new Exception ("Entered number is not valid!");
						}
						works1 = false;
					}catch (InputMismatchException ex){
						System.out.println("Wrong input! Enter numbers of the type int in range from -99 to 99!");
						input.nextLine();
						works1 = true;
						//if there was wrong input in a row, variable control gets value false 
						control1 = false;
						break;
					}
					catch (Exception e){
						System.out.println("Follow the defined range! Enter numbers of the type int in range from -99 to 99");
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
		
		int [][] matrix2 = new int [3][3];
		boolean works2 = true;
		//loop which controls correct input of values of the second matrix
		while (works2){
			boolean control2 = true;
			System.out.println("Enter second 3x3 matrix row by row: ");
			for (int i = 0; i < matrix2.length; i++){
				for (int j = 0; j < matrix2[i].length; j++){
					try{
						matrix2[i][j] = input.nextInt();
						if (matrix2[i][j] < - 99 || matrix2[i][j] > 99){
							throw new Exception ("Entered number is not valid!");
						}
						works2 = false;
					}catch (InputMismatchException ex){
						System.out.println("Wrong input! Enter numbers of the type int in range from -99 to 99!");
						input.nextLine();
						works2 = true;
						//if there was wrong input in a row, variable control2 gets value false 
						control2 = false;
						break;
					}
					catch (Exception e){
						System.out.println("Follow the defined range! Enter numbers of the type int in range from -99 to 99");
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
		
		if (equals(matrix1, matrix2)){
			System.out.println("The two entered matrices are strictly identical.");
		}
		else{
			System.out.println("The two entered matrices are not strictly identical.");
		}
		
		input.close();
		
	}
	//method which checks if the two matrices are strictly identical
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++){
			for (int j = 0; j < m1[i].length; j++){
				if (m1[i][j] != m2[i][j]){
					return false;
				}
			}
		}
		return true;
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
	
}
