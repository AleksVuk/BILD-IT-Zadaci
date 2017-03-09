package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfConvexPolygon {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean works1 = true;
		int n = 0;
		
		//loop which controls correct input of the number of the polygon's points
		while (works1) {
			try {
				System.out.print("Enter the number of points in a convex polygon n (2<n<10): ");
				n = input.nextInt();
				if (n > 2 && n <= 10){
					break;
				}
				else{
					System.out.println("You entered number out of defined bounds! Try again.");
					input.nextLine();
					continue;
				}
				
			} catch (InputMismatchException ex) {
				System.out.println("Invalid input, try again.");
				input.nextLine();
			}
		}
		
		ArrayList<Double> list = new ArrayList<>();
		boolean works2 = true;
		
		//loop which controls correct input of the points coordinates
		while (works2) {
			try {
				System.out.print("Enter the coordinates of the points: ");
				//i<n*2 because every point has two coordinates
				for (int i = 0; i < n*2; i++) {
					double x = input.nextDouble();
					list.add(x);
				}
				works2 = false;
				
			} catch (InputMismatchException ex) {
				System.out.println("Invalid input, try again.");
				list.clear();
				input.nextLine();
			}
		}
		
		//add first point's coordinates to the end of the list, so we can calculate the area
		list.add(list.get(0));
		list.add(list.get(1));
		
		//invoke getArea method
		System.out.println("The area of the entered polygon is: " + getArea(list));
		input.close();
		
	}
	
	//method which returns the area of the convex polygon
	public static double getArea(ArrayList<Double> list){
		
		//calculate the sum of all x(i) * y(i+1) 
		double sum1 = 0;
		for (int i = 0; i < list.size() - 3; i+=2){
			sum1 += list.get(i) * list.get(i+3);
		}
		
		//calculate the sum of all y(i) * x(i+1)
		double sum2 = 0;
		for (int i = 1; i < list.size() - 2; i+=2){
			sum2 += list.get(i) * list.get(i+1);
		}

		double area = (sum1 - sum2) / 2;
		
		//if area is negative value return the absolute value
		return Math.abs(area);
		
	}
}
