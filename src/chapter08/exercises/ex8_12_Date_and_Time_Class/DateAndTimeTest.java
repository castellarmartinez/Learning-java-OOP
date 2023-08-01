package chapter08.exercises.ex8_12_Date_and_Time_Class;

public class DateAndTimeTest {
		public static void main(String[] args) {
				DateAndTime date = new DateAndTime(12, 31, 2021, 23, 58, 45);

				System.out.printf("The date is %s%n", date.toString());
				System.out.printf("The date in universal time is %s%n%n", date.toUniversalString());

				for (int i = 1; i <= 100; i++) {
						System.out.println("Incrementing a second");
						date.tick();

						System.out.printf("The date is %s%n", date.toString());
						System.out.printf("The date in universal time is %s%n%n", date.toUniversalString());
				}
		}
}
