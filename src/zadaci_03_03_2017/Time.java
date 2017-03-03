package zadaci_03_03_2017;

public class Time {
	private long hour;
	private long minute;
	private long second;
	
	Time(){
		this(System.currentTimeMillis());
	}
	
	Time (long elapsedTime){
		long totalSeconds=elapsedTime/1000;
		second=totalSeconds%60;
		minute=((totalSeconds/60)%60);
		hour=1+(totalSeconds/3600)%24;
		
	}
	
	Time (long hour, long minute, long second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}
	
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

	public void setTime(long elapsedTime){
		long totalSeconds=elapsedTime/1000;
		second=totalSeconds%60;
		minute=((totalSeconds/60)%60);
		hour=1+(totalSeconds/3600)%24;
	}
	
}
