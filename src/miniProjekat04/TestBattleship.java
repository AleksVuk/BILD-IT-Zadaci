package miniProjekat04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestBattleship {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean worksApplication = true;
		
		//loop which controls application
		while (worksApplication){
			Battleship b1 = new Battleship();
			System.out.println("Welcome to the Battleship game :)");
			System.out.println("1. Play new game.");
			System.out.println("2. Exit.");
			int choice1 = 0;
			
			//loop which controls correct choice in the first window
			boolean works1 = true;
			while (works1){
				try{
					System.out.print("Choose (1 or 2): ");
					choice1 = input.nextInt();
					
					if(choice1 == 1 || choice1 == 2){
						break;
					}
					else{
						System.out.println("You can choose only 1 or 2! Try again.");
						input.nextLine();
						continue;
					}
				}catch (InputMismatchException ex){
					System.out.println("Invalid input. Try again.");
					input.nextLine();
				}
			}//works1 
			
			if (choice1 == 1){
				System.out.println("----------------------------------------------------------");
				System.out.println("You can exit the game if you enter Y as letter for column!");//**
				System.out.println("----------------------------------------------------------");
				System.out.println("Your hits will be shown as 'O' and misses as 'x!");
				System.out.println("----------------------------------------------------------");
				boolean play = true;
				
				//loop which works until all the ships are sunk 
				while (play){
					
					//check are the ships sunk
					if (b1.isWin()){
						System.out.println("----------------------------------------");
						System.out.println("All the ships are sunk! Congratulations!");
						System.out.println("Positions of the ships are: ");
						b1.printShips();
						break;
					}
					
					//print guess matrix with all hits and misses
					b1.printGuess();
					
					boolean works2 = true;
					int row = 0;
					
					//loop which controls correct input of the row
					while (works2){
						try{
							System.out.print("Enter the row (0-9): ");
							row = input.nextInt();
							
							if(b1.isValidRow(row)){
								input.nextLine();
								break;
							}
							else{
								System.out.println("You entered the number out of defined bounds! Try again.");
								input.nextLine();
								continue;
							}
							
						}catch (InputMismatchException ex){
							System.out.println("Invalid input. Try again.");
							input.nextLine();
						}
					}
					
					boolean works3 = true;
					char column = ' ';
					
					//loop which controls correct input of letter for column
					while (works3){
						try{
							System.out.print("Enter the letter for column (A-J): ");
							String letter = input.next();
							
							//if user tries to input more than one letter program tells him that he can enter only one letter
							if (letter.length() > 1){
								System.out.println("You can enter only one letter!");
								input.nextLine();
								continue;
							}
							else{
								column = letter.charAt(0);
								column = Character.toUpperCase(column);
								if(column == 'Y'){
									System.out.println("Thank you for playing Battleship game :)");
									System.exit(1);
								}
								else if (b1.isValidColumn(column)){
									break;
								}
								else{
									System.out.println("Enter the letter between A-J! Try again.");
									input.nextLine();
									continue;
								}
							}
							
						}catch (InputMismatchException ex){
							System.out.println("Invalid input. Try again.");
							input.nextLine();
						}
					}
					
					//check if chosen position is empty
					if(b1.isPositionEmpty(row, column)){
						b1.setCharAtPosition(row, column);
					}
					else{
						System.out.println("You already had chosen this position before. Try another position.");
					}
					
				}//play ends
				
			}
			else if (choice1 == 2){
				break;
			}
			
		}//worksApplication end
		
		System.out.println("Thank you for playing Battleship game :)");
		input.close();
	}

}
