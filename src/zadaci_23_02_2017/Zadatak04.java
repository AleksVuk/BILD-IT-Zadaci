package zadaci_23_02_2017;

import java.util.Date;

public class Zadatak04 {

	public static void main(String[] args) {
		
		System.out.println(printDateAndTime());
		
	}
	//method which calculates the current date and time
	public static Date printDateAndTime(){
		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		return date;
	}
	
}
