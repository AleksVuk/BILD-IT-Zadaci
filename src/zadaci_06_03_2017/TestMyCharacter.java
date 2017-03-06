package zadaci_06_03_2017;

public class TestMyCharacter {

	public static void main(String[] args) {
		
		//testing all methods from MyCharacter class
		
		//creating MyCharacter objects
		MyCharacter ch1 = new MyCharacter('A');
		MyCharacter ch2 = new MyCharacter('z');
		MyCharacter ch3 = new MyCharacter('1');
		MyCharacter ch4 = new MyCharacter('/');
		
		//test toLowerCase method
		System.out.println(ch1.toLowerCase());
		
		//test toUpperCase method
		System.out.println(ch2.toUpperCase());
		
		//test is char a letter
		System.out.println(ch2.getCh() + " is letter?" + ch2.isLetter());
		System.out.println(ch3.getCh() + " is letter?" + ch3.isLetter());
		
		//test is char a digit
		System.out.println(ch2.getCh() + " is digit?" + ch2.isDigit());
		System.out.println(ch3.getCh() + " is digit?" + ch3.isDigit());
		
		//test is char a digit or letter
		System.out.println(ch2.getCh() + " is letter or digit?" + ch2.isLetterOrDigit());
		System.out.println(ch3.getCh() + " is letter or digit?" + ch3.isLetterOrDigit());
		System.out.println(ch4.getCh() + " is letter or digit?" + ch4.isLetterOrDigit());
		
		//test are the two characters equal
		System.out.println(ch4.isEqual('/'));
		System.out.println(ch1.isEqual(ch4));
		
		System.out.println();
		
		//test static methods
		char c = 'a';
		System.out.println(MyCharacter.isLetter(c));
		System.out.println(MyCharacter.isDigit(c));
		System.out.println(MyCharacter.isLetterOrDigit(c));
		System.out.println(MyCharacter.toUpperCase(c));
		System.out.println(MyCharacter.toLowerCase(c));
	}

}
