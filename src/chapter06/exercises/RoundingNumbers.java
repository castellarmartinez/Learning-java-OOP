package chapter06.exercises;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double numberEntered = input.nextDouble();

        System.out.printf("The number entered is %f%n", numberEntered);
        roundToInteger(numberEntered);
        roundToTenths(numberEntered);
        roundToHundredths(numberEntered);
        roundToThousandths(numberEntered);
    }

    private static void roundToInteger(double number) {
        double roundedNumber = Math.floor(number + 0.5);
        System.out.printf("The nearest integer is %.0f%n", roundedNumber);
    }

    private static void roundToTenths(double number) {
        double roundedNumber = Math.floor(number * 10 + 0.5) / 10;
        System.out.printf("Rounded to tenths %.1f%n", roundedNumber);
    }

    private static void roundToHundredths(double number) {
        double roundedNumber = Math.floor(number * 100 + 0.5) / 100;
        System.out.printf("Rounded to hundredths %.2f%n", roundedNumber);
    }

    private static void roundToThousandths(double number) {
        double roundedNumber = Math.floor(number * 1000 + 0.5) / 1000;
        System.out.printf("Rounded to thousandths %.3f%n", roundedNumber);
    }
}
