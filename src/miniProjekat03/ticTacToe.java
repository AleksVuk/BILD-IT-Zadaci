package miniProjekat03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ticTacToe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean worksAplication = true;
		
		//loop which controls application
		while (worksAplication) {
			char[][] ticTacToe = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}} ;
			System.out.println("Welcome to the TicTacToe game. ");
			System.out.println("1.Play new game.");
			System.out.println("2.Exit.");
			int choice1 = 0;
			boolean works1 = true;
			//loop which controls correct choice in the first window
			while (works1){
				try{
					System.out.print("Choose: ");
					choice1 = input.nextInt();
					if (choice1 == 1 || choice1 == 2){
						break;
					}
					else{
						System.out.println("Enter 1 or 2!");
						input.nextLine();
						continue;
					}
				}catch(InputMismatchException ex){
					System.out.println("Invalid input!");
					input.nextLine();
				}
			}
			if (choice1 == 1){
				for (int i = 1; i <= 10; i++) {
					//print tic-tac-toe matrix before every turn
					for (int row = 0; row < 3; row++) {
						System.out.println("-------------");
						for (int column = 0; column < 3; column++) {
							System.out.printf("| %-2s", ticTacToe[row][column]);
						}
						System.out.println("|");
					}
					System.out.println("-------------");
					if (i > 4) {
						//after the fifth turn check if there is a winner 
						if (checkRows(ticTacToe) == 'X' || checkColumns(ticTacToe) == 'X' || checkMainDiagonal(ticTacToe) == 'X'
							|| checkSecondalDiagonal(ticTacToe) == 'X') {
							System.out.println("Player X won the game! Congratulations :) ");
							System.out.println("-------------------------------------------");
							break; 
							
						} else if (checkRows(ticTacToe) == 'O' || checkColumns(ticTacToe) == 'O'
							|| checkMainDiagonal(ticTacToe) == 'O' || checkSecondalDiagonal(ticTacToe) == 'O') {
							System.out.println("Player O won the game! Congratulations :) ");
							System.out.println("-------------------------------------------");
							break;
						}
					}
					//after nine turns check if there is a winner or the game is draw
					if (i == 10) {
						if (checkRows(ticTacToe) == 'D' || checkColumns(ticTacToe) == 'D' || checkMainDiagonal(ticTacToe) == 'D'
							|| checkSecondalDiagonal(ticTacToe) == 'D') {
							System.out.println("Draw :(");
							System.out.println("-------------------------------------------");
						}
						break;
					}
					//player X turn
					if (i % 2 != 0) {
						boolean works2 = true;
						//loop which controls correct choice of the location for player X
						while(works2){
							try{
								int [] a = new int [2];
								System.out.println("Player X: ");
								System.out.print("Choose row and column (0, 1, or 2): ");
								a[0] = input.nextInt();
								a[1] = input.nextInt();
								if (a[0] >= 0 && a[1] >= 0 && a[0] <= 2 && a[1] <= 2){
									if (ticTacToe[a[0]][a[1]] == ' '){
										ticTacToe[a[0]][a[1]] = 'X';
										input.nextLine();
										break;
									}
									else{
										System.out.println("This place is already choosen! Try again.");
										input.nextLine();
										continue;
									}
								}
								else{
									System.out.println("Wrong input!");
									input.nextLine();
									continue;
								}
								
							}catch (InputMismatchException ex){
								System.out.println("Invalid input!");
								input.nextLine();
							}
						}
					}
					//player O turn
					else if (i % 2 == 0) {
						boolean works3 = true;
						//loop which controls correct choice of the location for player 0
						while (works3) {
							try{
								int [] b = new int [2];
								System.out.println("Player O: ");
								System.out.print("Choose row and column (0, 1, or 2): ");
								b[0] = input.nextInt();
								b[1] = input.nextInt();
								if (b[0] >= 0 && b[1] >= 0 && b[0] <= 2 && b[1] <= 2){
									if (ticTacToe[b[0]][b[1]] == ' '){
										ticTacToe[b[0]][b[1]] = 'O';
										input.nextLine();
										break;
									}
									else{
										System.out.println("This place is already choosen! Try again.");
										input.nextLine();
										continue;
									}
								}
								else{
									System.out.println("Wrong input!");
									input.nextLine();
									continue;
								}
							
							}catch (InputMismatchException ex){
								System.out.println("Invalid input!");
								input.nextLine();
							}
						}
						System.out.println();
						}
					}
				}
				else if (choice1 == 2){
					break;
				}
			}
		System.out.println("Thank you for playing tic-tac-toe game :)");
		input.close();
	}
	//check if there are three same characters in any row
	public static char checkRows(char[][] m) {
		char x = 'X';
		char o = 'O';

		for (int i = 0; i < 3; i++) {
			int countX = 0;
			int countO = 0;
			for (int j = 0; j < 3; j++) {
				if (m[i][j] == x) {
					countX++;
				}
				if (m[i][j] == o) {
					countO++;
				}
			}
			if (countX == 3) {
				return 'X';
			} else if (countO == 3) {
				return 'O';
			}
		}
		return 'D';
	}
	//check if there are three same characters in any column
	public static char checkColumns(char[][] m) {
		char x = 'X';
		char o = 'O';
		for (int i = 0; i < 3; i++) {
			int countX = 0;
			int countO = 0;
			for (int j = 0; j < 3; j++) {
				if (m[j][i] == x) {
					countX++;
				}
				if (m[j][i] == o) {
					countO++;
				}
			}
			if (countX == 3) {
				return 'X';
			} else if (countO == 3) {
				return 'O';
			}
		}
		return 'D';
	}
	//check if there are three same characters on the main diagonal
	public static char checkMainDiagonal(char[][] m) {
		char x = 'X';
		char o = 'O';
		int countX = 0;
		int countO = 0;
		for (int i = 0; i < 3; i++) {
			if (m[i][i] == x) {
				countX++;
			}
			if (m[i][i] == o) {
				countO++;
			}
		}
		if (countX == 3) {
			return 'X';
		} else if (countO == 3) {
			return 'O';
		}
		return 'D';

	}
	
	//check if there are three same characters on the secondal diagonal
	public static char checkSecondalDiagonal(char[][] m) {
		char x = 'X';
		char o = 'O';
		int countX = 0;
		int countO = 0;
		int j = 2;
		for (int i = 0; i < 3; i++) {
			if (m[i][j] == x) {
				countX++;
			}
			if (m[i][j] == o) {
				countO++;
			}
			j--;
		}
		if (countX == 3) {
			return 'X';
		} else if (countO == 3) {
			return 'O';
		}
		return 'D';
	}

}


