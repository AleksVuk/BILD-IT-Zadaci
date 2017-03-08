package zadaci_07_03_2017;

public class Student extends Person {
	private final String CLASS_STATUS;
	
	public Student (String classStatus, String name, String address, int phoneNumber, String emailAddress){
		super(name, address, phoneNumber, emailAddress);
		CLASS_STATUS = classStatus;
	}

	public String getClassStatus() {
		return CLASS_STATUS;
	}

	@Override
	public String toString() {
		return "Student [CLASS_STATUS=" + CLASS_STATUS + ", toString()=" + super.toString() + "]";
	}


	
	
}
