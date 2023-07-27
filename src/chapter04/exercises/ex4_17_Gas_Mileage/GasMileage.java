package chapter04.exercises.ex4_17_Gas_Mileage;

import java.util.Scanner;

public class GasMileage {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int totalMiles = 0;
      int totalGallons = 0;
      double milesPerGallonCombined;
      int flag = 0;

      while (flag != -1) {
         System.out.print("\nEnter the miles driven: ");
         int milesDriven = input.nextInt();
         System.out.print("Enter the gallons used: ");
         int gallonsUsed = input.nextInt();
         double milesPerGallon = (double) milesDriven / gallonsUsed;

         totalMiles += milesDriven;
         totalGallons += gallonsUsed;
         milesPerGallonCombined = (double) totalMiles / totalGallons;

         System.out.printf("The miles per gallon in this trip is: %.2f%n",
                 milesPerGallon);
         System.out.printf("The miles per gallon combined: %.2f%n",
                 milesPerGallonCombined);

         System.out.print("\nEnter any number to continue. Enter -1 to exit: ");
         flag = input.nextInt();
      }
   }
}
