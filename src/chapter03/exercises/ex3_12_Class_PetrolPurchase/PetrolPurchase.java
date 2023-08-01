package chapter03.exercises.ex3_12_Class_PetrolPurchase;

public class PetrolPurchase {
		private String location;
		private String typeOfPetrol;
		private int quantity;
		private double pricePerLitter;
		private double discountPercentage;

		public PetrolPurchase(String location, String typeOfPetrol, int quantity,
																								double pricePerLitter, double discountPercentage) {
				this.location = location;
				this.typeOfPetrol = typeOfPetrol;
				this.quantity = quantity;
				this.pricePerLitter = pricePerLitter;
				this.discountPercentage = discountPercentage;
		}

		public String getLocation() {
				return location;
		}

		public void setLocation(String location) {
				this.location = location;
		}

		public String getTypeOfPetrol() {
				return typeOfPetrol;
		}

		public void setTypeOfPetrol(String typeOfPetrol) {
				this.typeOfPetrol = typeOfPetrol;
		}

		public int getQuantity() {
				return quantity;
		}

		public void setQuantity(int quantity) {
				this.quantity = quantity;
		}

		public double getPricePerLitter() {
				return pricePerLitter;
		}

		public void setPricePerLitter(double pricePerLitter) {
				this.pricePerLitter = pricePerLitter;
		}

		public double getDiscountPercentage() {
				return discountPercentage;
		}

		public void setDiscountPercentage(double discountPercentage) {
				this.discountPercentage = discountPercentage;
		}

		public double getPurchaseAmount() {
				return this.quantity * this.pricePerLitter * (1 - discountPercentage);
		}
}
