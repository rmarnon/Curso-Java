package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class FunctionUpperCase {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Teclado", 100.00));
		list.add(new Product("Monitor", 800.00));
		
		Function<Product, String> fun = p -> p.getName().toUpperCase();// Expressao lambda declarada
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		List<String> names1 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		List<String> names2 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		List<String> names3 = list.stream().map(fun).collect(Collectors.toList());
		List<String> names4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		//names.forEach(System.out::println); //Implementacao da interface c/ classe
		//names1.forEach(System.out::println); //Reference method w/ static
		//names2.forEach(System.out::println); //Reference method s/ static
		//names3.forEach(System.out::println); //Expressao lambda declarada
		names4.forEach(System.out::println); //Expressao lambda in line
		
	}

}
