package zadaci_28_02_2017;

public class StopWatch {
	
	private long startTime;
	private long endTime;
	
	StopWatch () {
		startTime = System.currentTimeMillis();
	}
	
	public void start(){
		startTime = System.currentTimeMillis();
	}
	
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime(){
		return endTime - startTime;
	}
	
	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}
	
	public static void main(String[] args) {
		int [] array = new int [100000];
		for (int i = 0; i < 100000; i++){
			array[i] = (int)(Math.random() * 1000);
		}
		//new stop watch object
		StopWatch s = new StopWatch();
		
		//start stop watch
		s.start();
		
		//sort array
		java.util.Arrays.sort(array);
		
		//stop stop watch
		s.stop();
		
		long elapsedTime = s.getElapsedTime();
		
		System.out.println("The elapsed time for sorting 100000 numbers is: " + elapsedTime + " milliseconds.");
	}
}
