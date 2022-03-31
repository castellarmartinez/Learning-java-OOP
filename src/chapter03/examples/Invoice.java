package chapter03.examples;// Fig. 3.8: Invoice.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

/** 19 mayo del 2021*/

public class Invoice
{   
   private String partNumber; // instance variable 
   private String partDescription; // instance variable
   private int quantity; // instance variable
   private double pricePerItem; // instance variable 

   // Account constructor that receives two parameters  
   public Invoice(String partNumber, String partDescription, int quantity,
		   double pricePerItem) 
   {
      this.partNumber = partNumber; // assign name to instance variable name
      this.partDescription = partDescription; // assign name to instance variable name
      this.quantity = quantity; // assign name to instance variable name
      this.pricePerItem = pricePerItem; // assign name to instance variable name
   }

   // method that deposits (adds) only a valid amount to the balance
   public void setPartNumber(String partNumber) 
   {
	  this.partNumber = partNumber;
   }
   
   public String getPartNumber() 
   {
	  return partNumber;
   }
   
   public void setPartDescription(String partDescription) 
   {
	  this.partDescription = partDescription;
   }
   
   public String getPartDescription() 
   {
	  return partDescription;
   }
   
   public void setQuantity(int quantity) 
   {
	  this.quantity = quantity;
   }
   
   public int getQuantity() 
   {
	  return quantity;
   }
   
   public void setPricePerItem(double pricePerItem) 
   {
	  this.pricePerItem = pricePerItem;
   }
   
   public double getPricePerItem() 
   {
	  return pricePerItem;
   }
   
   public double getInvoice()
   {
	   if(quantity <= 0)
	   {
		  return 0.0;
	   }
	   
	   if(pricePerItem <= 0)
	   {
		   return 0.0;
	   }
	   
	   return quantity * pricePerItem;
   }
} // end class Account

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
