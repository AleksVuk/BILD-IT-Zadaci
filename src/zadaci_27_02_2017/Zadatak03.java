package zadaci_27_02_2017;

public class Zadatak03 {

	public static void main(String[] args) {
		
		int [][] matrix = new int [4][4];
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++){
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The largest row index: " + maxRowIndex(matrix) + ".");
		System.out.println("The largest column index: " + maxColumnIndex(matrix) + ".");
		
	}
	//method which returns the largest row index in matrix
	public static int maxRowIndex(int [][] m){
		int [] sumRow = new int [4];
		for (int i = 0; i < 4; i++){
			int sum = 0;
			for (int j = 0; j < 4; j++){
				sum = sum + m[i][j];
			}
			sumRow[i] = sum;
		}
		int maxSum = sumRow[0];
		int maxRow = 0;
		for (int i = 0; i < 3; i++){
			if (maxSum < sumRow[i+1]){
				maxSum = sumRow[i+1];
				maxRow = i+1;
			}
		}
		return maxRow;
	}
	//method which returns the largest column index in matrix
	public static int maxColumnIndex(int [][] m){
		int [] sumColumn = new int [4];
		for (int i = 0; i < 4; i++){
			int sum = 0;
			for (int j = 0; j < 4; j++){
				sum = sum + m[j][i];
			}
			sumColumn[i] = sum;
		}
		int maxSum = sumColumn[0];
		int maxColumn = 0;
		for (int i = 0; i < 3; i++){
			if (maxSum < sumColumn[i+1]){
				maxSum = sumColumn[i+1];
				maxColumn = i+1;
			}
		}
		return maxColumn;
	}
	
}
