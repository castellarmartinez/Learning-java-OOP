package chapter04.exercises.ex4_39_Enforcing_Privacy_with_Cryptography;

import java.util.Scanner;

public class DecryptNumber {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("Enter a four-digit number: ");
				int number = input.nextInt();


				while (number / 10000 != 0 || number / 1000 == 0) {
						System.out.print("You must enter a four-digit number: ");
						number = input.nextInt();
				}

				int swapDigits = 0;
				int counter = 100;

				while (number > 0) {
						swapDigits += number % 10 * counter;
						number /= 10;
						counter *= 10;

						if (counter == 10000) {
								counter = 1;
						}
				}

				int subtractSeven = 0;
				counter = 1;

				while (swapDigits > 0) {
						int digit = (swapDigits % 10 + 3);
						subtractSeven += digit % 10 * counter;
						swapDigits /= 10;
						counter *= 10;
				}

				System.out.printf("The decrypted number is: %04d", subtractSeven);
		}
}
