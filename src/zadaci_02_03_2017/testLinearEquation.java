package zadaci_02_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testLinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double [] m = new double [6];
		boolean works = true;
		//loop which controls correct input of a, b, c, d, e, and f for linear equation
		while(works){
			try{
				System.out.print("Enter numbers (between -100 and 100) for a, b, c, d, e and f for linear equation: ");
				for (int i = 0; i < m.length; i++){
					m[i] = input.nextDouble();
					if (m[i] > 100  ||  m[i] < -100){
						System.out.println("Wrong input! Enter numbers between -100 and 100!");
						works = true;
						input.nextLine();
						break;
					}
					works = false;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Invalid input! Try again.");
				input.nextLine();
			}
		}
		
		LinearEquation eq1 = new LinearEquation (m[0], m[1], m[2], m[3], m[4], m[5]);
		if (eq1.isSolvable()){
			System.out.printf("Solution for the equation is: x = %.4f, and y = %.4f", eq1.getX(), eq1.getY());
		}
		else{
			System.out.println("The equation has no solution!");
		}
		
		input.close();
	}

}
