package zadaci_07_03_2017;

public class Faculty extends Employee{
	private String rank;
	private double hours;
	
	Faculty(String rank, double hours, String office, double salary, String name, String address, int phoneNumber, String emailAddress) {
		super(office, salary, name, address, phoneNumber, emailAddress);
		this.rank = rank;
		this.hours = hours;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "Faculty [rank=" + rank + ", hours=" + hours + ", toString()=" + super.toString() + "]";
	}

	
	

	
	
	
}
