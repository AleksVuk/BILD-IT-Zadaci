package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak01 {

	public static void main(String[] args) {
		
		String n = 1 + "";
		for (int i = 0; i < 50; i++){
			n = n + "0";
		}
		
		//creating BigDecimal objects
		BigDecimal number = new BigDecimal(n);
		BigDecimal n1 = new BigDecimal(1);
		BigDecimal n2 = new BigDecimal(2);
		BigDecimal n3 = new BigDecimal(3);
		
		int count = 0;
		
		while(count < 10){
			//check if the number is divisible by 2 or 3
			if (number.remainder(n2) == BigDecimal.ZERO || number.remainder(n3) == BigDecimal.ZERO){
				count ++;
				System.out.println(count + "." + number);
			}
			
			//increment number by 1
			number = number.add(n1);
		}
		
	}

}
