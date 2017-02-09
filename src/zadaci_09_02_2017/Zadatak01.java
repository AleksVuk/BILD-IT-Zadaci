package zadaci_09_02_2017;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		//ispitivanje svake godine izmedju 101. i 2100. da li je prestupna,
		// i uvecavanje brojaca za jedan kad god program izracuna prestupnu godinu,
		//da bismo na kraju dobili ukupan broj prestupnih godina.
		for (int i=101;i<=2100;i++){
			int year=i;
			if ((year%4==0&&year%100!=0)||(year%400==0)){ //uslov koji mora biti ispunjen da bi godina bila prestupna.
				count++;
				if (count%10!=0){
					System.out.print(year+" ");
				} 
				else{
					System.out.println(year+" ");
				}
			}
		}
		System.out.println("\nIzmedju 101. godine i 2100. godine ima ukupno "+count+" prestupnih godina.");
	}

}
