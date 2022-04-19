package chapter04.exercises.ex4_18_Credit_Limit_Calculator;

public class CreditLimitCalculator {
   private final int accountNumber;
   private int beginningBalance;
   private int itemsCharged;
   private int creditsApplied;
   private int creditLimit;

   public CreditLimitCalculator(int accountNumber, int beginningBalance,
                                int itemsCharged, int creditsApplied,
                                int creditLimit) {
      this.accountNumber = accountNumber;
      this.beginningBalance = beginningBalance;
      this.itemsCharged = itemsCharged;
      this.creditsApplied = creditsApplied;
      this.creditLimit = creditLimit;
   }

   public void newBalance() {
      final int balanceResult = this.beginningBalance + this.itemsCharged -
              this.creditsApplied;

      System.out.println("The new balance is " + balanceResult);

      if (balanceResult >= creditLimit) {
         System.out.println("Credit limit exceeded");
      }
   }
}
