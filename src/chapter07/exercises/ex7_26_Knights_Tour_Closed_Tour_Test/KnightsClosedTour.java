package chapter07.exercises.ex7_26_Knights_Tour_Closed_Tour_Test;

import java.security.SecureRandom;
import java.util.Arrays;

public class KnightsClosedTour {
		private static final SecureRandom random = new SecureRandom();
		static int currentRow;
		static int currentColumn;
		static int numberOfMovements;
		static boolean fullTour = false;
		static int initialRow;
		static int initialColumn;
		static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
		static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
		static final char[][] board = new char[8][8];
		static final int[][] accessibility = {
										{2, 3, 4, 4, 4, 4, 3, 2},
										{3, 4, 6, 6, 6, 6, 4, 3},
										{4, 6, 8, 8, 8, 8, 6, 4},
										{4, 6, 8, 8, 8, 8, 6, 4},
										{4, 6, 8, 8, 8, 8, 6, 4},
										{4, 6, 8, 8, 8, 8, 6, 4},
										{3, 4, 6, 6, 6, 6, 4, 3},
										{2, 3, 4, 4, 4, 4, 3, 2},
		};

		public static void main(String[] args) {
				do {
						initializeBoard();

						initialRow = random.nextInt(8);
						initialColumn = random.nextInt(8);
						numberOfMovements = 0;
						fullTour = false;

						board[initialRow][initialColumn] = 'K';

						runTour(initialRow, initialColumn);
				} while (!isClosedTour());

				System.out.printf("Initial Row: %d%nInitial Column: %d%n",
												initialRow, initialColumn);
				System.out.printf("Final Row: %d%nFinal Column: %d%n",
												currentRow, currentColumn);
				System.out.printf("You got a closed tour!%n%n");

				displayBoard();
		}

		private static void initializeBoard() {
				for (int i = 0; i < 8; i++) {
						Arrays.fill(board[i], '0');
				}
		}

		private static void runTour(int initialRow, int initialCol) {
				currentRow = initialRow;
				currentColumn = initialCol;
				numberOfMovements = 0;

				while (numberOfMovements < 63) {
						int moveNumber = obtainBestMove();

						if (moveNumber == -1) {
								break;
						}

						moveKnight(moveNumber);
				}

				if (numberOfMovements == 63) {
						fullTour = true;
				}
		}

		private static int obtainBestMove() {
				int minimumScore = Integer.MAX_VALUE;
				int bestMove = -1;

				for (int i = 0; i < 8; i++) {
						int newRowPosition = currentRow + vertical[i];
						int newColumnPosition = currentColumn + horizontal[i];

						if (isOutsideBoard(newRowPosition, newColumnPosition) ||
														isPositionTaken(newRowPosition, newColumnPosition)) {
								continue;
						}

						int movementScore = accessibility[newRowPosition][newColumnPosition];

						if (movementScore < minimumScore) {
								minimumScore = movementScore;
								bestMove = i;
						} else if (movementScore == minimumScore) {
								bestMove = obtainBestSecondMove(bestMove, i);
						}
				}

				return bestMove;
		}

		private static boolean isOutsideBoard(int rowPosition, int columnPosition) {
				if (rowPosition < 0 || rowPosition > 7) {
						return true;
				}

				if (columnPosition < 0 || columnPosition > 7) {
						return true;
				}

				return false;
		}

		private static boolean isPositionTaken(int rowPosition, int columnPosition) {
				return (board[rowPosition][columnPosition] != '0');
		}

		private static int obtainBestSecondMove(int firstMove, int secondMove) {
				int currentRow1 = currentRow + vertical[firstMove];
				int currentColumn1 = currentColumn + horizontal[firstMove];
				int minimumScore1 = obtainMoveScore(currentRow1, currentColumn1);

				int currentRow2 = currentRow + vertical[secondMove];
				int currentColumn2 = currentColumn + horizontal[secondMove];
				int minimumScore2 = obtainMoveScore(currentRow2, currentColumn2);

				int[] moves = {firstMove, secondMove};

				if (minimumScore1 < minimumScore2) {
						return moves[0];
				}

				if (minimumScore2 < minimumScore1) {
						return moves[1];
				}

				return moves[random.nextInt(2)];
		}

		private static int obtainMoveScore(int currentRow, int currentColumn) {
				int minimumScore = 9;

				for (int i = 0; i < 8; i++) {
						int newRowPosition = currentRow + vertical[i];
						int newColumnPosition = currentColumn + horizontal[i];

						if (isOutsideBoard(newRowPosition, newColumnPosition) ||
														isPositionTaken(newRowPosition, newColumnPosition)) {
								continue;
						}

						int movementScore = accessibility[newRowPosition][newColumnPosition];

						if (movementScore < minimumScore) {
								minimumScore = movementScore;
						}
				}

				return minimumScore;
		}

		private static void moveKnight(int movement) {
				int newRowPosition = currentRow + vertical[movement];
				int newColumnPosition = currentColumn + horizontal[movement];

				board[currentRow][currentColumn] = '*';
				board[newRowPosition][newColumnPosition] = 'K';
				currentRow = newRowPosition;
				currentColumn = newColumnPosition;
				numberOfMovements++;
		}

		private static boolean isClosedTour() {
				int rowDistance = Math.abs(currentRow - initialRow);
				int columnDistance = Math.abs(currentColumn - initialColumn);
				boolean isOneMoveAwayFromStart = rowDistance <= 1 && columnDistance <= 1;

				return fullTour && isOneMoveAwayFromStart;
		}

		private static void displayBoard() {
				System.out.print(" ");

				for (int i = 0; i < 8; i++) {
						System.out.printf("%4d", i);
				}

				System.out.print("\n  ");

				for (int k = 0; k < 33; k++) {
						System.out.print("-");
				}

				for (int i = 0; i < 8; i++) {
						System.out.printf("%n%d |", i);

						for (int j = 0; j < 8; j++) {
								System.out.printf("%2c |", board[i][j]);
						}

						System.out.print("\n  ");

						for (int k = 0; k < 33; k++) {
								System.out.print("-");
						}
				}

				System.out.printf("%n%n");
		}
}
