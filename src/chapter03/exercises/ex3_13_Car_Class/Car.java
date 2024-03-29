package chapter03.exercises.ex3_13_Car_Class;

public class Car {
		private String model;
		private String year;
		private double price;

		public Car(String model, String year, double price) {
				this.model = model;
				this.year = year;

				if (price >= 0) {
						this.price = price;
				}
		}

		public String getModel() {
				return model;
		}

		public void setModel(String model) {
				this.model = model;
		}

		public String getYear() {
				return year;
		}

		public void setYear(String year) {
				this.year = year;
		}

		public double getPrice() {
				return price;
		}

		public void setPrice(double price) {
				if (price >= 0) {
						this.price = price;
				}
		}
}
