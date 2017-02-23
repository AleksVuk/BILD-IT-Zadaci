package zadaci_23_02_2017;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		boolean works = true;
		//loop which controls correct input of social security number in defined format
		while (works){
			//counter which counts correct characters at specified index
			int count = 0;
			System.out.println("Enter your Social Security Number in format as follows (D is digit) DDD-DD-DDDD: ");
			String ssn=input.nextLine();
			//it's length must be exactly 11 characters 
			if (ssn.length() == 11){
				for (int i = 0; i < 11; i++){
					if ((i < 3)  ||  (i > 3  && i < 6)  ||  ( i > 6  &&  i < 11)){
						char ch = ssn.charAt(i);
						if (Character.isDigit(ch)){
							count++;
						}
						else{
							System.out.println("SSN cant contains any other charachters beside numbers and the '-' sign!");
						break;
						}
					}else if (i == 3  ||  i == 6){
						if (ssn.charAt(i) == '-'){
							count++;
						}
						else {
							System.out.println("You must follow the format DDD-DD-DDDD");
							break;
						}
					}
				}
			}else if(ssn.length() != 11){
				System.out.println("SSN must contains 11 characters!");
				continue;
			}
			//if there is 11 correct characters counter has value of 11 what means that entered number is correct
			if (count==11){
				System.out.println("Entered SSN: " + ssn + " is valid.");
				break;
			}
		}
		input.close();
	}

}
