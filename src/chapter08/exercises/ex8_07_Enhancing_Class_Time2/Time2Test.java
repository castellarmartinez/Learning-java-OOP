package chapter08.exercises.ex8_07_Enhancing_Class_Time2;// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2 objects.

public class Time2Test {
   public static void main(String[] args) {
      Time2 t4 = new Time2(12, 25, 42); // 12:25:42

      displayTime("The initial time is", t4);
      t4.incrementHour();
      displayTime("Increment an hour", t4);
      t4.incrementMinute();
      displayTime("Increment a minute", t4);
      t4.tick();
      displayTime("Increment a second", t4);
      t4.setHour(23);
      displayTime("Setting hour to 23", t4);
      t4.setMinute(59);
      displayTime("Setting minutes to 59", t4);
      t4.setSecond(59);
      displayTime("Setting seconds to 59", t4);
      t4.tick();
      displayTime("Increment a second", t4);
   }

   // displays a Time2 object in 24-hour and 12-hour formats
   private static void displayTime(String header, Time2 t) {
      System.out.printf("%s%n   %s%n   %s%n",
              header, t.toUniversalString(), t.toString());
   }
} // end class Time2Test


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
