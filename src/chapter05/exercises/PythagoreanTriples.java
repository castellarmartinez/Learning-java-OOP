package chapter05.exercises;

public class PythagoreanTriples {
   public static void main(String[] args) {
      System.out.printf("%7s%7s%12s%n%n", "side1", "side2", "hypotenuse");

      for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
         for (int side2 = 1; side2 <= 500; side2++) {
            for (int side1 = 1; side1 <= 500; side1++) {
               double side1RaisedTo2 = Math.pow(side1, 2);
               double side2RaisedTo2 = Math.pow(side2, 2);
               double hypotenuseRaisedTo2 = Math.pow(hypotenuse, 2);

               if (side1RaisedTo2 + side2RaisedTo2 == hypotenuseRaisedTo2) {
                  System.out.printf("%7d%7d%12d%n", side1, side2, hypotenuse);
               }
            }
         }
      }

      System.out.println("End of the program.");
   }
}
