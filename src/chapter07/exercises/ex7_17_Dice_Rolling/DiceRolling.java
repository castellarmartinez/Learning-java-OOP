package chapter07.exercises.ex7_17_Dice_Rolling;

import java.util.Random;

public class DiceRolling {
		public static void main(String[] args) {
				Random random = new Random();
				int[] sumOfDice = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

				for (int i = 0; i < 36_000_000; i++) {
						int dieOne = random.nextInt(6) + 1;
						int dieTwo = random.nextInt(6) + 1;
						int sum = dieOne + dieTwo;
						sumOfDice[sum]++;
				}

				System.out.println("Frequency of sums: ");

				for (int i = 2; i < sumOfDice.length; i++) {
						System.out.printf("%2d: %d%n", i, sumOfDice[i]);
				}
		}
}
