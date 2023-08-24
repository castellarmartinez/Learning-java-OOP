package chapter06.exercises.ex6_20_Test_For_Leap_Year;

import java.util.Scanner;

public class LeapYear {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int year;

				System.out.print("Enter a year and I'll tell you if it's a leap year: ");
				year = input.nextInt();

				System.out.printf("The year entered %s a leap year.", (isLeapYear(year) ? "is" : "is not"));
		}
		public static boolean isLeapYear(int year) {
				return (isDivisibleBy4(year) && (!isDivisibleBy100(year) || isDivisibleBy400(year)));
		}

		private static boolean isDivisibleBy4(int year) {
				return year % 4 == 0;
		}

		private static boolean isDivisibleBy100(int year) {
				return year % 100 == 0;
		}

		private static boolean isDivisibleBy400(int year) {
				return year % 400 == 0;
		}
}
