package chapter04.exercises.ex4_20_Tax_Calculator;

import java.util.Scanner;

public class TaxCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String name;
      double salary;
      double tax;

      System.out.print("Enter the person's name: ");
      name = input.nextLine();
      System.out.print("Enter the person's salary: ");
      salary = input.nextDouble();

      if (salary > 30_000) {
         tax = salary * 0.2;
      } else {
         tax = salary * 0.15;
      }

      System.out.printf("%s has to pay $%.2f in taxes", name, tax);
   }
}
