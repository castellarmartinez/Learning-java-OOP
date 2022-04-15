package chapter03.exercises.ex3_17_Computerization_of_Health_Records;

public class HealthProfile {
   private String firstName;
   private String lastName;
   private String gender;
   private final String dayOfBirth;
   private final String monthOfBirth;
   private final String yearOfBirth;
   private String height;
   private String weight;

   public HealthProfile(String firstName, String lastName, String gender,
                        String dayOfBirth, String monthOfBirth,
                        String yearOfBirth, String height, String weight) {

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

   public String getDayOfBirth() {
      return dayOfBirth;
   }

   public String getMonthOfBirth() {
      return monthOfBirth;
   }

   public String getYearOfBirth() {
      return yearOfBirth;
   }

   public String getHeight() {
      return height;
   }

   public void setHeight(String height) {
      this.height = height;
   }

   public String getWeight() {
      return weight;
   }

   public void setWeight(String weight) {
      this.weight = weight;
   }
}
