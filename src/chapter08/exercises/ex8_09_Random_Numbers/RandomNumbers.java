package chapter08.exercises.ex8_09_Random_Numbers;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int n;

        System.out.print("Enter the number of randoms you want: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Random number #%02d: %d%n", i, (random.nextInt(91) + 10));
        }
    }
}
