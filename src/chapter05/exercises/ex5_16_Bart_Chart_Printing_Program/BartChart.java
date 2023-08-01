package chapter05.exercises.ex5_16_Bart_Chart_Printing_Program;

import java.util.Scanner;

public class BartChart {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("Enter the number 1: ");
				int number1 = input.nextInt();

				while (number1 < 1 || number1 > 30) {
						System.out.print("The number must be in the range (1-30): ");
						number1 = input.nextInt();
				}

				System.out.print("Enter the number 2: ");
				int number2 = input.nextInt();

				while (number2 < 1 || number2 > 30) {
						System.out.print("The number must be in the range (1-30): ");
						number2 = input.nextInt();
				}

				System.out.print("Enter the number 3: ");
				int number3 = input.nextInt();

				while (number3 < 1 || number3 > 30) {
						System.out.print("The number must be in the range (1-30): ");
						number2 = input.nextInt();
				}

				System.out.print("Enter the number 4: ");
				int number4 = input.nextInt();

				while (number4 < 1 || number4 > 30) {
						System.out.print("The number must be in the range (1-30): ");
						number4 = input.nextInt();
				}

				System.out.print("Enter the number 5: ");
				int number5 = input.nextInt();

				while (number5 < 1 || number5 > 30) {
						System.out.print("The number must be in the range (1-30): ");
						number5 = input.nextInt();
				}

				for (int i = 0; i < number1; i++) {
						System.out.print('*');
				}

				System.out.println();

				for (int i = 0; i < number2; i++) {
						System.out.print('*');
				}

				System.out.println();

				for (int i = 0; i < number3; i++) {
						System.out.print('*');
				}

				System.out.println();

				for (int i = 0; i < number4; i++) {
						System.out.print('*');
				}

				System.out.println();

				for (int i = 0; i < number5; i++) {
						System.out.print('*');
				}

				System.out.println();
		}
}
