package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class ConsumerClass {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Teclado", 100.00));
		list.add(new Product("Monitor", 800.00));
		
		double factor = 1.5;
		
		Consumer<Product> cons = p -> {//Como e so uma linha, as chaves sao opcionais
			p.setPrice(p.getPrice() * factor);		
		};
		
		//list.forEach(new PriceUpdate()); //Implementacao da classe
		//list.forEach(Product::staticPriceUpdate); //Reference method w/ static implementado na classe
		//list.forEach(Product::nonStaticProductUpdate); //Reference method sem metodo static
		//list.forEach(cons); //Lambda declarada
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.8)); //Lambda inLine
		
		list.forEach(System.out::println);

		
	}

}
