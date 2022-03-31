package chapter05.exercises;

public class IntegerDivisibleBy3 {
   public static void main(String[] args) {
      int sum = 0;

      for (int i = 3; i <= 30; i += 3) {
         sum += i;
      }

      System.out.println("The sum of the integers divisible by 3 " +
              "in the range 1-30 is: " + sum);
   }
}
