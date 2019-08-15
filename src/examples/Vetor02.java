package examples;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetor02 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product[] vector = new Product[n];
		
		double sum = 0.0;
		for (int i = 0; i < vector.length; i++) {
			sc.next();
			String name  =sc.nextLine();
			double price = sc.nextDouble();
			vector[i] = new Product(name, price);
			sum += vector[i].getPrice();
		}
		
		double avg = sum / vector.length;
		
		System.out.println("Average Price: " + String.format("%.2f", avg));
		
		sc.close();
	}

}
