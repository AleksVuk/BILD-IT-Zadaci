package zadaci_07_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double[] sides = new double [3];
		
		boolean works = true;
		//loop which controls correct input of triangle sides
		while (works){
			try{
			System.out.print("Enter three sides of the triangle: ");
			for (int i = 0; i < 3; i++){
				sides[i] = input.nextDouble();
			}
			if (sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0){
				System.out.println("All three sides have to be positive numbers!");
				input.nextLine();
				continue;
			}
			else{
				break;
			}
			
			}catch (InputMismatchException ex){
				System.out.println("Invalid input, try again.");
				input.nextLine();
			}
		}
		
		//enter color of the triangle
		System.out.print("Enter the color of the triangle: ");
		String color = input.next();
		
		boolean filled = false;
		boolean works1 = true;
		//loop which controls correct input of true or false for filled
		while(works1){
			System.out.print("Enter is the triangle filled (true or false): ");
			String s = input.next();
			if (s.equals("true")){
				filled = true;
				break;
			}
			else if(s.equals("false")){
				filled = false;
				break;
			}
			else{
				System.out.println("Wrong input, try again.");
				input.nextLine();
			}
		}
		
		//creating new triangle object with specified sides length, color and filled
		Triangle t = new Triangle (sides[0], sides[1], sides[2]);
		t.setColor(color);
		t.setFilled(filled);
		
		System.out.println("Area of the triangle is: " + t.getArea());
		System.out.println("Perimeter of the triangle is: " + t.getPerimeter());
		System.out.println(t.toString());
		
		input.close();
	}

}
