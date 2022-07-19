package chapter08.exercises.ex8_08_Enhancing_Class_Date;

public class DateTest {
   public static void main(String[] args) {
      Date myDate = new Date(11, 25, 2011);

      System.out.printf("%nDay %2d: %s%n", 0, myDate);

      for (int day = 1; day < 100; day++) {
         myDate.nextDay();
         System.out.printf("Day %2d: %10s%n", day, myDate);
      }
   }
}
