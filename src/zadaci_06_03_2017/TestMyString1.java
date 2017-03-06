package zadaci_06_03_2017;

public class TestMyString1 {

	public static void main(String[] args) {
		
		//testing all methods from MyString1 class
		
		//creating MyString1 object
		char[] chars1 = {'H', 'e', 'l', 'l', 'o'};
		MyString1 str1 = new MyString1(chars1);
		
		//test charAt method
		System.out.println("Char at 2 is " + str1.charAt(2));
		
		//test length method
		System.out.println("Length is " + str1.length());
		
		//test substring method
		MyString1 str2 = str1.substring(1, 3);
		System.out.println("Substring 1, 3 is " + str2.toString());
		
		//test toLowerCase method
		MyString1 str3 = str1.toLowerCase();
		System.out.println("To lower case is: " + str3.toString());
		
		//test equals method
		System.out.println(str3.equals(str1));
		
		//test valueOfMethod
		int number = 7894;
		MyString1 intValue = MyString1.valueOf(number);
		System.out.println("Value of " + number + " is " + intValue);
	}

}
