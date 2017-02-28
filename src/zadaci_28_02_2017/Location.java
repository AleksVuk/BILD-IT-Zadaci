package zadaci_28_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	Location (int row, int column, double maxValue){
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	public static Location locateLargest(double[][] a) {
		double largest = a[0][0];
		int row = 0;
		int column = 0;
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				if (largest < a[i][j]){
					largest = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		
		return new Location(row, column, largest);
	}
	
	
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public double getMaxValue() {
		return maxValue;
	}

	@Override
	public String toString() {
		return "Location [row=" + row + ", column=" + column + ", maxValue=" + maxValue + "]";
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int [] size = new int [2];
		boolean works1 = true;
		//loop which controls the correct input of the matrix size
		while (works1){
			System.out.print("Enter the number (between 2 and 9) of rows and columns in the matrix: ");
			for (int i = 0; i < 2; i++){
				try{
					size[i] = input.nextInt();
					if (size[i] < 2 || size[i] > 9){
						throw new Exception ("Invalid input");
					}
					works1 = false;
				}
				catch(InputMismatchException ex){
					System.out.println("Wrong input! You must enter the numbers of the type int!");
					input.nextLine();
				}
				catch(Exception e){
					System.out.println("Follow the defined range (between 2 and 9)! Try again.");
					input.nextLine();
				}
			}
		}
		
		double [][] m = new double [size[0]][size[1]];
		boolean works2 = true;
		//loop which controls correct input of values of the matrix
		while (works2){
			boolean control = true;
			System.out.println("Enter the " + size[0] + "x" +size[1] + " matrix row by row: ");
			for (int i = 0; i < m.length; i++){
				for (int j = 0; j < m[i].length; j++){
					try{
					m[i][j] = input.nextDouble();
					if (m[i][j] < - 50 || m[i][j] > 50){
						throw new Exception ("Entered number is not valid!");
					}
					works2 = false;
				}catch (InputMismatchException ex){
					System.out.println("Wrong input! Enter numbers of the type double in range from -50 to 50!");
					input.nextLine();
					works2 = true;
					//if there was wrong input in a row, variable control gets value false 
					control = false;
					break;
				}
				catch (Exception e){
					System.out.println("Wrong input! Enter numbers of the type double in range from -50 to 50");
					control = false;
					works2 = true;
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
		Location l = locateLargest(m);
		System.out.println("The largest element is: " + l.getMaxValue() + " at location (" + l.getRow() + ", " + l.getColumn() + ").");
		System.out.println();
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
}
