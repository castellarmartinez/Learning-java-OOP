package chapter07.exercises.ex7_22_Knights_Tour;

import java.util.Arrays;
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
						displayMoves();
						System.out.print("Select move number (0-7): ");
						int moveNumber = input.nextInt();

						if (moveNumber > 7 || moveNumber < 0) {
								continue;
						}

						moveKnight(moveNumber);
						displayBoard();
				}
		}

		private static void initializeBoard() {
				for (int i = 0; i < 8; i++) {
						Arrays.fill(board[i], '0');
				}

				// The Knight start at 0,0 position
				board[0][0] = 'K';
		}

		private static void displayBoard() {
				System.out.println("Current board:");
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

		private static void displayMoves() {
				System.out.println("Movement options:");
				System.out.println("""
          0   1   2   3   4   5   6   7
        ---------------------------------
      0 |   |   |   |   |   |   |   |   |
        ---------------------------------
      1 |   |   |   | 2 |   | 1 |   |   |
        ---------------------------------
      2 |   |   | 3 |   |   |   | 0 |   |
        ---------------------------------
      3 |   |   |   |   | K |   |   |   |
        ---------------------------------
      4 |   |   | 4 |   |   |   | 7 |   |
        ---------------------------------
      5 |   |   |   | 5 |   | 6 |   |   |
        ---------------------------------
      6 |   |   |   |   |   |   |   |   |
        ---------------------------------
      7 |   |   |   |   |   |   |   |   |
        ---------------------------------
      """);

		}

		private static void moveKnight(int moveNumber) {
				int newRowPosition = currentRow + vertical[moveNumber];
				int newColumnPosition = currentColumn + horizontal[moveNumber];

				if (isOutsideBoard(newRowPosition, newColumnPosition)) {
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

		private static void markPosition(int newRowPosition, int newColumnPosition) {
				board[currentRow][currentColumn] = '*';
				board[newRowPosition][newColumnPosition] = 'K';
				numberOfMovements++;
		}

		private static void showErrorMessage(String message) {
				System.out.printf("Error: %s%n", message);
		}
}
