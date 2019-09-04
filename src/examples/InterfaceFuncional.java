package examples;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class InterfaceFuncional {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Teclado", 120.00));
		list.add(new Product("Monitor", 800.00));
		
		
		
		list.removeIf(new Product());//Poderia ser uma classe aparte que implementa co Predicate<>

		
		list.forEach(System.out::println);
	}

}
