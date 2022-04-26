package chapter06.exercises.ex6_8_Parking_Charges;

public class ParkingCharges {
   public static void main(String[] args) {
      calculateCharges(2);
      calculateCharges(6.3);
      calculateCharges(6.8);
      calculateCharges(21);
   }

   public static void calculateCharges(double hours) {
      double charge = 2.0;

      if (hours > 3) {
         charge += 0.5 * Math.ceil(hours - 3);

         if (charge > 10) {
            charge = 10.0;
         }
      }

      System.out.printf("The total charges for %.1f hours is $%.2f%n",
              hours, charge);
   }
}
