package chapter08.exercises.ex8_06_Savings_Account_Class;

public class SavingsAccountTest {
		public static void main(String[] args) {
				SavingsAccount saver1 = new SavingsAccount(2000);
				SavingsAccount saver2 = new SavingsAccount(3000);

				System.out.printf("The initial balance for saver1 is: %.2f%n", saver1.getSavingsBalance());
				System.out.printf("The initial balance for saver2 is: %.2f%n", saver2.getSavingsBalance());

				System.out.println("Setting the annual interest rate to 4%");
				SavingsAccount.modifyInterestRate(4);

				System.out.printf("The monthly interest for saver1 is: %.2f%n", saver1.calculateMonthlyInterest());
				System.out.printf("The monthly interest for saver2 is: %.2f%n", saver2.calculateMonthlyInterest());

				System.out.printf("The new balance for saver1 is: %.2f%n", saver1.getSavingsBalance());
				System.out.printf("The new balance for saver2 is: %.2f%n", saver2.getSavingsBalance());

				System.out.println("Setting the annual interest rate to 5%");
				SavingsAccount.modifyInterestRate(5);

				System.out.printf("The monthly interest for saver1 is: %.2f%n", saver1.calculateMonthlyInterest());
				System.out.printf("The monthly interest for saver2 is: %.2f%n", saver2.calculateMonthlyInterest());

				System.out.printf("The new balance for saver1 is: %.2f%n", saver1.getSavingsBalance());
				System.out.printf("The new balance for saver2 is: %.2f%n", saver2.getSavingsBalance());
		}
}
