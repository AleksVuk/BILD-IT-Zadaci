package zadaci_03_03_2017;

public class testMyPoint {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		MyPoint p3 = new MyPoint(1.5, -3.4);
		System.out.println("The distance between points p1 and p2 is: " + p1.distance(p2));
		System.out.println("The distance between point p3 and point at location (x = 4 and y = 5) is: " + p3.distance(4, 5));
		
	}

}
