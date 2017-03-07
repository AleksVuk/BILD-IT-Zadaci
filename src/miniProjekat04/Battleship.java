package miniProjekat04;

public class Battleship {
	private char[][] ships;
	private char[][] guess;
	private int countGuesses;
	
	Battleship(){
		guess = initializeEmptyMatrix();
		ships = initializeShips();
	}
	
	//initialize guess matrix with space characters
	public char[][] initializeEmptyMatrix(){
		char[][] empty = new char[10][10];
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++){
				empty[i][j] = ' ';
			}
		}
		
		return empty;
	}
	
	//initialize ships matrix with 'O' characters which will represent ships parts
	public char[][] initializeShips(){
		char[][] ships = new char[10][10];
		
		//first initialize all elements with spaces
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++){
				ships[i][j] = ' ';
			}
		}
		
		//two parts ships 
		//first
		ships[0][0] = 'O';
		ships[0][1] = 'O';
		
		//second
		ships[2][9] = 'O';
		ships[3][9] = 'O';
		
		//third
		ships[5][5] = 'O';
		ships[6][5] = 'O';
		
		//forth
		ships[7][0] = 'O';
		ships[7][1] = 'O';
		
		//three parts ships
		//first
		for (int i = 0; i < 3; i++){
			ships[i][3] = 'O';
		}
		
		//second
		for (int i = 5; i < 8; i++){
			ships[2][i] = 'O';
		}
		
		//third
		for (int i = 5; i < 8; i++){
			ships[i][9] = 'O';
		}
		
		//four parts ships
		//first
		for(int i = 6; i < 10; i++){
			ships[0][i] = 'O';
		}
		
		//second
		for(int i = 2; i < 6; i++){
			ships[i][0] = 'O';
		}
		
		//six parts ships
		for(int i = 4; i < 10; i++){
			ships[9][i] = 'O';
		}
		
		return ships;
		
	}
	
	//set guess char at chosen position in guess matrix
	public void setCharAtPosition(int row, char letter){
		int column = getColumn(letter);
		
		//if is hit guess
		if (isHit(row, column)){
			guess [row][column] = 'O';
			countGuesses++;
		}
		else{
			guess[row][column] = 'x';
		}
		
	}
	
	//get column for entered letter
	public int getColumn(char letter){
		letter = Character.toUpperCase(letter);
		int column = 0;
		if (letter == 'A'){
			column = 0;
		}
		else if (letter == 'B'){
			column = 1;
		}
		else if (letter == 'C'){
			column = 2;
		}
		else if (letter == 'D'){
			column = 3;
		}
		else if (letter == 'E'){
			column = 4;
		}
		else if (letter == 'F'){
			column = 5;
		}
		else if (letter == 'G'){
			column = 6;
		}
		else if (letter == 'H'){
			column = 7;
		}
		else if (letter == 'I'){
			column = 8;
		}
		else if (letter == 'J'){
			column = 9;
		}
		
		return column;
		
	}
	
	//check is entered letter which represents the column valid
	public boolean isValidColumn(char letter){
		letter = Character.toUpperCase(letter);
		if (letter >= 'A'  &&  letter <= 'J'){
			return true;
		}
		return false;
	}
	
	//check is entered number for row valid
	public boolean isValidRow(int row){
		if (row >= 0  &&  row <= 9){
			return true;
		}
		return false;
	}
	
	//check if user hit the ship in the ships matrix
	public boolean isHit(int row, int column){
		if (ships[row][column] == 'O'){
			return true;
		}
		return false;
	}
	
	//check if user already entered this position before
	public boolean isPositionEmpty(int row, char letter){
		int column = getColumn(letter);
		if (guess[row][column] == ' '){
			return true;
		}
		return false;
	}
	
	//print guess matrix
	public void printGuess(){
		System.out.println("    A   B   C   D   E   F   G   H   I   J");
		
		for (int i = 0; i < guess.length; i++){
			System.out.println("   ---------------------------------------");
			
			System.out.print(i);
			for (int j = 0; j < guess[i].length; j++){
				System.out.print(" | " + guess[i][j]);
			}
			System.out.print(" |\n");
		}
		
		System.out.println("   ---------------------------------------");
		
	}
	
	//print ships matrix
	public void printShips(){
		System.out.println("    A   B   C   D   E   F   G   H   I   J");
		
		for (int i = 0; i < ships.length; i++){
			System.out.println("   ---------------------------------------");
			
			System.out.print(i);
			for (int j = 0; j < ships[i].length; j++){
				System.out.print(" | " + ships[i][j]);
			}
			System.out.print(" |\n");
		}
		
		System.out.println("   ---------------------------------------");
	}
	
	//check did player sank down all ships
	public boolean isWin(){
		if (countGuesses == 31){
			return true;
		}
		return false;
	}
	
}
