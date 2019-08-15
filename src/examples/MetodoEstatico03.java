package examples;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MetodoEstatico03 {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);			
			
			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();
						
			double c = Calculator.circunference(radius);//Classe com "Static" so coloca Calculator.(...)
			
			double v = Calculator.volume(radius);
			
			System.out.print("Circunference: " + String.format("%.2f%n", c));
			System.out.print("Volume: " + String.format("%.2f%n", v));
			System.out.print("PI: " + String.format("%.2f%n", Calculator.PI));
			
			sc.close();
		}

	}