package zadaci_06_03_2017;

public class MyStringBuilder1 {
	private String s;
	
	public MyStringBuilder1(String s){
		this.s = s;
	}
	
	public MyStringBuilder1 append(MyStringBuilder1 s){
		return new MyStringBuilder1(this.s + s);
	}
	
	public MyStringBuilder1 append(int i){
		return new MyStringBuilder1(this.s + (i +""));
	}
	
	public int length(){
		return s.length();
	}
	
	public char charAt(int index){
		return s.charAt(index);
	}

	public MyStringBuilder1 toLowerCase(){
		String str = "";
		for (int i = 0; i < s.length(); i ++){
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				str = str + s.charAt(i);
			}
			else{
				int number = (int)(s.charAt(i)) - 65 + 97;
				char ch = (char)number;
				str = str + ch;
 			}
		}
		return new MyStringBuilder1(str);
	}
	
	public MyStringBuilder1 substring(int begin, int end){
		String str = "";
		for (int i = begin; i < end; i++){
			str = str + s.charAt(i);
		}
		
		return new MyStringBuilder1(str);
	}
	
	public String toString(){
		return this.s;
	}
}
