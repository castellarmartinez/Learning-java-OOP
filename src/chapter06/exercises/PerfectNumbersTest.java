package chapter06.exercises;

import java.util.Scanner;

public class PerfectNumbersTest {
    public static void main(String[] args) {
        System.out.println("Perfect numbers: ");

        for (int i = 1; i <= 1000000000; i++) {
            if (PerfectNumbers.isPerfect(i)) {
                PerfectNumbers.factors(i);
            }
        }
    }
}
