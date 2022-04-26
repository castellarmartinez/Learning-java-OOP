package chapter06.exercises.ex6_27_Greatest_Common_Divisor;

public class GreatestCommonDivisor {
   public static int gcd(int number1, int number2) {
      int greatest = number1;
      int smallest = number2;

      if (number1 < number2) {
         greatest = number2;
         smallest = number1;
      }

      int remainder = greatest % smallest;

      while (remainder > 0) {
         greatest = smallest;
         smallest = remainder;
         remainder = greatest % smallest;
      }

      return smallest;
   }
}
