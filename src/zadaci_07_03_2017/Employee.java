package zadaci_07_03_2017;

import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary;
	private Date dateHired;
	
	Employee(String office, double salary, String name, String address, int phoneNumber, String emailAddress){
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		dateHired = new Date();
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + ", toString()="
				+ super.toString() + "]";
	}

}
