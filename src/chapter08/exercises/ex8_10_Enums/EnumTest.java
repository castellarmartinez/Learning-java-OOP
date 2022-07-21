package chapter08.exercises.ex8_10_Enums;

public class EnumTest {
   public static void main(String[] args) {
      System.out.println("All the food:");

      for (Food food: Food.values()) {
         System.out.printf("%-10s%-15s%d%n", food, food.getType(), food.getNumberOfCalories());
      }
   }
}
