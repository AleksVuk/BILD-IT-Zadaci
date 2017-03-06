package zadaci_06_03_2017;


public class TestMyString2 {

	public static void main(String[] args) {
		
		//testing all methods from MyString2 class
		
		//creating MyString2 objects
		MyString2 str1 = new MyString2("Doboj");
		MyString2 str2 = new MyString2("123");
		
		String str3 = "125";
		
		//test compareTo method
		System.out.println(str2.toString() + " compare to " + str3 + " is " + str2.compare(str3));
		
		//test substring method
		MyString2 str4 = str1.substring(2);
		System.out.println("Substring is " + str4.toString());
		
		//test toUpperCase method
		MyString2 str5 = str1.toUpperCase();
		System.out.println(str1.toString() + ", to upper case is: " + str5.toString());
		
		//test toChars method
		char[] chars = str1.toChars();
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		
		//test valueOf method
		boolean test = true;
		MyString2 str6 = MyString2.valueOf(test); 
		System.out.println("\nValue of test is " + str6.toString());
		
		
		//test newSplit method
		String s1 = "abw]gd[fre";
		String s2 = "[?#]";
		String[] array =  MyString2.newSplit(s1, s2);
		
		for (int i = 0; i < array.length; i++){
			if (i == array.length - 1){
				System.out.print(array[i] + ".");
			}
			else{
				System.out.print(array[i] + ", ");	
			}	
		}
		
	}

}
