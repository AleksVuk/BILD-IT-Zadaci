package zadaci_18_02_2017;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long milliseconds = System.currentTimeMillis();
		//formatiramo datum na osnovu proslijedjenih milisekundi
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MMMM, yyyy. HH:mm:ss");    
		Date resultDate = new Date(milliseconds);
		System.out.print("\"Trenutni datum i vrijeme: ");
		System.out.println(sdf.format(resultDate) + "\"");
		
	}

}
