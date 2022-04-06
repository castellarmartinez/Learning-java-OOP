package chapter06;


public class NumbersConversion {
    public static void main(String[] args) {
        System.out.printf("%10s%10s%8s%14s%n%n", "Decimal", "Binary", "Octal",
                "Hexadecimal");

        for (int i = 1; i <= 256; i++) {
            System.out.printf("%10d%10s%8s%14s%n", i,
                    binaryEquivalent(i), octalEquivalent(i),
                    hexadecimalEquivalent(i));
        }
    }

    public static String binaryEquivalent(int decimal) {
        return getEquivalence(decimal, 2);
    }

    public static String octalEquivalent(int decimal) {
        return getEquivalence(decimal, 8);
    }

    public static String hexadecimalEquivalent(int decimal) {
        return getEquivalence(decimal, 16);
    }

    private static String getEquivalence(int decimal, int base) {
        char[] bases = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        String newNumber = "";

        while (decimal > 0) {
            newNumber = bases[decimal % base] + newNumber;
            decimal /= base;
        }

        return newNumber;
    }
}
