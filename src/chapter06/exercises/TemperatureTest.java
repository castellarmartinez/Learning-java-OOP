package chapter06.exercises;

import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        System.out.print("""
                What conversion do you want to perform?
                1) Celsius to Kelvin.
                2) Kelvin to Celsius.
                Option:\s""");
        option = input.nextInt();

        switch (option) {
            case 1 -> {
                TemperatureConversions.celsiusToKelvin();
                double degrees = input.nextDouble();
                double equivalentDegrees = TemperatureConversions.toKelvin(degrees);
                TemperatureConversions.kelvinEquivalent(equivalentDegrees);
            }
            case 2 -> {
                TemperatureConversions.kelvinToCelsius();
                double degrees = input.nextDouble();
                double equivalentDegrees = TemperatureConversions.toCelsius(degrees);
                TemperatureConversions.celsiusEquivalent(equivalentDegrees);
            }
            default -> System.out.println("The option chosen is not valid.");
        }
    }
}
