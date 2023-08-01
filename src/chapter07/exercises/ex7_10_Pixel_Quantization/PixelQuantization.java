package chapter07.exercises.ex7_10_Pixel_Quantization;

import java.util.Scanner;

public class PixelQuantization {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int width = 1921;
				int[] pixels = new int[width];
				int[] pixelsQuantized = new int[5];

				for (int i = 0; i < width; i++) {
						if (i <= 20) {
								pixels[i] = 10;
						} else if (i <= 40) {
								pixels[i] = 30;
						} else if (i <= 60) {
								pixels[i] = 50;
						} else if (i <= 80) {
								pixels[i] = 70;
						} else if (i <= 100) {
								pixels[i] = 90;
						} else if (i <= 120) {
								pixels[i] = 110;
						} else if (i <= 140) {
								pixels[i] = 130;
						} else if (i <= 160) {
								pixels[i] = 150;
						} else if (i <= 180) {
								pixels[i] = 170;
						} else {
								pixels[i] = 190;
						}
				}

				System.out.println("Enter 5 pixels: ");

				for (int i = 0; i < 5; i++) {
						System.out.printf("Enter the pixel #%d: ", i + 1);
						pixelsQuantized[i] = pixels[input.nextInt()];
				}

				System.out.println("The pixels quantized are: ");

				for (int i = 0; i < 5; i++) {
						System.out.printf("%5d", pixelsQuantized[i]);
				}
		}
}
