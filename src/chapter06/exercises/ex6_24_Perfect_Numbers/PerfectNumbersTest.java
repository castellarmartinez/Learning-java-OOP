package chapter06.exercises.ex6_24_Perfect_Numbers;

public class PerfectNumbersTest {
		public static void main(String[] args) {
				System.out.println("Perfect numbers: ");

				for (int i = 1; i <= 1000000000; i++) {
						if (isPerfect(i)) {
								factors(i);
						}
				}
		}

		public static boolean isPerfect(int number) {
				int sum = 0;

				for (int i = 1; i <= number / 2; i++) {
						if (number % i == 0) {
								sum += i;
						}
				}

				return (sum == number);
		}

		public static void factors(int number) {
				System.out.printf("%d: ", number);

				for (int i = 1; i <= number / 2; i++) {
						if (number % i == 0) {
								System.out.printf("%d ", i);
						}
				}

				System.out.println();
		}
}
