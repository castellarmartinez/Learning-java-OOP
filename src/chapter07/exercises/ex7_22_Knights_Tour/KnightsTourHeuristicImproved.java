package chapter07.exercises.ex7_22_Knights_Tour;

import java.util.Random;
import java.util.Scanner;

public class KnightsTourHeuristicImproved {
		static int currentRow = 0;
		static int currentColumn = 0;
		static int numberOfMovements = 0;
		static int fullTour = 0;
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

				for (int i = 0; i < 64; i++) {
						runTour(i);
				}

				System.out.printf("%nYou got %d full tours.%n", fullTour);
		}

		private static void runTour(int tourNumber) {
				initializeBoard();

				currentRow = tourNumber % 8;
				currentColumn = tourNumber % 8;
				numberOfMovements = 0;

				while (numberOfMovements < 63) {
						int moveNumber = obtainBestMove();

						if (moveNumber == 8) {
								break;
						}

						moveKnight(moveNumber);
				}

				if (numberOfMovements == 63) {
						fullTour++;
				}
		}

		private static int obtainBestMove() {
				int minimumScore = 9;
				int bestMove = 8;

				for (int i = 0; i < 8; i++) {
						int newRowPosition = currentRow + vertical[i];
						int newColumnPosition = currentColumn + horizontal[i];

						if (!isInsideBoard(newRowPosition, newColumnPosition) ||
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

		static private void initializeBoard() {
				for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 8; j++) {
								board[i][j] = '0';
						}
				}
		}

		private static boolean isInsideBoard(int rowPosition, int columnPosition) {
				if (rowPosition < 0 || rowPosition > 7) {
						return false;
				}

				if (columnPosition < 0 || columnPosition > 7) {
						return false;
				}

				return true;
		}

		private static boolean isPositionTaken(int rowPosition, int columnPosition) {
				return (board[rowPosition][columnPosition] != '0');
		}

		private static int obtainBestSecondMove(int firstMove, int secondMove) {
				Random randomObject = new Random();

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

				return moves[randomObject.nextInt(2)];
		}

		private static int obtainMoveScore(int currentRow, int currentColumn) {
				int minimumScore = 9;

				for (int i = 0; i < 8; i++) {
						int newRowPosition = currentRow + vertical[i];
						int newColumnPosition = currentColumn + horizontal[i];

						if (!isInsideBoard(newRowPosition, newColumnPosition) ||
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
}
