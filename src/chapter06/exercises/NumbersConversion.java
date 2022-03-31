package chapter06.exercises;


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
        int counter = 1;
        int binary = 0;

        while (decimal > 0) {
            binary += (decimal % 2) * counter;
            counter *= 10;
            decimal /= 2;
        }

        return String.valueOf(binary);
    }

    public static String octalEquivalent(int decimal) {
        int counter = 1;
        int octal = 0;

        while (decimal > 0) {
            octal += (decimal % 8) * counter;
            counter *= 10;
            decimal /= 8;
        }

        return String.valueOf(octal);
    }

    public static String hexadecimalEquivalent(int decimal) {
        String octal = "";

        while (decimal > 0) {
            switch (decimal % 16) {
                case 15:
                    octal = 'F' + octal;
                    break;
                case 14:
                    octal = 'E' + octal;
                    break;
                case 13:
                    octal = 'D' + octal;
                    break;
                case 12:
                    octal = 'C' + octal;
                    break;
                case 11:
                    octal = 'B' + octal;
                    break;
                case 10:
                    octal = 'A' + octal;
                    break;
                default:
                    octal = (decimal % 16) + octal;
                    break;
            }

            decimal /= 16;
        }

        return octal;
    }
}
