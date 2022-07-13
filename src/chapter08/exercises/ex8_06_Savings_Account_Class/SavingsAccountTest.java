package chapter08.exercises.ex8_06_Savings_Account_Class;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        System.out.println("The initial balance for saver1 is: " + saver1.getSavingsBalance());
        System.out.println("The initial balance for saver2 is: " + saver1.getSavingsBalance());

        System.out.println("Setting the annual interest rate to 4%");
        SavingsAccount.modifyInterestRate(4);

        System.out.println("The monthly interest for saver1 is: " + saver1.calculateMonthlyInterest());
        System.out.println("The monthly interest for saver2 is: " + saver2.calculateMonthlyInterest());

        System.out.println("Setting the annual interest rate to 5%");
        SavingsAccount.modifyInterestRate(5);

        System.out.println("The monthly interest for saver1 is: " + saver1.calculateMonthlyInterest());
        System.out.println("The monthly interest for saver2 is: " + saver2.calculateMonthlyInterest());
    }
}
