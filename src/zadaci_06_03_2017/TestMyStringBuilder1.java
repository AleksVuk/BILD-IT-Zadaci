package zadaci_06_03_2017;

public class TestMyStringBuilder1 {

	public static void main(String[] args) {
		//testing all methods from MyStringBuilder1 class
		
		//creating MyStringBuilder1 objects
		MyStringBuilder1 str1 = new MyStringBuilder1("Goodbye");
		MyStringBuilder1 str2 = new MyStringBuilder1("Hello");
		
		//test append(MyStringBuilder1 s) method
		str1 = str1.append(str2);
		System.out.println(str1.toString());
		
		//test append(int i) method
		int n = 99;
		str2 = str2.append(n);
		System.out.println(str2.toString());
		
		//test length method
		System.out.println("Length of " + str2.toString() + " is " + str2.length());
		
		//test charAt method
		int index = 6;
		char ch = str2.charAt(index);
		System.out.println("Char at index " + index + " in string " + str2.toString() + " is " + ch + ".");
		
		//test toLowerCase method
		System.out.println(str1.toLowerCase());
		
		//test substring method
		System.out.println(str1.substring(4, 9));
		
		
	}

}
