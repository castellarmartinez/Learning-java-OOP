package chapter02.exercises.ex2_34_World_Population_Growth_Calculator;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				long currentPopulation;
				double currentGrowthRate;

				System.out.print("Enter the current population: ");
				currentPopulation = input.nextLong();
				System.out.print("Enter the current growth rate (in %): ");
				currentGrowthRate = input.nextDouble();

				System.out.printf("The estimate population in one year is: %.0f%n",
												currentPopulation * Math.pow((1 + currentGrowthRate / 100), 1));
				System.out.printf("The estimate population in two year is: %.0f%n",
												currentPopulation * Math.pow((1 + currentGrowthRate / 100), 2));
				System.out.printf("The estimate population in three year is: %.0f%n",
												currentPopulation * Math.pow((1 + currentGrowthRate / 100), 3));
				System.out.printf("The estimate population in four year is: %.0f%n",
												currentPopulation * Math.pow((1 + currentGrowthRate / 100), 4));
				System.out.printf("The estimate population in five year is: %.0f%n",
												currentPopulation * Math.pow((1 + currentGrowthRate / 100), 5));
		}
}
