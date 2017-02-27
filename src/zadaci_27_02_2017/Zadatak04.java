package zadaci_27_02_2017;

public class Zadatak04 {

	public static void main(String[] args) {

		int [][] matrix = new int [6][2];
		
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = 1 + (int)(Math.random() * 9);
			}
		}
		
		System.out.println("Random generated matrix is: ");
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		sort(matrix);
		System.out.println("\nSorted matrix is: ");
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	// sort sorts an array primary on rows and secondary on columns 
	public static void sort(int m[][]) {
		int[] min = new int[2];
		for (int row = 0; row < m.length - 1; row++) {
			min[0] = m[row][0];
			min[1] = m[row][1];
			int index = row;
			for (int i = row + 1; i < m.length; i++) {
				if (m[i][0] <= min[0] && (m[i][0] < min[1] || m[i][1] < min[0] || m[i][1] < min[1])) {
					min[0] = m[i][0];
					min[1] = m[i][1];
					index = i;
				}
			}
			if (index != row) {
				m[index][0] = m[row][0];
				m[index][1] = m[row][1];
				m[row][0] = min[0];
				m[row][1] = min[1];
			}
		}
	}
}
