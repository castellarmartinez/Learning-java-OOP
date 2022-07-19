package chapter08.exercises.ex8_9_Random_Numbers;

import java.security.SecureRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.printf("Random number #%d:", (random.nextInt(100) + 10));
        }
    }
}
