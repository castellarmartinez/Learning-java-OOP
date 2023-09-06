package chapter06.exercises.ex6_29_Coin_Tossing;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
		private enum Coin {HEAD, TAIL}

		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int headsCount = 0;
				int tailsCount = 0;

				System.out.println("""
            Do you want to toss a coin?
            1) Yes.
            2) No.
            Option:""");
				int option = input.nextInt();

				while (option == 1) {
						Coin side = flip();

						if (side == Coin.HEAD) headsCount++;
						else tailsCount++;

						System.out.println(side);

						System.out.println("""
            Do you want to toss a coin?
            1) Yes.
            2) No.
            Option:""");
						option = input.nextInt();
				}

				System.out.printf("The total number of heads was %s. The total number of tails was %s.",
												headsCount, tailsCount);
		}

		public static Coin flip() {
				SecureRandom rand = new SecureRandom();
				Coin side;

				switch (rand.nextInt(2)) {
						case 0 -> side = Coin.HEAD;
						case 1 -> side = Coin.TAIL;
						default -> {
								System.out.println("Program shouldn't enter here.");
								return null;
						}
				}

				return side;
		}
}
