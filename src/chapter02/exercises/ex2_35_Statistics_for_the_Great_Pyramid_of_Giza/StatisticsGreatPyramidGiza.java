package chapter02.exercises.ex2_35_Statistics_for_the_Great_Pyramid_of_Giza;

import java.util.Scanner;

public class StatisticsGreatPyramidGiza {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				final int NUMBER_OF_STONES;
				final double AVG_WEIGHT_STONE;
				final int YEARS_TO_BUILD;
				final double STONES_BY_YEAR;

				System.out.print("Enter the estimated number of stones used to " +
												"build the pyramid: ");
				NUMBER_OF_STONES = input.nextInt();
				System.out.print("Enter the average weight of each stone (tons): ");
				AVG_WEIGHT_STONE = input.nextDouble();
				System.out.print("Enter the years take to build the pyramid: ");
				YEARS_TO_BUILD = input.nextInt();

				STONES_BY_YEAR = (double) NUMBER_OF_STONES / YEARS_TO_BUILD;

				System.out.printf("The estimate weight (tons) of the pyramid that was built" +
												" every year was: %.0f%n", STONES_BY_YEAR * AVG_WEIGHT_STONE);
				System.out.printf("The estimate weight (tons) of the pyramid that was built" +
												" every hour was: %.0f%n", STONES_BY_YEAR * AVG_WEIGHT_STONE / 8760);
				System.out.printf("The estimate weight (tons) of the pyramid that was built" +
												" every minute was: %.0f%n", STONES_BY_YEAR * AVG_WEIGHT_STONE / 525600);
		}
}
