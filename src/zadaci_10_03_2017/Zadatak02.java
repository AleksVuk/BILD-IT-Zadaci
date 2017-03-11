package zadaci_10_03_2017;

public class Zadatak02 {

	public static void main(String[] args) {
		int size = Integer.MAX_VALUE;
		
		try{
			int [] x = new int[size];
			
			System.out.println(x.toString());
		}
		catch (OutOfMemoryError e){
			System.out.println("You ran out of memory");
		}
		
		
	}

}
