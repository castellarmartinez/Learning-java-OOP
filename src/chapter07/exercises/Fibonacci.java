package chapter07.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the fibonacci term you want to find: ");
      int term = input.nextInt();

      System.out.printf("fibonacci(%d) = %.0f%n", term, fibonacci(term));

      int count = 0;

      while (fibonacci(count) <= Double.MAX_VALUE) {
         count++;
      }

      System.out.printf("The maximum fibonacci number that can be " +
              "represented by doubles is: %.0f%n", fibonacci(count - 1));
      System.out.printf("The maximum fibonacci term that can be " +
              "represented by doubles is: %d", count);
   }

   public static double fibonacci(int n) {
      if (n < 0) { return -1; }
      if (n == 0) { return 0; }
      if (n == 1) { return 1; }

      ArrayList<Double> fibonacciSeries = new ArrayList<>();

      fibonacciSeries.add((double) 0);
      fibonacciSeries.add((double) 1);

      for (int i = 2; i <= n; i++) {
         double firstPrevious = fibonacciSeries.get(i - 1);
         double secondPrevious = fibonacciSeries.get(i - 2);
         fibonacciSeries.add(firstPrevious + secondPrevious);
      }

      return fibonacciSeries.get(n);
   }
}
