package chapter07.exercises.ex7_23_Knights_Tour_Brute_Force_Approaches;


import java.security.SecureRandom;
import java.util.Arrays;

public class KnightsTourBruteForce {
		static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
		static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
		static final char[][] board = new char[8][8];
		static int currentRow = 0;
		static int currentColumn = 0;
		static int numberOfMovements = 0;

		public static void main(String[] args) {
				SecureRandom random = new SecureRandom();

				initializeBoard();

				while (canMove() || numberOfMovements < 63) {
						int moveNumber = random.nextInt(8);

						moveKnight(moveNumber);
				}

				displayBoard();
		}

		private static void initializeBoard() {
				for (int i = 0; i < 8; i++) {
						Arrays.fill(board[i], '0');
				}
		}

		private static boolean canMove() {
				for (int i = 0; i < 8; i++) {
						int newRowPosition = currentRow + vertical[i];
						int newColumnPosition = currentColumn + horizontal[i];

						if (isOutsideBoard(newRowPosition, newColumnPosition)
														|| isPositionTaken(newRowPosition, newColumnPosition)) {
								continue;
						}

						return true;
				}

				// Si en todos los movimientos queda fuera del tablero o la posicion está tomada
				return false;
		}

		private static void moveKnight(int moveNumber) {
				int newRowPosition = currentRow + vertical[moveNumber];
				int newColumnPosition = currentColumn + horizontal[moveNumber];

				if (isOutsideBoard(newRowPosition, newColumnPosition) ||
												isPositionTaken(newRowPosition, newColumnPosition)) {
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
