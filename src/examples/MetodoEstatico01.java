package examples;

import java.util.Locale;
import java.util.Scanner;

public class MetodoEstatico01 {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circunference(radius); //Somente compila se a funcao for "Static"
		
		double v = volume(radius);
		
		System.out.print("Circunference: " + String.format("%.2f%n", c));
		System.out.print("Volume: " + String.format("%.2f%n", v));
		System.out.print("PI: " + String.format("%.2f%n", PI));
		
		sc.close();
	}
	
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
