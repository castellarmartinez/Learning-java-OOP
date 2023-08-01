package chapter06.exercises.ex6_26_Calculating_The_Sum_Of_Digits;

public class SumOfDigits {
		public static int sum(int number) {
				int i = 0;
				int sum = 0;

				while (number / Math.pow(10, i) > 0) {
						sum += (int) (number % Math.pow(10, i + 1)) /
														(int) Math.pow(10, i);
						i++;
				}

				return sum;
		}
}
