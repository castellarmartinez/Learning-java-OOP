package chapter06.exercises.ex6_22_Temperature_Conversions;

public class TemperatureConversions {
		public static double toKelvin(double celsiusDegrees) {
				return celsiusDegrees + 273.15;
		}

		public static double toCelsius(double kelvinDegrees) {
				return kelvinDegrees - 273.15;
		}

		public static void celsiusEquivalent(double degrees) {
				System.out.printf("The celsius equivalent is: %.2f", degrees);
		}

		public static void kelvinEquivalent(double degrees) {
				System.out.printf("The kelvin equivalent is: %.2f", degrees);
		}
}
