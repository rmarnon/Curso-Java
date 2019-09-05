package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class FuncaoQueRecebeFuncao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("PS4", 1800.00));
		list.add(new Product("PS3", 500.00));
		list.add(new Product("Switch", 2000.00));
		list.add(new Product("Xbox 360", 400.00));
		list.add(new Product("Xbox One X", 2200.00));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() > 1000);
		
		System.out.println("Sum: " + String.format("%.2f", sum));

	}

}
