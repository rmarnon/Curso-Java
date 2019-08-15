package examples;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MetodoEstatico02 {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Calculator calc = new Calculator(); // Instanciar, se a classe 'Calculator' nao for "Static"
			
			
			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();
			
			double c = calc.circunference(radius); //Usar objeto calc. se a classe nao tiver Static
						
			double v = calc.volume(radius);
			
			System.out.print("Circunference: " + String.format("%.2f%n", c));
			System.out.print("Volume: " + String.format("%.2f%n", v));
			System.out.print("PI: " + String.format("%.2f%n", calc.PI));
			
			sc.close();
		}

	}
