package zadaci_02_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntersectingPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double [] m = new double [8];
		boolean works = true;
		//loop which controls correct input of start and end points for two lines
		while(works){
			try{
				System.out.print("Enter  x1, y1, x2, y2, x3, y3, x4, y4: ");
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
		
		double a = m[1] - m[3];
		double b = -(m[0] - m[2]);
		double c = m[5] - m[7];
		double d = -(m[4] - m[6]);
		double e = (m[1] - m[3]) * m[0] - (m[0] - m[2]) * m[1];
		double f = (m[5] - m[7]) * m[4] - (m[4] - m[6]) * m[5];
		
		LinearEquation eq2 = new LinearEquation (a, b, c, d, e, f);
		if (eq2.isSolvable()){
			System.out.printf("The intersecting point is at (%.5f, %.5f)", eq2.getX(), eq2.getY());
		}
		else{
			System.out.println("The two lines are parallel!");
		}
		
		input.close();
	}

}
