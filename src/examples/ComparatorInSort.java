package examples;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ComparatorInSort {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}// Declarado antes do main...
	
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("PS4", 1500.00));
		list.add(new Product("Xbox", 1200.00));
		list.add(new Product("Switch", 1800.00));
		
		list.sort(ComparatorInSort::compareProducts);//Classe::Funcao (Objeto de 1 classe/ordem)
		
		list.forEach(System.out::println);

	}

}
