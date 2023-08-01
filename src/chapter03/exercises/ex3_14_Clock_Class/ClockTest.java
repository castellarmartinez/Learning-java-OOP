package chapter03.exercises.ex3_14_Clock_Class;

public class ClockTest {
		public static void main(String[] args) {
				Clock clock = new Clock(18, 15, 30);

				clock.displayTime();

				System.out.printf("\nSetting the hour in the clock to %d%n", 15);
				clock.setHour(15);

				System.out.println("The new time is: ");
				clock.displayTime();

				System.out.printf("\nTrying to set the minutes to %d%n", 65);
				clock.setMinute(65);

				System.out.println("The new time is: ");
				clock.displayTime();

				System.out.printf("\nSetting the seconds in the clock to %d%n", 45);
				clock.setSecond(45);

				System.out.println("The new time is: ");
				clock.displayTime();
		}
}
