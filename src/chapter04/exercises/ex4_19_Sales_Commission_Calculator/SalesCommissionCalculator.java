package chapter04.exercises.ex4_19_Sales_Commission_Calculator;

import java.util.Scanner;

public class SalesCommissionCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double baseSalary = 200;
      double valueOfItemsSold = 0;
      double currentItemValue;

      System.out.print("Enter the value of the item sold by the salesperson " +
              "(-1 to quit): ");
      currentItemValue = input.nextDouble();
      valueOfItemsSold += currentItemValue;

      while (currentItemValue != -1) {
         System.out.print("Enter the value of the next item sold by the " +
                 "salesperson (-1 to quit): ");
         currentItemValue = input.nextDouble();
         valueOfItemsSold += currentItemValue;
      }

      System.out.println("The weekly salary of the salesperson is: " +
              (baseSalary + valueOfItemsSold * 0.09));
   }
}
