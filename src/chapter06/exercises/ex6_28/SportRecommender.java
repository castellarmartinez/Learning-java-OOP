package chapter06.exercises.ex6_28;

import java.util.Scanner;

public class SportRecommender {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				double currentTemperature;

				System.out.print("Input the current temperature: ");
				currentTemperature = input.nextDouble();

				System.out.println(sportsRecommender(currentTemperature));
		}

		private static String sportsRecommender(double temperature) {
				if (temperature >= 20 && temperature <= 30) {
						return "It’s lovely weather for sports today!";
				} else if (temperature >= 10 && temperature <= 40) {
						return "It’s reasonable weather for sports today.";
				} else {
						return "Please exercise with care today, watch out for the weather!";
				}
		}
}
