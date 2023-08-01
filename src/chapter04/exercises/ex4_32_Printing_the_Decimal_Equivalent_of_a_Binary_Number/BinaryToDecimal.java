package chapter04.exercises.ex4_32_Printing_the_Decimal_Equivalent_of_a_Binary_Number;

import java.util.Scanner;

public class BinaryToDecimal {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.print("Enter a binary number: ");
				int binary = input.nextInt();
				int testing = binary;
				int decimal = 0;
				int twoPow = 1;

				while (testing > 0) {
						int digit = testing % 10;
						decimal += digit * twoPow;

						if (digit != 0 && digit != 1) {
								System.out.print("Enter a valid binary number: ");
								binary = input.nextInt();
								testing = binary;
								decimal = 0;
								twoPow = 1;
						} else {
								testing /= 10;
								twoPow *= 2;
						}
				}

				System.out.printf("The binary number %d is equivalent to the decimal " +
												"number %d", binary, decimal);
		}
}
