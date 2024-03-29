package chapter07.exercises.ex7_28_Simulation_The_Tortoise_And_The_Hare;

import java.security.SecureRandom;
import java.util.Scanner;

public class TheTortoiseAndTheHare {
		public static void main(String[] args) {
				SecureRandom random = new SecureRandom();
				Scanner input = new Scanner(System.in);

				int tortoise = 1;
				int hare = 1;
				char[] racePositions = new char[71];

				initializeTrack(racePositions);
				movePlayers(tortoise, hare, racePositions);

				System.out.println("""
            BANG !!!!!
            AND THEY'RE OFF !!!!!""");

				displayTrack(racePositions);

				System.out.println("(Press Enter to continue)");
				input.nextLine();

				while (!isThereAWinner(racePositions)) {

						int move = random.nextInt(10) + 1;

						cleanPreviousPositions(tortoise, hare, racePositions);

						tortoise = choseNewTortoisePosition(move, tortoise, racePositions);
						hare = choseNewHarePosition(move, hare, racePositions);

						movePlayers(tortoise, hare, racePositions);
						displayTrack(racePositions);

						System.out.println("(Press Enter to continue)");
						input.nextLine();
				}
		}

		private static void initializeTrack(char[] racePositions) {
				for (int i = 1; i < racePositions.length; i++) {
						racePositions[i] = '_';
				}
		}

		private static void movePlayers(int tortoise, int hare, char[] racePositions) {
				if (tortoise == hare) {
						racePositions[tortoise] = '*';
				} else {
						racePositions[tortoise] = 'T';
						racePositions[hare] = 'H';
				}
		}

		private static void displayTrack(char[] racePositions) {
				for (int i = 1; i < racePositions.length; i++) {
						System.out.print(racePositions[i]);
				}
		}

		private static boolean isThereAWinner(char[] racePositions) {
				if (racePositions[70] == '_') {
						return false;
				} else if (racePositions[70] == '*') {
						System.out.println("It's a tie");
				} else if (racePositions[70] == 'T') {
						System.out.println("TORTOISE WINS!!! YAY!!!");
				} else if (racePositions[70] == 'H') {
						System.out.println("Hare wins. Yuck.");
				}

				return true;
		}

		private static void cleanPreviousPositions(
										int tortoise, int hare, char[] racePositions) {

				racePositions[tortoise] = '_';
				racePositions[hare] = '_';
		}

		private static int choseNewTortoisePosition(
										int move, int tortoise, char[] racePositions) {
				if (racePositions[tortoise] == '*') { // Remove current position
						racePositions[tortoise] = 'H';
				} else {
						racePositions[tortoise] = '_';
				}

				switch (move) {
						case 1, 2, 3, 4, 5:
								tortoise += 3;
								break;
						case 6, 7:
								tortoise -= 6;
								break;
						case 8, 9, 10:
								tortoise += 1;
								break;
						default:
								System.out.println("Program should not enter here");
				}

				// Place tortoise again on track
				if (tortoise > 70) {
						tortoise = 70;
				}
				if (tortoise < 1) {
						tortoise = 1;
				}

				return tortoise;
		}

		private static int choseNewHarePosition(
										int move, int hare, char[] racePositions) {
				if (move <= 2) {
						return hare;
				}

				if (racePositions[hare] == '*') { // Remove current position
						racePositions[hare] = 'T';
				} else {
						racePositions[hare] = '_';
				}

				switch (move) {
						case 3, 4:
								hare += 9;
								break;
						case 5:
								hare += 1;
								break;
						case 6, 7, 8:
								hare += 1;
								break;
						case 9, 10:
								hare -= 2;
								break;
						default:
								System.out.println("Program should not enter here");
				}

				// Place tortoise hare on track
				if (hare > 70) {
						hare = 70;
				}
				if (hare < 1) {
						hare = 1;
				}

				return hare;
		}
}
