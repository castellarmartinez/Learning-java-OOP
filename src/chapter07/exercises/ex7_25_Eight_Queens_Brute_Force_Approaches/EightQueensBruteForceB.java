package chapter07.exercises.ex7_25_Eight_Queens_Brute_Force_Approaches;


import java.security.SecureRandom;
import java.util.Arrays;

public class EightQueensBruteForceB {
		static int queensOnBoard = 0;
		static final char[][] board = new char[8][8];

		public static void main(String[] args) {
				SecureRandom random = new SecureRandom();
				int initialRow = random.nextInt(8);
				int initialColumn = random.nextInt(8);

				initializeBoard();
				placeQueen(initialRow, initialColumn);
				queensOnBoard++;

				tryAllPositions(initialRow, initialColumn);
				displayBoard();

				System.out.println("Total number of queens on board: " + queensOnBoard);
		}

		private static void initializeBoard() {
				for (int i = 0; i < 8; i++) {
						Arrays.fill(board[i], '·');
				}
		}

		private static void placeQueen(int row, int column) {
				board[row][column] = 'Q';
		}

		private static void tryAllPositions(int initialRow, int initialColumn) {
				int newRow = initialRow;
				int newColumn = initialColumn;

				for (int i = 0; i < 8; i++) {
						if (!canPlaceAQueen()) {
								break;
						}

						newRow++;

						if (newRow == 8) {
								newRow = 0;
						}

						for (int j = 0; j < 8; j++) {
								newColumn++;

								if (newColumn == 8) {
										newColumn = 0;
								}

								if (isValidPosition(newRow, newColumn)) {
										placeQueen(newRow, newColumn);
										queensOnBoard++;
								}
						}
				}
		}

//   static private int [] tryP

		private static boolean canPlaceAQueen() {
				for (int row = 0; row < 8; row++) {
						for (int column = 0; column < 8; column++) {
								if (isValidPosition(row, column)) {
										return true;
								}
						}
				}

				return false;
		}

		private static boolean isValidPosition(int bestRow, int bestColumn) {
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
