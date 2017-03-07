package miniProjekat04;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Hangman {

	public static void main(String[] args) {
		
		String [] words = {"mercedes", "toyota", "renault", "chevrolet", "volkswagen", "subaru", "jaguar", "audi"};
		
		Scanner input = new Scanner(System.in);
		boolean worksApplication = true;
		int i = 0;
		
		//loop which controls application
		while (worksApplication){
			//if you guessed all words application exits
			if (i == words.length){
				System.out.println("You guessed all words!");
				break;
			}
			System.out.println("Welcome to the hangman game :)");
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
			}
			
			if (choice1 == 1){
				System.out.println("-------------------------------------");
				System.out.println("You can exit the game if you enter 7!");
				System.out.println("-------------------------------------");
				StringBuilder word1 = getWord(words[i]);
				StringBuilder word2 = stringWithPoints(word1);
				int countMisses = 0;
				i++;
				boolean play = true;
				
				//loop which works until user has guessed the word
				while (play){
					if (equals(word1, word2)){
						System.out.println("------------------------------------------");
						System.out.println("The word is " + word1 + ". You missed " + countMisses + " time/s.");
						System.out.println("------------------------------------------");
						break;
					}
					System.out.print("(Guess) Enter a letter in word " + word2 + " > ");
					String guess = input.next();
					
					//if user tries to input more than one letter program tells him that he can guess only one letter
					if (guess.length() > 1){
						System.out.println("You can guess only one letter!");
						input.nextLine();
						continue;
					}
					else{						
						char ch = guess.charAt(0);
						
						//exit the application
						if (ch == '7'){
							System.out.println("Thank you for playing hangman game :)");
							System.exit(1);
						}
						
						ch = Character.toLowerCase(ch);
						
						if (contains(word1, ch)){
							
							//if user tries to guess an already guessed letter program tells him that he has guessed that letter before
							if (contains(word2, ch)){
								System.out.println("You already guessed letter " + ch + ". Try another letter.");
								input.nextLine();
								continue;
							}
							else{
								//if user guessed the letter that letter shows up in the word before next input 
								replace(word1, word2, ch);
								input.nextLine();
								continue;
							}
						}
						else{
							//if user missed the letter program tells him that guessed letter is not in the word
							System.out.println(ch + " is not in the word.");
							countMisses++;
							input.nextLine();
							continue;
						}
					
					}
				}			
				
			}
			//if user chooses 2 in first window program exits
			else if(choice1 == 2){
				break;
			}
			
		}
		System.out.println("Thank you for playing hangman game :)");
		
		input.close();
	}
	
	//get the word to guess (from array of words)
	public static StringBuilder getWord(String a){
		StringBuilder word1 = new StringBuilder();
		for (int i = 0; i < a.length(); i++){
			word1.append(a.charAt(i));
		}
		return word1;
	}
	
	//fill the another string with exactly the same number of points as the word to guess has
	public static StringBuilder stringWithPoints(StringBuilder a){
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < a.length(); i++){
			s.append(".");
		}
		return s;
	}
	
	//check if the guessed letter is in the word
	public static boolean contains(StringBuilder a, char ch){
		for (int i = 0; i < a.length(); i++){
			if (a.charAt(i) == ch){
				return true;
			}
		}
		return false;
	}
	
	//replace the point in word with a letter at specific index
	public static void replace(StringBuilder a, StringBuilder b, char ch){
		for (int i = 0; i < a.length(); i++){
			if (a.charAt(i) == ch){
				b.setCharAt(i, ch);
			}
		}
	}
	
	//check is the guessed word correct
	public static boolean equals(StringBuilder a, StringBuilder b){
		for (int i = 0; i < b.length(); i++){
			if (a.charAt(i) != b.charAt(i)){
				return false;
			}
		}
		return true;
	}
}
