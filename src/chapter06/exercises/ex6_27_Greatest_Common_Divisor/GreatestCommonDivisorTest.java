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

				System.out.printf("The greatest common divisor is: %d",
												GreatestCommonDivisor.gcd(firstNumber, secondNumber));
		}
}
