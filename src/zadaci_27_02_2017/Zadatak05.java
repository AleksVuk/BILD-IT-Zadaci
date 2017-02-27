package zadaci_27_02_2017;

public class Zadatak05 {

	public static void main(String[] args) {

		int[][] matrix = new int[6][6];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		System.out.println("Random generated 6x6 matrix is: ");
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nChecking if every row has an even number of 1s: ");
		for (int i = 0; i < matrix.length; i++){
				System.out.println("Row " + i + ": " + isEvenNumberOf1s(matrix[i]));
		}
		
		System.out.println("\nChecking if every column has an even number of 1s: ");
		for (int i = 0; i < matrix[0].length; i++){
			int [] column = new int [matrix.length];
			for (int j = 0; j < matrix.length; j++){
				column[j] = matrix[j][i];
			}
			System.out.println("Column " + i + ": " + isEvenNumberOf1s(column));
		}
		
	}
	   //method which checks does the row or column contains an even number of 1s
		public static boolean isEvenNumberOf1s(int[] array){
			int count = 0;
			for (int i = 0; i < array.length; i++){
					if(array[i] == 1){
						count++;
					}
			}
			if (count % 2 == 0  &&  count > 0){
				count = 0;
				return true;
			}
			else{
				return false;
			}
		}
			
}
