package zadaci_02_03_2017;

public class testRegularPolygon {

	public static void main(String[] args) {
		RegularPolygon pol1 = new RegularPolygon ();
		RegularPolygon pol2 = new RegularPolygon (6, 4);
		RegularPolygon pol3 = new RegularPolygon (10, 4, 5.6, 7.8);
		
		System.out.println("First polygon with " + pol1.getN() + " sides and side length " + pol1.getSide() + ". It's perimeter is : " 
																	  + pol1.getPerimeter() + " and area is: " + pol1.getArea() + ".");
		
		System.out.println("\nSecond polygon with " + pol2.getN() + " sides and side length " + pol2.getSide() + ". It's perimeter is : " 
				  + pol2.getPerimeter() + " and area is: " + pol2.getArea() + ".");
		
		System.out.println("\nThird polygon with " + pol3.getN() + " sides and side length " + pol3.getSide() + ". It's perimeter is : " 
				  + pol3.getPerimeter() + " and area is: " + pol3.getArea() + ".");
		
	}

}
