package chapter07.exercises.ex7_21_Turtle_Graphics;

import java.util.Scanner;

public class TurtleGraphics {
		private static final char[][] floor = new char[20][20];
		private static final int[][] turtlePosition = new int[1][2];
		private static boolean isPenDown = false;
		private static int advanceInX = 1;
		private static int advanceInY = 0;
		private static final Scanner input = new Scanner(System.in);

		public static void main(String[] args) {
				int command;

				initFloor();
				displayMenu();
				command = input.nextInt();

				while (command != 9) {
						chooseAction(command);
						command = input.nextInt();
				}

				System.out.println("Thanks for playing the game.");
		}

		private static void initFloor() {
				for (int i = 0; i < floor.length; i++) {
						for (int j = 0; j < floor.length; j++) {
								floor[i][j] = ' ';
						}
				}
		}

		private static void displayMenu() {
				System.out.println("1) Pen up.");
				System.out.println("2) Pen down.");
				System.out.println("3) Turn right.");
				System.out.println("4) Turn left.");
				System.out.println("5) Move forward 10 spaces (replace 10 for a " +
												"different number of spaces).");
				System.out.println("6) Display the 20-by-20 array.");
				System.out.println("9) End game.");
				System.out.print("Option: ");
		}

		private static void chooseAction(int command) {
				switch (command) {
						case 1:
								isPenDown = false;
								break;
						case 2:
								isPenDown = true;
								markFloor();
								break;
						case 3:
								turnRight();
								break;
						case 4:
								turnLeft();
								break;
						case 5:
								int steps = input.nextInt();
								moveForward(steps);
								break;
						case 6:
								displayFloor();
								break;
						default:
								System.out.println("Program should not enter here.");
								break;
				}
		}

		private static void turnRight() {
				turn(1);
		}

		private static void turnLeft() {
				turn(-1);
		}

		private static void turn(int advance) {
				if (advanceInY == 1) {
						advanceInX = -advance;
						advanceInY = 0;
				} else if (advanceInY == -1) {
						advanceInX = advance;
						advanceInY = 0;
				} else if (advanceInX == 1) {
						advanceInX = 0;
						advanceInY = advance;
				} else {
						advanceInX = 0;
						advanceInY = -advance;
				}
		}

		private static boolean isBadPosition() {
				if (turtlePosition[0][0] < 0) {
						turtlePosition[0][0] = 0;
				} else if (turtlePosition[0][0] > 19) {
						turtlePosition[0][0] = 19;
				} else if (turtlePosition[0][1] < 0) {
						turtlePosition[0][1] = 0;
				} else if (turtlePosition[0][1] > 19) {
						turtlePosition[0][1] = 19;
				} else {
						return false;
				}

				return true;
		}

		private static void moveForward(int steps) {
				for (int i = 0; i < steps; i++) {
						turtlePosition[0][0] += advanceInX;
						turtlePosition[0][1] += advanceInY;

						if (isBadPosition()) {
								System.out.println("Turtle can't move in that direction.");
								i = steps;
						}

						markFloor();
				}
		}

		private static void markFloor() {
				int xPosition = turtlePosition[0][0];
				int yPosition = turtlePosition[0][1];

				if (isPenDown) {
						floor[xPosition][yPosition] = '*';
				}
		}

		private static void displayFloor() {
				for (int i = 0; i < 40; i++) {
						System.out.print("-");
				}

				for (int i = 0; i < floor.length; i++) {
						System.out.printf("%n|");

						for (int j = 0; j < floor[i].length; j++) {
								System.out.printf("%c|", floor[i][j]);
						}

						System.out.println();

						for (int k = 0; k < 40; k++) {
								System.out.print("-");
						}
				}

				System.out.println();
		}
}
