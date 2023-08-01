package chapter07.exercises.ex7_27_Sieve_Of_Eratosthenes;

public class SieveOfEratosthenes {
		public static void main(String[] args) {
				boolean[] primeNumbers = new boolean[1000];

				for (int i = 0; i < 1000; i++) {
						primeNumbers[i] = true;
				}

				findPrimesInArray(primeNumbers);

				displayPrimeNumbers(primeNumbers);
		}

		private static void findPrimesInArray(boolean[] primeNumbers) {
				for (int i = 2; i < 1000; i++) {
						findPrime(i, primeNumbers);

						if (primeNumbers[i]) {
								setMultiplesAsNotPrimes(i, primeNumbers);
						}
				}
		}

		private static void findPrime(int i, boolean[] primeNumbers) {
				if (!primeNumbers[i]) {
						return;
				}

				for (int j = 2; j < i / 2; j++) {
						if (j != i && i % j == 0) { // Si es divisible por un número
								primeNumbers[i] = false; // a sí mismo
								break;
						}
				}
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
