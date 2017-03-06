package zadaci_06_03_2017;

public class MyString2 {
	private String s;
	
	MyString2 (String s){
		this.s = s;
	}

	public String getS() {
		return s;
	}
	
	public int compare(String s){
		if (this.s.length() > s.length()  ||  this.s.length() < s.length()){
			return this.s.length() - s.length();
		}
		else{
			for (int i = 0; i < s.length(); i++ ){
				if(this.s.charAt(i) > s.charAt(i)  ||  this.s.charAt(i) < s.charAt(i)){
					return this.s.charAt(i) - s.charAt(i);
				}
			}
			return 0;
		}
	}
	
	public MyString2 substring(int begin){
		String s2 = "";
		for (int i = begin; i < s.length(); i++){
			s2 = s2 + s.charAt(i);
		}
		return new MyString2(s2);
	}
	
	public MyString2 toUpperCase(){
		String str = "";
		
		for (int i = 0; i < s.length(); i++){
			if(s.charAt(i) >= 'A'  &&  s.charAt(i) <= 'Z'){
				str = str + s.charAt(i);
			}
			else{
				int number = (int)(s.charAt(i) + 65 - 97);
				char ch = (char)number;
				str = str + ch;
			}
		}
		
		return new MyString2(str);
	}
	
	public char[] toChars(){
		char[] chars = new char[s.length()];
		for (int i = 0; i < s.length(); i++){
			chars[i] = s.charAt(i);
		}
		
		return chars;
	}
	
	public static MyString2 valueOf(boolean b){
		String value = "";
		if (b == true){
			value = "true";
		}
		else{
			value = "false";
		}
		return new MyString2(value);
	}
	
	public String toString() {
		return s;
	}

	//new split method 
	public static String[] newSplit(String s, String regex){
		String[] splited = new String[s.length()];
		int start = 0;
		int index = 0;
		for (int i = 0; i < s.length(); i++){
			for (int j = 0; j < regex.length(); j++){
				if (s.charAt(i) == regex.charAt(j)){
					String s1 = s.substring(start, i);
					splited[index] = s1;
					index++;
					String s2 = regex.charAt(j) + "";
					splited[index] = s2;
					index++;
					start = i + 1;
				}
			}
			
		}
		//if there was not chars matched in string s and regex, return is string equal to string s
		if (splited[0] == null){
			String[] word = new String[1];
			word[0] = s;
			return word;
		}
		//get the string after the last regex character
		int i = s.length() - 1;
		while(i >= 0){
			for (int j = 0; j < regex.length(); j++){
				if (s.charAt(i) == regex.charAt(j)){
					String s1 = s.substring(i+1);
					splited[index] = s1;
					i = -1;
					break;
				}
				
			}
		i--;
		}
		
		//get number of elements in splitted array of strings
		int size = 0;
		for (int k = 0; k < splited.length; k++){
			if (splited[k] == null){
				size = k - 1;
				break;
			}
		}
		
		//new array of strings which takes all elements different than null from splited array 
		String[] splited1 = new String[size];
		for (int e = 0; e < size; e++){
			splited1[e] = splited[e];
		}
		return splited1;
		
	}
	
	
}
