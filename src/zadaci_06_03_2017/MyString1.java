package zadaci_06_03_2017;


public class MyString1 {
	
	char[] chars;

	
	public MyString1(char[] chars){
		this.chars = chars;
	}

	
	public char charAt(int index){
		return chars[index];
	}
	
	public int length(){
		return chars.length;
	}
	
	public MyString1 substring(int begin, int end){
		char[] chars2 = new char [end-begin];
		for (int i = 0; i < chars2.length; i++){
			chars2[i] = chars[i + begin];
		}
		
		return new MyString1(chars2);
	}
	
	public MyString1 toLowerCase(){
		char[] chars2 = new char[chars.length];
		for (int i = 0; i < chars.length; i++){
			if (chars[i] >= 'a'  &&  chars[i] <= 'z'){
				chars2[i] = chars[i];
			}
			else{
				int number = (int)(chars[i] - 65 + 97);
				char ch = (char)number;
				chars2[i] = ch;
			}
		}
		return new MyString1(chars2);
	}
	
	public boolean equals(MyString1 s){
		if (s.length() != chars.length){
			return false;
		}
		
		for(int i = 0; i < s.length(); i++){
			if (s.charAt(i) != chars[i]){
				return false;
			}
		}
		return true;
	}
	
	public static MyString1 valueOf(int i){
		String s = i+"";
		
		char[] chars2 = new char[s.length()];
		
		for (int j = 0; j < s.length(); j++){
			chars2[j] = s.charAt(j);
		}
		
		return new MyString1(chars2);
	}
	
	public char[] getChars() {
		return chars;
	}


	public String toString() {
		String str = "";
		for (int i = 0; i < chars.length; i++){
			str = str + chars[i];
		}
		return str;
		
	}
	
	
	
	
	
}
