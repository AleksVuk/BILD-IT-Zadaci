package zadaci_07_03_2017;

public class Person {
	private String name;
	private String address;
	private int phoneNumber;
	private String emailAddress;
	
	Person(String name, String address, int phoneNumber, String emailAddress){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress="
				+ emailAddress + "]";
	}
	
}
