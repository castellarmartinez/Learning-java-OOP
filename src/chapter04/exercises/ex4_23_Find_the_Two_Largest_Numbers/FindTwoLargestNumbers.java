package chapter04.exercises.ex4_23_Find_the_Two_Largest_Numbers;

import java.util.Scanner;

public class FindTwoLargestNumbers {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int counter = 1;
				int largest = 0;
				int secondLargest = 0;

				while (counter <= 10) {
						System.out.print("Enter the items sold by this salesperson: ");
						int number = input.nextInt();

						if (number > largest) {
								secondLargest = largest;
								largest = number;
						}

						if (number < largest && number > secondLargest) {
								secondLargest = number;
						}

						counter++;
				}

				System.out.println("The salesperson who sold the most items, sold " +
												largest);
				System.out.println("The salesperson who sold the second most quantity, "
												+ "sold " + secondLargest);
		}
}
