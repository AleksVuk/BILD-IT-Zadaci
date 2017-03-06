package zadaci_06_03_2017;

public class MyCharacter {
	private char ch;
	
	public MyCharacter(char ch){
		this.ch = ch;
	}

	public char getCh() {
		return ch;
	}
	
	public char toLowerCase(){
		if(ch >= 'A'  &&  ch <= 'Z'){
			ch = (char)((int)(ch) + 97 - 65);
			return ch;
		}
		else{
			return ch;
		}
	}
	
	public char toUpperCase(){
		if(ch >= 'a'  &&  ch <= 'z'){
			ch = (char)((int)(ch) - 97 + 65);
			return ch;
		}
		else{
			return ch;
		}
	}
	
	public boolean isLetter(){
		if (ch >= 'a' && ch <= 'z'  ||  ch >= 'A' && ch <= 'Z'){
			return true;
		}
		return false;
	}
	
	public boolean isDigit(){
		if (ch >= 48 && ch <= 57){
			return true;
		}
		return false;
	}
	
	public boolean isLetterOrDigit(){
		if (ch >= 'a' && ch <= 'z'  ||  ch >= 'A' && ch <= 'Z'  ||  ch >= 48 && ch <= 57){
			return true;
		}
		return false;
	}
	
	public boolean isEqual(char ch){
		if (this.ch == ch){
			return true;
		}
		return false;
	}
	
	public boolean isEqual(MyCharacter ch){
		if (this.ch == ch.getCh()){
			return true;
		}
		return false;
	}
	
	public static char toLowerCase(char ch){
		if(ch >= 'A'  &&  ch <= 'Z'){
			ch = (char)((int)(ch) + 97 - 65);
			return ch;
		}
		else{
			return ch;
		}
	}
	
	public static char toUpperCase(char ch){
		if(ch >= 'a'  &&  ch <= 'z'){
			ch = (char)((int)(ch) - 97 + 65);
			return ch;
		}
		else{
			return ch;
		}
	}
	
	public static boolean isLetter(char ch){
		if (ch >= 'a' && ch <= 'z'  ||  ch >= 'A' && ch <= 'Z'){
			return true;
		}
		return false;
	}
	
	public static boolean isDigit(char ch){
		if (ch >= 48 && ch <= 57){
			return true;
		}
		return false;
	}
	
	public static boolean isLetterOrDigit(char ch){
		if (ch >= 'a' && ch <= 'z'  ||  ch >= 'A' && ch <= 'Z'  ||  ch >= 48 && ch <= 57){
			return true;
		}
		return false;
	}
	
	
	
}
