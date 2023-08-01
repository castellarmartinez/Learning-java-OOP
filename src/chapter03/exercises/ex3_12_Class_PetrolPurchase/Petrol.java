package chapter03.exercises.ex3_12_Class_PetrolPurchase;

public class Petrol {
		public static void main(String[] args) {
				PetrolPurchase petrol = new PetrolPurchase(
												"La Canabrava", "Gasoline", 0, 3000, 0.12);

				System.out.println("The information about the petrol is: ");
				System.out.printf("Location: %s%n", petrol.getLocation());
				System.out.printf("Type of petrol: %s%n", petrol.getTypeOfPetrol());
				System.out.printf("Price per litter: $%.2f%n", petrol.getPricePerLitter());
				System.out.printf("Percentage discount : %.2f%%%n", petrol.getDiscountPercentage() * 100);

				System.out.printf("Setting the quantity of the purchase to: %d%n", 12);
				petrol.setQuantity(12);

				System.out.printf("The purchase amount is: $%.2f", petrol.getPurchaseAmount());
		}
}
