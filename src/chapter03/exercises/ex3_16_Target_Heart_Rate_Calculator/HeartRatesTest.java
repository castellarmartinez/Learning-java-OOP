package chapter03.exercises.ex3_16_Target_Heart_Rate_Calculator;

public class HeartRatesTest {
		public static void main(String[] args) {
				HeartRates person = new HeartRates("David",
												"Castellar Martínez", 14, 4, 1994);

				System.out.println("The person's first name is: " +
												person.getFirstName());
				System.out.println("The person's last name is: " +
												person.getLastName());
				System.out.println("The person's date of birth is: " +
												person.getBirthDate());
				System.out.println("The person's age is: " +
												person.getAge());
				System.out.println("The person's maximum heart rate: " +
												person.getMaximumHeartRate());
				System.out.println("The person's target heart rate: " +
												person.getTargetHeartRate());
		}
}
