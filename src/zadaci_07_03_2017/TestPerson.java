package zadaci_07_03_2017;

public class TestPerson {

	public static void main(String[] args) {
		//test person and its subclasses
		Person person = new Person("Aleksandar", "Doboj", 222222, "me@gmail.com");
		Student student = new Student ("Freshman", "Luka", "Tuzla", 545644, "lll@gmail.com");
		Employee employee = new Employee ("Economy", 1555.5, "Jack", "NY", 999988, "jack@yahoo.com");
		Faculty faculty = new Faculty("Higher Level", 42, "Traffic", 2900, "Chriss", "Boston", 123456, "chris@yahoo.com");
		Staff staff = new Staff("Boss", "Programming", 3500, "Ensar", "Los Angeles", 0, "ensoMentor@gmail.com");
		
		//invoking their toString methods
		System.out.println(person.toString());
		System.out.println("\n" + student.toString());
		System.out.println("\n" + employee.toString());
		System.out.println("\n" + faculty.toString());
		System.out.println("\n" + staff.toString());
		
	}

}
