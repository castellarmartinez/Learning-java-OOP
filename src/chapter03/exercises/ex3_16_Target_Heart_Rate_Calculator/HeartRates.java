package chapter03.exercises.ex3_16_Target_Heart_Rate_Calculator;

import java.util.Date;

public class HeartRates {
   private String firstName;
   private String lastName;
   private final int dayOfBirth;
   private final int monthOfBirth;
   private final int yearOfBirth;

   public HeartRates(String firstName, String lastName,
                     int dayOfBirth, int monthOfBirth, int yearOfBirth) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.dayOfBirth = dayOfBirth;
      this.monthOfBirth = monthOfBirth;
      this.yearOfBirth = yearOfBirth;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public int getDayOfBirth() {
      return dayOfBirth;
   }

   public int getMonthOfBirth() {
      return monthOfBirth;
   }

   public int getYearOfBirth() {
      return yearOfBirth;
   }

   public String getBirthDate() {
      return getDayOfBirth() + "/" + getMonthOfBirth() + "/" + getYearOfBirth();
   }

   public int getAge() {
      Date today = new Date();

      if ((today.getMonth() + 1) > this.monthOfBirth) {
         return (today.getYear() + 1900) - this.yearOfBirth;
      }

      if (this.monthOfBirth == (today.getMonth() + 1)) {
         if (today.getDate() >= this.dayOfBirth) {
            return (today.getYear() + 1900) - this.yearOfBirth;
         }
      }

      return (today.getYear() + 1900)  - this.yearOfBirth - 1;
   }

   public int getMaximumHeartRate() {
      return 220 - getAge();
   }

   public String getTargetHeartRate() {
      return (int) (getMaximumHeartRate() * 0.5) + "-"
              + (int) (getMaximumHeartRate() * 0.85);
   }
}
