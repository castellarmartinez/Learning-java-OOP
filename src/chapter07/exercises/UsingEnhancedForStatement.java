package chapter07.exercises;

public class UsingEnhancedForStatement {
    public static void main(String[] args) {
        for (String number: args) {
            System.out.printf("%5d", Integer.parseInt(number));
        }
    }
}
