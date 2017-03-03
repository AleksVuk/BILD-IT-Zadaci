package zadaci_03_03_2017;


public class DisplayingPrimeNumbers {

	public static void main(String[] args) {
		
		//creating new stack of integers object
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i = 120; i >= 2; i--){
			if (MyInteger.isPrime(i)){	//invoking method isPrime(int) from MyInteger class
				stack.push(i);
			}
		}
		
		System.out.println("All prime numbers from 0 to 120: ");
		while (!stack.empty()){
			System.out.print(stack.pop() + " "); 
		}
		
	}

}
