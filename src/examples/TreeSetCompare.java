package examples;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class TreeSetCompare {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();

		set.add(new Product("Xbox", 1200.00));
		set.add(new Product("PS4", 1500.00));
		
		for (Product p : set) {
			System.out.println(p);
		}

	}

}
