package ch2_pckg;

public class ShowCurrentTime {

	public static void main(String[] args) {
		
		// total time elapsed since starting point using milliseconds
		long totalMilliseconds = System.currentTimeMillis();
		
		// convert milliseconds to seconds
		long totalSeconds = totalMilliseconds / 1000; 
		
		// get current second
		long currentSecond = totalSeconds % 60;
		
		// convert seconds to minutes
		long totalMinutes = totalSeconds / 60;
				
		// get the current minute
		long currentMinute = totalMinutes % 60;
		
		// and minutes to hours
		long totalHours = totalMinutes / 60;
		
		// compute current hour
		long currentHour = totalHours % 24;
		
		
		System.out.println("Current time is " + currentHour + " hours " + currentMinute + " minutes " + currentSecond + " seconds");
		
	}
}
