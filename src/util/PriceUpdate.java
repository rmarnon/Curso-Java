package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {//Utiliza o default method accept, nesse caso aumenta em 10% o preco
		p.setPrice(p.getPrice() * 1.1);
	}	
	
}
