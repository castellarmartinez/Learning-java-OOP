package chapter04.exercises.ex4_33_Checkerboard_Pattern_of_Asterisks;

public class CheckerboardPattern {
		public static void main(String[] args) {
				int countRow = 1;
				int countCol = 1;

				while (countRow <= 8) {
						if (countRow % 2 == 0) {
								System.out.print(" ");
						}

						while (countCol <= 8) {
								System.out.print("* ");
								countCol++;
						}

						System.out.println();
						countCol = 1;
						countRow++;
				}
		}
}
