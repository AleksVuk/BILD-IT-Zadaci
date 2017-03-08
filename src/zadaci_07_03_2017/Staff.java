package zadaci_07_03_2017;

public class Staff extends Employee {
	private String title;
	
	Staff(String title, String office, double salary, String name, String address, int phoneNumber, String emailAddress) {
		super(office, salary, name, address, phoneNumber, emailAddress);
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Staff [title=" + title + ", toString()=" + super.toString() + "]";
	}
	
	
}
