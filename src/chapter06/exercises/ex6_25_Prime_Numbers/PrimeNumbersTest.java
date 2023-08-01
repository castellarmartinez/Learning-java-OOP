package chapter06.exercises.ex6_25_Prime_Numbers;

public class PrimeNumbersTest {
		public static void main(String[] args) {
				System.out.println("Prime numbers: ");

				for (int i = 1; i <= 10000; i++) {
						if (PrimeNumbers.isPrime(i)) {
								System.out.println(i);
								;
						}
				}
		}
}
