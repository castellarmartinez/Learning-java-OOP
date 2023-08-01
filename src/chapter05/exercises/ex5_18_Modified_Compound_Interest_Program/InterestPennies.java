package chapter05.exercises.ex5_18_Modified_Compound_Interest_Program;

public class InterestPennies {
		public static void main(String[] args) {
				int principal = 1000; // initial amount before interest
				int rate = 5; // interest rate

				// display headers
				System.out.printf("%s%10s%10s%n", "Year", "Dollars", "Pennies");

				// calculate amount on deposit for each of ten years
				for (int year = 1; year <= 10; ++year) {
						// calculate new amount on deposit for specified year
						double amount = 100 * principal * Math.pow(1.0 + (double) rate / 100, year);
						int dollars = (int) amount / 100;
						int pennies = (int) amount % 100;

						// display the year and the amount
						System.out.printf("%4d%10d%10d%n", year, dollars, pennies);
				}
		}
}
