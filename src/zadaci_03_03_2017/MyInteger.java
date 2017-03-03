package zadaci_03_03_2017;

public class MyInteger {
	private int value;
	
	MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	public boolean isEven(){
		if (value % 2 == 0){
			return true;
		}
		return false;
	}
	
	public boolean isOdd(){
		if (value % 2 == 0){
			return false;
		}
		return true;
	}
	
	public boolean isPrime(){
		if (value == 0 || value == 1 || value == -1){
			return false;
		}
		for (int i = 2; i < value; i++){
			if (value % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int n){
		if (n % 2 == 0){
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int n){
		if (n % 2 == 0){
			return false;
		}
		return true;
	}
	
	public static boolean isPrime(int n){
		if (n == 0 || n == 1 || n == -1){
			return false;
		}
		for (int i = 2; i < n; i++){
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger n){
		if(n.getValue() % 2 == 0){
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(MyInteger n){
		if(n.getValue() % 2 == 0){
			return false;
		}
		return true;
	}
	
	public static boolean isPrime(MyInteger n){
		if (n.getValue() == 0 || n.getValue() == 1 || n.getValue() == -1){
			return false;
		}
		for (int i = 2; i < n.getValue(); i++){
			if (n.getValue() % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int x){
		if (value == x){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean equals(MyInteger n){
		if (value == n.getValue()){
			return true;
		}
		return false;
	}
	
	public static int parseInt(char [] c){
		int number = 0;
		for (int i = 0; i < c.length; i++){
			int n = (int)(c[i]);
			number = number * 10 + n;
		}
		return number;
	}
	
	public static int parseInt(String s){
		int number = Integer.parseInt(s);
		return number;
	}
	
	
	
	
	
	
	
}
