package chapter06.exercises.ex6_29_Coin_Tossing;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
		private enum Coin {HEAD, TAIL}

		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.println("Do you want to toss a coin?\n" +
												"1) Yes.\n2) No.\nOption: ");
				int option = input.nextInt();

				while (option == 1) {
						System.out.println(flip());

						System.out.println("Do you want to toss another coin?\n" +
														"1) Yes.\n2) No.\nOption: ");
						option = input.nextInt();
				}

		}

		public static Coin flip() {
				SecureRandom rand = new SecureRandom();
				Coin side;

				switch (rand.nextInt(2)) {
						case 0 -> side = Coin.HEAD;
						case 1 -> side = Coin.TAIL;
						default -> {
								System.out.println("Program shouldn't enter here.");
								side = Coin.TAIL;
						}
				}

				return side;
		}
}
