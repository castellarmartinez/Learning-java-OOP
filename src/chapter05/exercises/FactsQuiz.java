package chapter05.exercises;

import java.util.Scanner;

public class FactsQuiz {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int count = 0;

      for (int i = 1; i <= 5; i++) {

         switch (i) {
            case 1:
               System.out.print(i + ") El nombre de la casa precidencial del Colombia es: \n" +
                       "a) Casa Rosada.\n" +
                       "b) Palacio de Miraflores.\n" +
                       "c) Casa de Nariño.\n" +
                       "d) Palacio de la Monedo.\n" +
                       "Respuesta: ");
               break;
            case 2:
               System.out.print(i + ") Principal puerto del país: \n" +
                       "a) Puerto de Buenaventura.\n" +
                       "b) Puerto de Barranquilla.\n" +
                       "c) Puerto de Santa Marta.\n" +
                       "d) Puerto de Cartagena.\n" +
                       "Respuesta: ");
               break;
            case 3:
               System.out.print(i + ") No es una región natural de Colombia: \n" +
                       "a) Región Arida.\n" +
                       "b) Región Andina.\n" +
                       "c) Región Caribe.\n" +
                       "d) Región Amazónica.\n" +
                       "Respuesta: ");
               break;
            case 4:
               System.out.print(i + ") Deporte practicado mayoritariamente en el norte de país: \n" +
                       "a) Baloncesto.\n" +
                       "b) Fútbol.\n" +
                       "c) Tejo.\n" +
                       "d) Beisbol.\n" +
                       "Respuesta: ");
               break;
            case 5:
               System.out.print(i + ") No es un/a cantante colombiano: \n" +
                       "a) Malua.\n" +
                       "b) Nicky Jam.\n" +
                       "c) Shakira.\n" +
                       "d) Camilo.\n" +
                       "Respuesta: ");
               break;
            default:
               System.out.println("Program should not enter here.");
               break;
         }

         char answer = input.next().charAt(0);

         switch (i) {
            case 1:
               if (answer == 'c') {
                  count++;
               }
               break;
            case 2:
            case 3:
               if (answer == 'a') {
                  count++;
               }
               break;
            case 4:
               if (answer == 'd') {
                  count++;
               }
               break;
            case 5:
               if (answer == 'b') {
                  count++;
               }
               break;
            default:
               System.out.println("Program should not enter here.");
               break;
         }
      }

      switch (count) {
         case 1:
         case 2:
         case 3:
            System.out.println("\nTime to brush up on your knowledge of Colombia.");
            break;
         case 4:
            System.out.println("\nVery good.");
            break;
         case 5:
            System.out.println("\nExcellent.");
            break;
         default:
            System.out.println("Program should not enter here.");
            break;
      }
   }
}
