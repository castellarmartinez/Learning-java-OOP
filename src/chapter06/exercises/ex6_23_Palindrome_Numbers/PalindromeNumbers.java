package chapter06.exercises.ex6_23_Palindrome_Numbers;

import java.util.Scanner;

public class PalindromeNumbers {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.println("Enter a five-digit number and I'll tell you if it's palindrome: ");
				int palindrome = input.nextInt();
				System.out.printf("The number entered %s a palindrome number.",
												(isPalindrome(palindrome) ? "is" : "is not"));
		}

		public static boolean isPalindrome(int number) {
				boolean isAPalindromeNumber = true;
				int digits = getNumberOfDigits(number);

				for (int i = 0; i < digits / 2; i++) {

						int left = (int) (number % Math.pow(10, digits - i)) /
														(int) Math.pow(10, digits - i - 1);

						int right = (int) (number % Math.pow(10, i + 1)) /
														(int) Math.pow(10, i);

						if (left != right) {
								i = digits;
								isAPalindromeNumber = !isAPalindromeNumber;
						}
				}

				return isAPalindromeNumber;
		}

		private static int getNumberOfDigits(int number) {
				int i = 1;
				int numberOfDigits = 0;

				while (number / i > 0) {
						i *= 10;
						numberOfDigits++;
				}

				return numberOfDigits;
		}
}
