import java.time.LocalTime;

public class Time {
	public static void main (String[] args){
		double hour = 19;
		double minute = 4;
		double second = 30;
		double totalSeconds = hour*60*60 + minute*60 + second;
		double remainingSeconds = (24*60*60) - totalSeconds;
		double percentageDay = totalSeconds/(24*60*60)*100;
		LocalTime time = LocalTime.now(); 
		int totalElapsed = (int) (time.toSecondOfDay() - totalSeconds);
		int elapsedSeconds = totalElapsed % 60;
		int elpasedHours = totalElapsed / 60;
		int elpasedMinutes = elpasedHours % 60;
		elpasedHours = elpasedHours / 60;
		
		System.out.printf("Number of seconds since midnight: %.0f\n", totalSeconds);
		System.out.printf("Number of seconds remaining in the day: %.0f\n", remainingSeconds);
		System.out.printf("Percentage of the day that has passed: %.2f%%\n", percentageDay);
		System.out.printf("Current Time: %.0f:0%.0f:%.0fPM\n", hour%12, minute, second );
		System.out.println("Total Elapsed Time in Seconds: " + totalElapsed );
		System.out.println( "Elapsed Time: " + elpasedHours + ":" + elpasedMinutes + ":" + elapsedSeconds);	
	}
}
