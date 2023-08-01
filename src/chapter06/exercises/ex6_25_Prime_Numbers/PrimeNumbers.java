package chapter06.exercises.ex6_25_Prime_Numbers;

public class PrimeNumbers {
		public static boolean isPrime(int number) {
				if (number == 1) {
						return false;
				}

				if (number == 2) {
						return true;
				}

				int count = number % 2;
				int squareRoot = (int) Math.sqrt(number);
				int i = 3;

				while (count > 0 && i <= squareRoot) {
						if (number % i == 0) {
								count--;
						}

						i++;
				}

				return (count > 0);
		}
}
