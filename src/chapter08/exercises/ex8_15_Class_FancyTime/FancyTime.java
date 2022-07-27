package chapter08.exercises.ex8_15_Class_FancyTime;

public class FancyTime {
   private int hour;
   private int minutes;
   private int seconds;
   private String meridiem;

   public FancyTime(int hour, int minutes) {
      this(hour, minutes, 0, null);
   }

   public FancyTime(int hour, int minutes, int seconds) {
      this(hour, minutes, seconds, null);
   }

   public FancyTime(int hour, int minutes, int seconds, String meridiem) {
      this.hour = hour;
      this.minutes = minutes;
      this.seconds = seconds;
      this.meridiem = meridiem;
   }

   public void displayTime(int flag) {
      switch (flag) {
         case 1:
            System.out.printf("%02d:%02d:%02d %s%n", hour, minutes, seconds, meridiem);
            break;
         case 2:
            System.out.printf("%02d:%02d:%02d%n", hour, minutes, seconds);
            break;
         case 3:
            System.out.printf("%02d:%02d%n", hour, minutes);
            break;
         default:
            System.out.println("The format is not valid");
            break;
      }
   }
}
