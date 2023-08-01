package chapter02.exercises.ex2_25_Divisible_By_3;

import java.util.Scanner;

public class DivisibleBy3 {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int number;

				System.out.println("Enter an integer and I will tell you if" +
												" is divisible by 3");
				System.out.print("Your integer: ");
				number = input.nextInt();

				if (number % 3 == 0) {
						System.out.println("Your integer is divisible by 3.");
				}

				if (number % 3 != 0) {
						System.out.println("Your integer is not divisible by 3.");
				}
		}
}
