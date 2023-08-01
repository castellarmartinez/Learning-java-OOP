package chapter08.exercises.ex8_06_Savings_Account_Class;

public class SavingsAccount {
		private static double annualInterestRate;
		private double savingsBalance;

		public SavingsAccount(double savingsBalance) {
				this.savingsBalance = savingsBalance;
		}

		public double getSavingsBalance() {
				return savingsBalance;
		}

		public double calculateMonthlyInterest() {
				double monthlyInterest = savingsBalance * annualInterestRate / 12;
				savingsBalance += monthlyInterest;

				return monthlyInterest;
		}

		public static void modifyInterestRate(double annualInterestRate) {
				SavingsAccount.annualInterestRate = annualInterestRate / 100.0;
		}
}
