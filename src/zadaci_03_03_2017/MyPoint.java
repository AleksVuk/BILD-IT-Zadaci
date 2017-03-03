package zadaci_03_03_2017;

public class MyPoint {
	private double x;
	private double y;
	
	MyPoint(){
		x = 0;
		y = 0;
	}
	
	MyPoint( double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double distance(MyPoint point){
		double a = point.getX() - x;
		a = Math.pow(a, 2);
		double b = point.getY() - y;
		b = Math.pow(b, 2);
		double sum = a+b;
		double distance = Math.sqrt(sum);
		return distance;
	}
	
	public double distance(double x1, double y1){
		double a = x1 - x;
		a = Math.pow(a, 2);
		double b = y1 - y;
		b = Math.pow(b, 2);
		double sum = a+b;
		double distance = Math.sqrt(sum);
		return distance;
	}
	
}
