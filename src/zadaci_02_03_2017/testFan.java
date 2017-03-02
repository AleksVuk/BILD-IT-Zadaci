package zadaci_02_03_2017;

public class testFan {

	public static void main(String[] args) {
		
		// creating fan objects
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		// initializing fan1 object
		fan1.setSpeed(3);
		fan1.setColor("yellow");
		fan1.setRadius(10);
		fan1.setOn(true);

		// initializing fan2 object
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);

		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

}
