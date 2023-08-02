package chapter04.exercises.ex4_32_Printing_the_Decimal_Equivalent_of_a_Binary_Number;

import java.util.Scanner;

public class BinaryToDecimal {
		public static void main(String[] args) {
				int binary = readBinary();
				int decimal = getDecimal(binary);

				System.out.printf("The binary number %d is equivalent to the decimal " +
												"number %d", binary, decimal);
		}

		private static int readBinary() {
				Scanner input = new Scanner(System.in);

				System.out.print("Enter a binary number: ");
				int binary = input.nextInt();
				int counter = binary;

				while (counter > 0) {
						int digit = counter % 10;
						counter /= 10;

						if (digit > 1) {
								System.out.print("Enter a valid binary number: ");
								binary = input.nextInt();
								counter = binary;
						}
				}

				return binary;
		}

		private static int getDecimal(int binary) {
				int powerOfTwo = 1;
				int decimal = 0;

				while (binary > 0) {
						int digit = binary % 10;
						decimal += digit * powerOfTwo;
						binary /= 10;
						powerOfTwo *= 2;
				}

				return decimal;
		}
}
