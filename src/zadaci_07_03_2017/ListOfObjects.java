package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Date;

import zadaci_28_02_2017.Account;

public class ListOfObjects {

	public static void main(String[] args) {
		
		//creating an array list with Object type
		ArrayList<Object> list = new ArrayList<Object>();
		Date todaysDate = new Date();
		String s = new String ("Shuffleee");
		Triangle t = new Triangle (5.5, 2.3, 3.1);
		Account a = new Account (10, 7000);
		
		//adding different type of objects to a list
		list.add(todaysDate);
		list.add(s);
		list.add(t);
		list.add(a);
		
		//print array list
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).toString());
		}
	}

}
