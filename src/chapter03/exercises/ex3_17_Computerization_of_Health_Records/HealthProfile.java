package chapter03.exercises.ex3_17_Computerization_of_Health_Records;

import java.util.Date;

public class HealthProfile {
   private String firstName;
   private String lastName;
   private String gender;
   private final int dayOfBirth;
   private final int monthOfBirth;
   private final int yearOfBirth;
   private int height;
   private int weight;

   public HealthProfile(String firstName, String lastName, String gender,
                        int dayOfBirth, int monthOfBirth, int yearOfBirth,
                        int height, int weight) {

      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.dayOfBirth = dayOfBirth;
      this.monthOfBirth = monthOfBirth;
      this.yearOfBirth = yearOfBirth;
      this.height = height;
      this.weight = weight;
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

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
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

   public int getHeight() {
      return height;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
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

      return (today.getYear() + 1900) - this.yearOfBirth - 1;
   }

   public int getMaximumHeartRate() {
      return 220 - getAge();
   }

   public String getTargetHeartRate() {
      return (int) (getMaximumHeartRate() * 0.5) + "-"
              + (int) (getMaximumHeartRate() * 0.85);
   }

   public String getBMI() {
      int BMI = weight * 10_000 / (height * height);

      return "The body mass index is " + BMI + "\nUnderweight = <18.5"
              + "\nNormal weight = 18.5–24.9\nOverweight = 25–29.9"
              + "\nObesity = BMI of 30 or greater";
   }
}
