package zadaci_27_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int [][] matrix = new int [8][7];
		
		boolean works = true;
		while (works){
			System.out.println("Enter a 8x7 matrix which represents weekly hours for 8 employees: ");
			boolean control = true;
			for (int i = 0; i < matrix.length; i++){
				for (int j = 0; j < matrix[i].length; j++){
					try{
						matrix[i][j] = input.nextInt();							
						if (matrix[i][j] < 0 || matrix[i][j] > 12){
							throw new Exception ("Entered number is not valid!");
						}
						works = false;
					}catch (InputMismatchException ex){
						System.out.println("Wrong input! You must input integers between 0 and 12");
						control = false;
						works = true;
						input.nextLine();
						break;
					}catch (Exception e){
						System.out.println("Wrong input! You must input integers between 0 and 12");
						control = false;
						works = true;
						input.nextLine();
						break;
					}
					
				}
				//check is entered row valid
				if (!isValidRow(control)){
					System.out.println("Try again.");
					break;
				}
			}
		}
		String [] days = {"Su", "M", "T", "W", "Th", "F", "S"};
		String [] employees = {"Employee0", "Employee1", "Employee2", "Employee3", "Employee4", "Employee5", "Employee6", "Employee7"};
		
		System.out.println("All employees with their weekly hours: ");
		System.out.print("            ");
		for (int i = 0; i < days.length; i++){
			System.out.printf("%-4s", days[i]);
		}
		System.out.println();
		for (int i = 0; i < 8; i++){
			System.out.print(employees[i] + "   ");
			for (int j = 0; j < 7; j++){
				 System.out.printf("%-4d", matrix[i][j]);
			}
			System.out.println();
		}
		int [] sum = sumRows(matrix);
		
		//bubble sort
		for (int i = 0; i < sum.length - 1; i++){
			for (int j = 0; j < sum.length - 1; j++){
				if (sum[j] < sum[j+1]){
					int temp1 = sum[j];
					sum[j] = sum[j+1];
					sum[j+1] = temp1;
					
					String temp2 = employees[j];
					employees[j] = employees[j+1];
					employees[j+1] = temp2;
					
				}
			}
		}
		System.out.println("\nAll employees sorted in decreasing order of their total weekly hours: ");
		System.out.print("            ");
		for (int i = 0; i < days.length; i++){
			System.out.printf("%-4s", days[i]);
		}
		System.out.println();
		for (int i = 0; i < matrix.length; i++){
			System.out.print(employees[i] + "   ");
			String employee = employees[i];
			int rowIndex = getRowIndex(employee);
			for (int j = 0; j < matrix[i].length; j++){
				 System.out.printf("%-4d", matrix[rowIndex][j]);
			}
			System.out.println();
		}
		
		input.close();
	}
	//method which adds rows 
	public static int[] sumRows(int [][] m){
		int [] sumRow = new int [m.length];
		for (int i = 0; i < m.length; i++){
			int sum = 0;
			for (int j = 0; j < m[i].length; j++){
				sum = sum + m[i][j];
			}
			sumRow[i] = sum;
		}
		return sumRow;
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
	//method which returns the row index
	public static int getRowIndex(String s){
		char index = s.charAt(s.length() - 1);
		if (index == '0'){
			return 0;
		}
		else if (index == '1'){
			return 1;
		}
		else if (index == '2'){
			return 2;
		}
		else if (index == '3'){
			return 3;
		}
		else if (index == '4'){
			return 4;
		}
		else if (index == '5'){
			return 5;
		}
		else if (index == '6'){
			return 6;
		}
		else {
			return 7;
		}
	}
	
	
	
	
}
