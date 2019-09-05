package util;

import java.util.function.Predicate;

import entities.Product;

public class MyPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {//Necessario para usar o test
		return p.getPrice() >= 100;
	}

}
