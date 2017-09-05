package Project_2;
/*
 * Jack Taylor 
 * Period 4
 * 8/23/17
 */
import java.util.Scanner;
public class HoursMinutesSeconds {
	public static void main(String[] args) {
		while(true)
		{
			Scanner console = new Scanner(System.in);
			int time;
			System.out.println("Time: ");
			time = console.nextInt();
			int hours = time/3600;
			int hoursremainder = time%3600;
			int minutes = hoursremainder/60;
			int seconds = hoursremainder%60;
			System.out.println("Your time is: " + hours + ":" + minutes + ":" + seconds);
			System.out.println("");
		}
	}
}