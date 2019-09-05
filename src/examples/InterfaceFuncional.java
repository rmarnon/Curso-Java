package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.MyPredicate;

public class InterfaceFuncional {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Teclado", 120.00));
		list.add(new Product("Monitor", 800.00));
		
		Predicate<Product> pred = new Predicate<Product>() {

			@Override
			public boolean test(Product p) {
				return p.getPrice() >= 100;
			}
		};
		
		Predicate<Product> pred2 = p -> p.getPrice() >= 100;
		
		//list.removeIf(new Mypredicate());//Classe que implementa o Predicate<>
		//list.removeIf(pred);//Utilizando a interface funcional c/ expressao regular
		//list.removeIf(Product::nonStaticProductpredicate);//Reference methods S/ Static
		//list.removeIf(Product::staticProductpredicate);//reference methods C/ static
		//list.removeIf(pred2);//Expressao lambda funcional
		
		list.removeIf(p -> p.getPrice() >= 100);//expressao lambda inLine 
		
		list.forEach(System.out::println);
	}

}
