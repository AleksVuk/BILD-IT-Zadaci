package zadaci_02_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testQuadraticEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double [] m = new double [3];
		boolean works = true;
		//loop which controls correct input of a, b and c for quadratic equation
		while(works){
			try{
				System.out.print("Enter numbers (between -20 and 20) for a, b and c for quadratic equation: ");
				m[0] = input.nextDouble();
				m[1] = input.nextDouble();
				m[2] = input.nextDouble();
				if (m[0] == 0){
					System.out.println("Wrong input, a cannot be 0! Try again.");
					input.nextLine();
					continue;
				}
				if (m[0] >= -20  &&  m[1] >= -20  &&  m[2] >= -20  &&  m[0] <= 20  &&  m[1] <= 20  &&  m[2] <= 20  &&  m[0] != 0){
						break;
				}
				else{
					System.out.println("Wrong input! Try again. ");
					input.nextLine();
					continue;
				}
				
			}catch (InputMismatchException ex){
				System.out.println("Invalid input! Try again.");
				input.nextLine();
			}
		}
		
		QuadraticEquation eq1 = new QuadraticEquation(m[0], m[1], m[2]);
		if (eq1.getDiscriminant() > 0){
			System.out.println("The equation has two roots:");
			System.out.printf("Root 1 is: r1 = %.3f", eq1.getRoot1());
			System.out.printf("\nRoot 2 is: r2 = %.3f", eq1.getRoot2());
		}
		else if (eq1.getDiscriminant() == 0){
			System.out.printf("The equation has one root: r = %.3f", eq1.getRoot1());
		}
		else{
			System.out.println("The equation has no real roots!");
		}
		
		input.close();
	}

}
