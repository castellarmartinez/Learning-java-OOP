package chapter04.exercises;

public class CreditLimitCalculatorTest {
   public static void main(String[] args) {
      CreditLimitCalculator account1 = new CreditLimitCalculator(
              156156, 70000, 120000, 50000, 100000);

      account1.newBalance();
   }
}
