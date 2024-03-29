package chapter03.exercises.ex3_11_Modified_Account_Class;

public class Account {
		private String name;
		private double balance;

		public Account(String name, double balance) {
				this.name = name;

				if (balance > 0.0) {
						this.balance = balance;
				}
		}

		public void deposit(double depositAmount) {
				if (depositAmount > 0.0) {
						balance = balance + depositAmount;
				}
		}

		public double getBalance() {
				return balance;
		}

		public void setName(String name) {
				this.name = name;
		}

		public void withdraw(double amountToWithdraw) {
				if (balance - amountToWithdraw < 0) {
						System.out.println("Withdrawal amount exceeded account balance.");

						return;
				}

				this.balance -= amountToWithdraw;
		}

		public String getName() {
				return name;
		}
}
