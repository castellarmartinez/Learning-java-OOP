package chapter07.exercises.ex7_18_Game_Of_Craps;

import java.security.SecureRandom;

public class GameOfCraps {
		private static final SecureRandom randomNumbers = new SecureRandom();

		private enum Status {CONTINUE, WON, LOST}

		private static final int SNAKE_EYES = 2;
		private static final int TREY = 3;
		private static final int SEVEN = 7;
		private static final int YO_LEVEN = 11;
		private static final int BOX_CARS = 12;

		public static void main(String[] args) {
				int numberOfGames = 1_000_000;
				int[] rollsToWin = new int[22];
				int[] rollsToLose = new int[22];
				double totalRolls = 0;

				for (int i = 0; i < numberOfGames; i++) {
						int myPoint = 0;
						Status gameStatus;
						int rolls = 1;

						int sumOfDice = rollDice();

						switch (sumOfDice) {
								case SEVEN:
								case YO_LEVEN:
										gameStatus = Status.WON;
										rollsToWin[rolls]++;
										break;
								case SNAKE_EYES:
								case TREY:
								case BOX_CARS:
										gameStatus = Status.LOST;
										rollsToLose[rolls]++;
										break;
								default:
										gameStatus = Status.CONTINUE;
										myPoint = sumOfDice;
										break;
						}

						while (gameStatus == Status.CONTINUE) {
								sumOfDice = rollDice();
								rolls++;

								if (sumOfDice == myPoint) {
										gameStatus = Status.WON;
								} else {
										if (sumOfDice == SEVEN) {
												gameStatus = Status.LOST;
										}
								}
						}

						if (gameStatus == Status.WON && rolls <= 20) {
								rollsToWin[rolls]++;
						} else if (gameStatus == Status.WON) {
								rollsToWin[21]++;
						} else if (gameStatus == Status.LOST && rolls <= 20) {
								rollsToLose[rolls]++;
						} else {
								rollsToLose[21]++;
						}

						totalRolls += rolls;
				}

				System.out.printf("%5s%10s%10s%n", "Rolls", "Wins", "Loses");

				double totalWins = 0;

				for (int i = 1; i < rollsToWin.length - 1; i++) {
						System.out.printf("%5d%10d%10d%n", i, rollsToWin[i], rollsToLose[i]);
						totalWins += rollsToWin[i];
				}

				totalWins += rollsToWin[21];

				System.out.printf("%5s%10d%10d%n%n", "+20", rollsToWin[21], rollsToLose[21]);
				System.out.printf("The chances of winning at craps is %.1f%s%n",
												(totalWins * 100 / numberOfGames), "%");
				System.out.printf("The average length of a game of crap is %.1f%n",
												(totalRolls / numberOfGames));
		}

		public static int rollDice() {
				int die1 = 1 + randomNumbers.nextInt(6);
				int die2 = 1 + randomNumbers.nextInt(6);

				return die1 + die2;
		}
}
