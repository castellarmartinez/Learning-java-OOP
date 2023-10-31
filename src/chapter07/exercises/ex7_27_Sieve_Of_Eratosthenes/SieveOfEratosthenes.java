package chapter07.exercises.ex7_27_Sieve_Of_Eratosthenes;

import java.util.Arrays;

public class SieveOfEratosthenes {
		public static void main(String[] args) {
				boolean[] primeNumbers = new boolean[1000];

				Arrays.fill(primeNumbers, true);
				findPrimesInArray(primeNumbers);
				displayPrimeNumbers(primeNumbers);
		}

		private static void findPrimesInArray(boolean[] primeNumbers) {
				for (int i = 2; i < primeNumbers.length; i++) {
						primeNumbers[i] = isPrime(i, primeNumbers);

						if (primeNumbers[i]) {
								setMultiplesAsNotPrimes(i, primeNumbers);
						}
				}
		}

		private static boolean isPrime(int i, boolean[] primeNumbers) {
				if (!primeNumbers[i]) {
						return false;
				}

				for (int j = 2; i < i / 2; i++) {
						if (i % j == 0) { // Si es divisible por otro numero
								return false;
						}
				}

				return true;
		}

		private static void setMultiplesAsNotPrimes(int i, boolean[] primeNumbers) {
				for (int j = 2 * i; j < 1000; j += i) {
						primeNumbers[j] = false;
				}
		}

		private static void displayPrimeNumbers(boolean[] primeNumbers) {
				System.out.println("Prime numbers are: ");

				for (int i = 2; i < 1000; i++) {
						if (primeNumbers[i]) {
								System.out.println(i);
						}
				}
		}
}
