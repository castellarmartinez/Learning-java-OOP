package chapter05.exercises;

import java.util.Scanner;

public class FairTax {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double expenses = 0;
      double fairTaxes;

      for (int i = 1; i <= 8; i++) {

         System.out.print("Enter your expenses in");

         switch (i) {
            case 1:
               System.out.print(" food: ");
               break;
            case 2:
               System.out.print(" housing: ");
               break;
            case 3:
               System.out.print(" clothing: ");
               break;
            case 4:
               System.out.print(" transportation: ");
               break;
            case 5:
               System.out.print(" education: ");
               break;
            case 6:
               System.out.print(" health care: ");
               break;
            case 7:
               System.out.print(" vacations: ");
               break;
            case 8:
               System.out.print(" streaming: ");
               break;
            default:
               System.out.println("Program should not enter here.");
               break;
         }

         expenses += input.nextDouble();
      }

      fairTaxes = expenses * 0.23;

      System.out.printf("Your total expenses are $%.2f%n", expenses);
      System.out.printf("Your fair taxes are $%.2f%n%n", fairTaxes);
   }
}
