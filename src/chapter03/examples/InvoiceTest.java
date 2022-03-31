package chapter03.examples;

// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.

public class InvoiceTest
{
   public static void main(String[] args) 
   {
      Invoice check1 = new Invoice("N684", "Cegueta", 2, 50.00);
      Invoice check2 = new Invoice("N368", "Pedal", 2, 18.00); 
      Invoice check3 = new Invoice("N523", "Frenos", 4, -13.00); 

      String check1Number = check1.getPartNumber();
      String check1Descri = check1.getPartDescription();
      int check1Quantity = check1.getQuantity();
      double check1Price = check1.getPricePerItem();
      double check1Invoice = check1.getInvoice();

      String check2Number = check2.getPartNumber();
      String check2Descri = check2.getPartDescription();
      int check2Quantity = check2.getQuantity();
      double check2Price = check2.getPricePerItem();
      double check2Invoice = check2.getInvoice();

      String check3Number = check3.getPartNumber();
      String check3Descri = check3.getPartDescription();
      int check3Quantity = check3.getQuantity();
      double check3Price = check3.getPricePerItem();
      double check3Invoice = check3.getInvoice();

      System.out.printf("%12s |%17s |%9s |%6s |%8s%n%n", "Part Number", 
    		  "Part Description", "Quantity", "Price", "Invoice");
      
      System.out.printf("%12s |%17s |%9s |%6.2f |%8.2f%n", check1Number, 
    		  check1Descri, check1Quantity, check1Price, check1Invoice);
      
      System.out.printf("%12s |%17s |%9s |%6.2f |%8.2f%n", check2Number, 
    		  check2Descri, check2Quantity, check2Price, check2Invoice);
      
      System.out.printf("%12s |%17s |%9s |%6.2f |%8.2f%n", check3Number, 
    		  check3Descri, check3Quantity, check3Price, check3Invoice);
      
   } // end main
} // end class AccountTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
