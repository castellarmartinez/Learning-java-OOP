package chapter06.exercises.ex6_27_Greatest_Common_Divisor;

import java.util.Scanner;

public class GreatestCommonDivisorTest {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int firstNumber;
				int secondNumber;

				System.out.print("Enter two numbers and I'll tell you the greatest " +
												"common divisor.\nFirst number: ");
				firstNumber = input.nextInt();
				System.out.print("Second number: ");
				secondNumber = input.nextInt();

				System.out.printf("The greatest common divisor is: %d", gcd(firstNumber, secondNumber));
		}

		public static int gcd(int number1, int number2) {
				int greatest = number1;
				int smallest = number2;

				if (number1 < number2) {
						greatest = number2;
						smallest = number1;
				}

				int remainder = greatest % smallest;

				while (remainder > 0) {
						greatest = smallest;
						smallest = remainder;
						remainder = greatest % smallest;
				}

				return smallest;
		}
}
