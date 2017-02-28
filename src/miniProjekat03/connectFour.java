package miniProjekat03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class connectFour {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean worksApplication = true;
		
		//loop which controls application
		while (worksApplication){
			char[][] m = new char [6][7];
			for (int i = 0; i < 6; i++){
				for (int j = 0; j < 7; j++){
					char ch = ' ';
					m[i][j] = ch;
				}
			}
			System.out.println("Welcome to the connect four game. ");
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
			//play the game
			if (choice1 == 1){
				System.out.println("----------------------------------------");
				System.out.println("Both players can use 7 to exit the game!");
				System.out.println("----------------------------------------\n");
				for (int i = 1; i <= 43; i++){
					//print the matrix before every turn
					for (int row = 0; row < m.length; row++) {
						for (int column = 0; column < m[row].length; column++) {
							System.out.printf("| %-2s", m[row][column]);
						}
						System.out.println("|");
					}
					System.out.println("-----------------------------");
					if(checkRows(m) == 'R' || checkColumns(m) == 'R' || checkMainDiagonals(m) == 'R' || checkSecondalDiagonals(m) == 'R'){
						System.out.println("Red player wins! Congratulations :)");
						System.out.println("------------------------------------");
						break;
					}
					else if (checkRows(m) == 'Y' || checkColumns(m) == 'Y' || checkMainDiagonals(m) == 'Y' || checkSecondalDiagonals(m) == 'Y'){
						System.out.println("Yellow player wins! Congratulations :)");
						System.out.println("------------------------------------");
						break;
					}
					if (i == 43){
						if (checkRows(m) == 'D' || checkColumns(m) == 'D' || checkMainDiagonals(m) == 'D' || checkSecondalDiagonals(m) == 'D'){
							System.out.println("Draw :(");
							System.out.println("------------------------------------");
						}
						break;
					}
					//player1 turn (RED)
					if (i % 2 != 0){
						boolean works2 = true;
						//loop which controls correct choice of the column for player1 (RED)
						while(works2){
							try{
								System.out.print("Player1 (RED) choose column (0-6): ");
								int c = input.nextInt();
								if (c >= 0  && c <= 6){
									if (getFreePlace(m, c) == 6){
										System.out.println("There is no free place in the choosen column! Try another column.");
										input.nextLine();
										continue;
									}
									else{
										int row = getFreePlace(m, c);
										m[row][c] = 'R';
										input.nextLine();
										break;
									}
								}
								//exit the application
								else if (c == 7){
									System.out.println("Thank you for playing connect four game :)");
									System.exit(1);
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
					//player2 turn (YELLOW)
					else if (i % 2 == 0){
						boolean works3 = true;
						//loop which controls correct choice of the column for player2 (YELLOW)
						while (works3){
							try{
								System.out.print("Player2 (YELLOW) choose column (0-6): ");
								int c = input.nextInt();
								if (c >= 0  && c <= 6){
									if (getFreePlace(m, c) == 6){
										System.out.println("There is no free place in the choosen column! Try another column.");
										input.nextLine();
										continue;
									}
									else{
										int row = getFreePlace(m, c);
										m[row][c] = 'Y';
										input.nextLine();
										break;
									}
								}
								//exit the application
								else if (c == 7){
									System.out.println("Thank you for playing connect four game :)");
									System.exit(2);
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
				}
			}
			//exit the game
			else if (choice1 == 2){
				break;
			}
		}
		System.out.println("Thank you for playing connect four game :)");
		input.close();
	}

	//check if there is a free place in entered column
	public static int getFreePlace(char [][] m, int c){
		for (int i = 5; i >= 0; i--){
			if (m[i][c] == ' '){
				return i;
			}
		}
		return 6;
	}
	
	//check if there is consecutive four in any row
	public static char checkRows(char [][] m){
		char r = 'R';
		char y = 'Y';
		for (int i = 0; i < m.length; i++) {
			int countR = 0;
			int countY = 0;
			for (int j = 0; j < m[i].length - 1; j++) {
				if (m[i][j] == r && m[i][j] == m[i][j+1]) {
					countR++;
					if (countR == 3) {
						return 'R';
					}
				}
				else{
					countR = 0;
				}
				if (m[i][j] == y && m[i][j] == m[i][j+1]) {
					countY++;
					if (countY == 3) {
						return 'Y';
					}
				}
				else{
					countY = 0;
				}
			}
		}
		return 'D';
	}
	//check if there is consecutive four in any column
	public static char checkColumns(char [][] m){
		char r = 'R';
		char y = 'Y';
		for (int i = 0; i < m[0].length; i++) {
			int countR = 0;
			int countY = 0;
			for (int j = 5; j > 0; j--) {
				if (m[j][i] == r && m[j][i] == m[j-1][i]) {
					countR++;
					if (countR == 3) {
						return 'R';
					}
				}
				else{
					countR = 0;
				}
				if (m[j][i] == y && m[j][i] == m[j-1][i]) {
					countY++;
					if (countY == 3) {
						return 'Y';
					}
				}
				else{
					countY = 0;
				}
			}
		}
		return 'D';
	}
	//check if there is consecutive four in any diagonal (parallel to the main diagonal)
	public static char checkMainDiagonals(char [][] m){
		char r = 'R';
		char y = 'Y';
		for (int i = 3; i <= 5; i++){
			int countR = 0;
			int countY = 0;
			int column = 0;
			for (int row = i; row > 0; row--){
				if (m[row][column] == r  &&  m[row][column] == m[row-1][column+1]){
					countR++;
					if (countR == 3) {
						return 'R';
					}
				}
				else{
					countR = 0;
				}
				if (m[row][column] == y  &&  m[row][column] == m[row-1][column+1]){
					countY++;
					if (countY == 3){
						return 'Y';
					}
				}
				else {
					countY = 0;
				}
				column++;
			}
		}
		for (int i = 1; i <= 3; i++){
			int countR = 0;
			int countY = 0;
			int row = 5;
			for (int column = i; column < 6; column++){
				if (m[row][column] == r  &&  m[row][column] == m[row-1][column+1]){
					countR++;
					if (countR == 3) {
						return 'R';
					}
				}else{
					countR = 0;
				}
				if (m[row][column] == y  &&  m[row][column] == m[row-1][column+1]){
					countY++;
					if (countY == 3){
						return 'Y';
					}
				}
				else {
					countY = 0;
				}
				row--;
			}
		}
		return 'D';
	}
	
	//check if there is consecutive four in any diagonal (parallel to the secondal diagonal)
	public static char checkSecondalDiagonals(char [][] m){
		char r = 'R';
		char y = 'Y';
		for (int i = 3; i <= 5; i++){
			int countR = 0;
			int countY = 0;
			int column = 6;
			for (int row = i; row > 0; row--){
				if (m[row][column] == r  &&  m[row][column] == m[row-1][column-1]){
					countR++;
					if (countR == 3) {
						return 'R';
					}
				}
				else{
					countR = 0;
				}
				if (m[row][column] == y  &&  m[row][column] == m[row-1][column-1]){
					countY++;
					if (countY == 3){
						return 'Y';
					}
				}
				else {
					countY = 0;
				}
				column--;
			}
		}
		for (int i = 5; i >= 3; i--){
			int countR = 0;
			int countY = 0;
			int row = 5;
			for (int column = i; column > 0; column--){
				if (m[row][column] == r  &&  m[row][column] == m[row-1][column-1]){
					countR++;
					if (countR == 3) {
						return 'R';
					}
				}
				else{
					countR = 0;
				}
				if (m[row][column] == y  &&  m[row][column] == m[row-1][column-1]){
					countY++;
					if (countY == 3){
						return 'Y';
					}
				}
				else {
					countY = 0;
				}
				row--;
			}
		}
		return 'D';
	}
}
