import java.util.Scanner;

public class ModulusClock
{
	public static void main(String[] args)
	{

		final int hour = 1, hours = 12, minutes = 60;
		int futureHour = 0, futureMinute = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Right now it is 1:00.");
		System.out.print("Enter the hours later: ");
		futureHour = input.nextInt();
		System.out.print("Enter the minutes later: ");
		futureMinute = input.nextInt();

		final int futureMinuteTime = futureMinute % minutes;
		final int additionalHours = futureMinute / minutes;
		final int futureHourTime = (futureHour % hours) + hour + additionalHours;
		final String extraZero = Integer.toString(futureMinuteTime);
		if (extraZero.length() == 1){
			System.out.println("The future time is " + futureHourTime + ":0" + futureMinuteTime);
			}
		else {
			System.out.println("The future time is " + futureHourTime + ":" + futureMinuteTime);
      }
	}
}