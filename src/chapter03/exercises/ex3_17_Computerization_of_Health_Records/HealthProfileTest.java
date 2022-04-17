package chapter03.exercises.ex3_17_Computerization_of_Health_Records;

public class HealthProfileTest {
   public static void main(String[] args) {
      HealthProfile profile = new HealthProfile("David", "Castellar", "M",
              18, 6, 1994, 167, 52);

      System.out.printf("First name: %s%n", profile.getFirstName());
      System.out.printf("Last name: %s%n", profile.getLastName());
      System.out.printf("Birth date: %s%n", profile.getBirthDate());
      System.out.printf("Age: %d%n", profile.getAge());
      System.out.printf("Weight: %d%n", profile.getWeight());
      System.out.printf("Maximum heart rate: %d%n", profile.getMaximumHeartRate());
      System.out.printf("Target heart rate: %s%n", profile.getTargetHeartRate());
      System.out.printf("BMI: %s%n", profile.getBMI());
   }
}
