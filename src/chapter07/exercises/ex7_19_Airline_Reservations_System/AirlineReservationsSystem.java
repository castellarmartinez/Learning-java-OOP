package chapter07.exercises.ex7_19_Airline_Reservations_System;

import java.util.Scanner;

public class AirlineReservationsSystem {
		private static boolean[] seats = new boolean[10];
		private static final String[] classes = {"Invalid", "First", "Economy"};
		private static int seatsTaken = 0;

		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				do {
						System.out.println("Welcome to the airline reservations. ");
						System.out.println("Please type 1 for First Class.");
						System.out.println("Please type 2 for Economy Class.");
						System.out.print("Option: ");
						int option = input.nextInt();

						if (!chooseSeat(option)) {
								int alternative = (option == 1 ? 2 : 1);

								System.out.printf("Would you like a seat in %s class?%n",
																classes[alternative]);
								System.out.print("Type y (yes) or n (no): ");
								char tryAgain = input.next().charAt(0);

								if ((tryAgain == 'n' || tryAgain == 'N') ||
																!chooseSeat(alternative)) {
										System.out.println("Next flight is in 3 hours.\n");
								}
						}

				} while (seatsTaken < 10);

				System.out.println("No more seats available. Next flight is in " +
												"3 hours.\n");
		}

		private static boolean isSeatAvailable(boolean seat) {
				return !seat;
		}

		private static boolean chooseSeat(int section) {
				for (int i = 5 * (section - 1); i < 5 * section; i++) {
						if (isSeatAvailable(seats[i])) {
								seats[i] = true;
								displayBoardingPass(i + 1);
								seatsTaken++;

								return true;
						}
				}

				System.out.printf("%s class is full.%n", classes[section]);
				return false;
		}

		private static void displayBoardingPass(int seat) {
				System.out.printf("Your seat number is #%d%n", seat);
				System.out.printf("Your are in %s Class%n%n", (seat < 6 ? "First" : "Economy"));
		}
}
