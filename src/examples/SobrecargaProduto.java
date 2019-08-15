package examples;

import java.util.Locale;
import java.util.Scanner;
import entities.Product; //Importa a classe Product

public class SobrecargaProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
				
		Product produto = new Product(name, price);
		
		produto.setName("PS4");
		System.out.println("Updated Name: " + produto.getName());
		produto.setPrice(1200);
		System.out.println("Updated Price: " + produto.getPrice());

		System.out.println("Product data: " + produto);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);

		System.out.println("Updated data: " + produto);

		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);

		System.out.println("Update data: " + produto);

		sc.close();
	}

}
