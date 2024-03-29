package chapter07.exercises.ex7_22_Knights_Tour;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class KnightsTourHeuristic {
		static int currentRow = 0;
		static int currentColumn = 0;
		static int numberOfMovements = 0;
		static SecureRandom random = new SecureRandom();
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
				Scanner input = new Scanner(System.in);

				initializeBoard();

				System.out.print("Select initial row for your knight (0-7): ");
				currentRow = input.nextInt();
				System.out.print("Select initial column for your knight (0-7): ");
				currentColumn = input.nextInt();

				board[currentRow][currentColumn] = 'K';
				displayBoard();

				while (numberOfMovements < 63) {
						int moveNumber = obtainBestMove();

						if (moveNumber == -1) {
								break;
						}

						moveKnight(moveNumber);
						displayBoard();
				}

				System.out.printf("%nProgram run %d times%n.", numberOfMovements);
		}

		private static void initializeBoard() {
				for (int i = 0; i < 8; i++) {
						Arrays.fill(board[i], '0');
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

						if (movementScore == minimumScore) {
								int faceValue = random.nextInt(2);

								if (faceValue == 1) {
										bestMove = i;
								}
						}

						if (movementScore < minimumScore) {
								minimumScore = movementScore;
								bestMove = i;
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

		private static void moveKnight(int movement) {
				int newRowPosition = currentRow + vertical[movement];
				int newColumnPosition = currentColumn + horizontal[movement];

				board[currentRow][currentColumn] = '*';
				board[newRowPosition][newColumnPosition] = 'K';
				currentRow = newRowPosition;
				currentColumn = newColumnPosition;
				numberOfMovements++;
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
