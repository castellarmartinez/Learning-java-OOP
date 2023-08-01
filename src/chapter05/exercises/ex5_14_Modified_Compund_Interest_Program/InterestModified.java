package chapter05.exercises.ex5_14_Modified_Compund_Interest_Program;

public class InterestModified {
		public static void main(String[] args) {
				double principal = 1000.0; // initial amount before interest

				for (int i = 5; i <= 10; i++) {
						double rate = (double) i / 100;
						// display headers
						System.out.printf("%13s%7s%20s%n", "Interest rate", "Year",
														"Amount on deposit");

						// calculate amount on deposit for each of ten years
						for (int year = 1; year <= 10; ++year) {
								// calculate new amount on deposit for specified year
								double amount = principal * Math.pow(1.0 + rate, year);

								// display the year and the amount
								System.out.printf("%13.2f%7d%,20.2f%n", rate, year, amount);
						}

						System.out.println();
				}
		}
}
