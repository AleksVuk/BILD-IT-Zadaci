package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestRowsAndColumns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean works = true;
		int n = 0;
		//loop which controls correct input of the size of the matrix
		while (works){
			try{
				System.out.print("Enter the size of matrix (positive integer smaller than 20): ");
				n = input.nextInt();
				if (n > 0  &&  n <= 20){
					break;
				}
				else{
					System.out.println("You entered number out of defined bounds!");
					input.nextLine();
				}
			}catch (InputMismatchException ex){
				System.out.println("Invalid input! Try again.");
				input.nextLine();
			}
		}
		
		int [][] matrix = new int [n][n];
		//initializing elements of the matrix with random 0 or 1 values
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}
		
		//print the matrix
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		ArrayList<Integer> rows = new ArrayList<>();
		ArrayList<Integer> columns = new ArrayList<>();
		
		//invoke methods to get the largest rows and columns indices
		largestRowSum(rows, matrix);
		largestColumnSum(columns, matrix);
		
		
		System.out.print("\nThe largest row index: ");
		for (int i = 0; i < rows.size(); i++){
			if (i == rows.size() - 1){
				System.out.println(rows.get(i));
			}
			else{
				System.out.print(rows.get(i) + ", ");
			}
		}
		
		System.out.print("The largest column index: ");
		for (int i = 0; i < columns.size(); i++){
			if (i == columns.size() - 1){
				System.out.println(columns.get(i));
			}
			else{
				System.out.print(columns.get(i) + ", ");
			}
		}
		
		input.close();
	}
	
	//find the largest sum in rows and add indices to ArrayList rows
	public static void largestRowSum(ArrayList<Integer> rows, int [][] m){
		//add every row's sum to list
		int[] sum = new int [m.length];
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				sum[i] += m[i][j];
			}
		}
	
		int maxSum = sum[0];
		rows.add(0);
		//get the first largest row's sum index and add index to ArrayList rows
		for(int i = 1; i < sum.length; i++){
			if (maxSum < sum[i]){
				maxSum = sum[i];
				rows.set(0, i);
			}
		}
		//check if there is equal sum on other indices after the first index, and if, add that index as well
		for (int i = rows.get(0) + 1; i < sum.length; i++){
			if (maxSum == sum[i]){
				rows.add(i);
			}
		}
		
	}
	
	//find the largest sum in columns and add indices to ArrayList columns
	public static void largestColumnSum(ArrayList<Integer> columns, int [][] m){
		//add every column's sum to list
		int[] sum = new int [m.length];
		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[i].length; j++){
				sum[i] += m[j][i];
			}
		}
		
		int maxSum = sum[0];
		columns.add(0);
		
		//get the first largest column's sum index and add index to ArrayList columns
		for(int i = 1; i < sum.length; i++){
			if (maxSum < sum[i]){
				maxSum = sum[i];
				columns.set(0, i);
			}
		}
		
		//check if there is equal sum on other indices after the first index, and if, add that index as well
		for (int i = columns.get(0) + 1; i < sum.length; i++){
			if (maxSum == sum[i]){
				columns.add(i);
			}
		}
		
	}
	
	
	
}
