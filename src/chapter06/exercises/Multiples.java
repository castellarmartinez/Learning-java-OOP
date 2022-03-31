package chapter06.exercises;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Enter the first integer: ");
        x = input.nextInt();
        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        System.out.printf("The second number %s multiple of the first number.",
                (isMultiple(x, y) ? "is" : "is not"));
    }

    public static boolean isMultiple(int number1, int number2) {
        return number2 % number1 == 0;
    }
}
