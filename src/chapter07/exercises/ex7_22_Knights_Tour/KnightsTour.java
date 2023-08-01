package chapter07.exercises.ex7_22_Knights_Tour;

import java.util.Scanner;

public class KnightsTour {
		static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
		static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
		static final char[][] board = new char[8][8];
		static int currentRow = 0;
		static int currentColumn = 0;
		static int numberOfMovements = 0;

		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				initializeBoard();
				displayBoard();

				while (numberOfMovements < 63) {
						System.out.print("Select move number (0-7): ");
						int moveNumber = input.nextInt();

						moveKnight(moveNumber);
						displayBoard();
				}
		}

		private static void moveKnight(int moveNumber) {
				int newRowPosition = currentRow + vertical[moveNumber];
				int newColumnPosition = currentColumn + horizontal[moveNumber];

				if (!isInsideBoard(newRowPosition, newColumnPosition)) {
						showErrorMessage("Invalid position: outside board.");
						return;
				}

				if (isPositionTaken(newRowPosition, newColumnPosition)) {
						showErrorMessage("Invalid position: position is taken.");
						return;
				}

				markPosition(newRowPosition, newColumnPosition);

				currentRow = newRowPosition;
				currentColumn = newColumnPosition;
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

		private static void markPosition(int newRowPosition, int newColumnPosition) {
				board[currentRow][currentColumn] = '*';
				board[newRowPosition][newColumnPosition] = 'K';
				numberOfMovements++;
		}

		private static void showErrorMessage(String message) {
				System.out.printf("Error: %s%n", message);
		}

		static private void displayBoard() {
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
