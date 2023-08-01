package chapter08.exercises.ex8_04_Cylinder_Class;

public class Cylinder {
		private double radius;
		private double height;

		public Cylinder() {
				this.radius = 1;
				this.height = 1;
		}

		public double getRadius() {
				return radius;
		}

		public void setRadius(double radius) {
				if (radius > 0) {
						this.radius = radius;
				}
		}

		public double getHeight() {
				return height;
		}

		public void setHeight(double height) {
				if (height > 0) {
						this.height = height;
				}
		}

		public double getVolume() {
				return Math.PI * radius * radius * height;
		}
}
