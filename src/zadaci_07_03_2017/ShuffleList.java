package zadaci_07_03_2017;

import java.util.ArrayList;

public class ShuffleList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//initializing the list with integers from 0 to 100
		for (int i = 0; i < 8; i++){
			int n = (int)(Math.random()*100);
			list.add(n);
		}
		
		System.out.println(list.toString());
		
		//invoking method to shuffle the list
		shuffle(list);
		System.out.println(list.toString());
		
	}
	//method which shuffles the elements in the list
	public static void shuffle(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++){
			int n = (int)(Math.random() * list.size());
			int temp = list.get(i);
			list.set(i, list.get(n));
			list.set(n, temp);
		}
	}
}
