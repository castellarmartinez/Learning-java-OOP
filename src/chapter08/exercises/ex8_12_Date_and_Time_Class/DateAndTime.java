package chapter08.exercises.ex8_12_Date_and_Time_Class;

import chapter08.exercises.ex8_07_Enhancing_Class_Time2.Time2;

public class DateAndTime {
   private int hour; // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth =
           {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   public DateAndTime() {
      this(1, 1, 1970, 0, 0, 0);
   }

   public DateAndTime(int month) {
      this(month, 1, 1970, 0, 0, 0);
   }

   public DateAndTime(int month, int day) {
      this(month, day, 1970, 0, 0, 0);
   }

   public DateAndTime(int month, int day, int year) {
      this(month, day, year, 0, 0, 0);
   }

   public DateAndTime(int month, int day, int year, int hour) {
      this(month, day, year, hour, 0, 0);
   }

   public DateAndTime(int month, int day, int year, int hour, int minute) {
      this(month, day, year, hour, minute, 0);
   }

   public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      // check if month in range
      if (month <= 0 || month > 12) {
         throw new IllegalArgumentException(
                 "month (" + month + ") must be 1-12");
      }

      // check if day in range for month
      if (day <= 0 ||
              (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
         throw new IllegalArgumentException("day (" + day +
                 ") out-of-range for the specified month and year");
      }

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0 ||
              (year % 4 == 0 && year % 100 != 0))) {
         throw new IllegalArgumentException("day (" + day +
                 ") out-of-range for the specified month and year");
      }

      // check for year after christ
      if (year < 0) {
         throw new IllegalArgumentException("year (" + year +
                 ") must be a positive number");
      }

      this.hour = hour;
      this.minute = minute;
      this.second = second;
      this.month = month;
      this.day = day;
      this.year = year;
   }

   // Set Methods
   // set a new time value using universal time;
   // validate the data
   public void setTime(int hour, int minute, int second) {
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }

   // validate and set hour
   public void setHour(int hour) {
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      this.hour = hour;
   }

   // validate and set minute
   public void setMinute(int minute) {
      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      this.minute = minute;
   }

   // validate and set second
   public void setSecond(int second) {
      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.second = second;
   }

   public void incrementHour() {
      if (hour == 23) {
         hour = 0;
         nextDay();
      } else {
         hour++;
      }
   }

   public void incrementMinute() {
      if (minute == 59) {
         minute = 0;
         incrementHour();
      } else {
         minute++;
      }
   }

   public void tick() {
      if (second == 59) {
         second = 0;
         incrementMinute();
      } else {
         second++;
      }
   }

   // Get Methods
   // get hour value
   public int getHour() {
      return hour;
   }

   // get minute value
   public int getMinute() {
      return minute;
   }

   // get second value
   public int getSecond() {
      return second;
   }

   public void nextDay() {
      if (day < daysPerMonth[month]) {
         day++;
      } else if (day == daysPerMonth[month] && month < 12 || day == 29 && month == 2) {
         day = 1;
         month++;
      } else if (day == daysPerMonth[month] && month == 12) {
         day = 1;
         month = 1;
         year++;
      }
   }

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString() {
      return String.format(
              "%d/%d/%dT%02d:%02d:%02d", month, day, year,
              getHour(), getMinute(), getSecond());
   }

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString() {
      return String.format("%d/%d/%dT%d:%02d:%02d %s", month, day, year,
              ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
              getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   }
}
