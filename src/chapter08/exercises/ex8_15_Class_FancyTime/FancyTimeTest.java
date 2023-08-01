package chapter08.exercises.ex8_15_Class_FancyTime;

public class FancyTimeTest {
		public static void main(String[] args) {
				FancyTime firstTime = new FancyTime(5, 15, 30, "a.m.");
				FancyTime secondTime = new FancyTime(11, 40, 1);
				FancyTime thirdTime = new FancyTime(21, 30);

				System.out.println("First time:");
				firstTime.displayTime(1);
				System.out.println("Second time:");
				secondTime.displayTime(2);
				System.out.println("Third time:");
				thirdTime.displayTime(3);
		}
}
