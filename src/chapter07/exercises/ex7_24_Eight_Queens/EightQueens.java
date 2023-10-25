package chapter07.exercises.ex7_24_Eight_Queens;


import java.security.SecureRandom;
import java.util.Arrays;

public class EightQueens {
		static int queensOnBoard = 0;
		static final char[][] board = new char[8][8];
		static final int[][] eliminationNumbers = {
										{22, 22, 22, 22, 22, 22, 22, 22,},
										{22, 24, 24, 24, 24, 24, 24, 22,},
										{22, 24, 26, 26, 26, 26, 24, 22,},
										{22, 24, 26, 28, 28, 26, 24, 22,},
										{22, 24, 26, 28, 28, 26, 24, 22,},
										{22, 24, 26, 26, 26, 26, 24, 22,},
										{22, 24, 24, 24, 24, 24, 24, 22,},
										{22, 22, 22, 22, 22, 22, 22, 22,},};

		public static void main(String[] args) {
				SecureRandom random = new SecureRandom();

				int initialRow = random.nextInt(8);
				int initialColumn = random.nextInt(8);

				initializeBoard();
				placeQueen(initialRow, initialColumn);
				queensOnBoard++;

				while (queensOnBoard < 8) {
						int[] bestPosition = findBestPosition();
						int bestRow = bestPosition[0];
						int bestColumn = bestPosition[1];

						if (bestRow == 8) {
								break;
						}

						placeQueen(bestRow, bestColumn);
						queensOnBoard++;
				}

				displayBoard();

				System.out.println("Total number of queens on board: " +
												queensOnBoard);
		}

		private static void initializeBoard() {
				for (int i = 0; i < 8; i++) {
						Arrays.fill(board[i], '·');
				}
		}

		private static void placeQueen(int row, int column) {
				board[row][column] = 'Q';
		}

		private static int[] findBestPosition() {
				SecureRandom random = new SecureRandom();

				int row = random.nextInt(8);
				int column = random.nextInt(8);
				int bestRow = 8;
				int bestColumn = 8;
				int smallestEliminationNumber = Integer.MAX_VALUE; // Flag value => Maximum elimination number is 28

				for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 8; j++) {
								if (smallestEliminationNumber > eliminationNumbers[row][column]
																&& isPositionValid(row, column)) {

										smallestEliminationNumber = eliminationNumbers[row][column];
										bestRow = row;
										bestColumn = column;
								}

								column++; // Try next column

								if (column == 8) {
										column = 0; // All 8 columns are traversed, if initial column is 7, jump to 0
								}
						}

						row++; // Try next row

						if (row == 8) {
								row = 0; // All 8 rows are traversed, if initial row is 7, jump to 0
						}
				}

				return new int[]{bestRow, bestColumn};
		}

		private static boolean isPositionValid(int bestRow, int bestColumn) {
				if (areQueensOnTheSameRow(bestRow, bestColumn)) {
						return false;
				}

				if (areQueensOnTheSameColumn(bestRow, bestColumn)) {
						return false;
				}

				if (areQueensOnTheSameForwardDiagonal(bestRow, bestColumn)) {
						return false;
				}

				if (areQueensOnTheSameReverseDiagonal(bestRow, bestColumn)) {
						return false;
				}

				return true;
		}

		private static boolean areQueensOnTheSameColumn(int row, int column) {

				for (int i = 0; i < 8; i++) {

						if (board[row][column] == 'Q') {
								return true;
						}

						row++;

						if (row == 8) {
								row = 0;
						}
				}

				return false;
		}

		private static boolean areQueensOnTheSameRow(int row, int column) {

				for (int i = 0; i < 8; i++) {

						if (board[row][column] == 'Q') {
								return true;
						}

						column++;

						if (column == 8) {
								column = 0;
						}
				}

				return false;
		}

		private static boolean areQueensOnTheSameForwardDiagonal(int row, int column) {

				for (int i = 0; i < 8; i++) {

						if (board[row][column] == 'Q') {
								return true;
						}

						row--;
						column++;

						if (row < 0) {
								row = --column;
								column = 0;
						}

						if (column > 7) {
								column = ++row;
								row = 7;
						}
				}

				return false;
		}

		private static boolean areQueensOnTheSameReverseDiagonal(int row, int column) {

				for (int i = 0; i < 8; i++) {

						if (board[row][column] == 'Q') {
								return true;
						}

						row++;
						column++;

						if (row > 7) {
								row = 7 - (--column);
								column = 0;
						}

						if (column > 7) {
								column = 7 - (--row);
								row = 0;
						}
				}

				return false;
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
