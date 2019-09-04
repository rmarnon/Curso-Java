package examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;
import util.MyComparator;

public class ComparatorInterfaceFunction {

	public static void main(String[] args) {

List<Product> list = new ArrayList<>();
		
		list.add(new Product("PS4", 1500.00));
		list.add(new Product("Xbox", 1200.00));
		list.add(new Product("Switch", 1800.00));
		
		Comparator<Product> comp2 = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		
		Comparator<Product> comp3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//Com expressao lambda atribuida a uma variavel comparator "comp2"
		
		//list.sort(new MyComparator());//Versao 1, chamando a classe criada que implementa comparator
		//list.sort(comp2);//Versao 2 chamando o objeto com expressao regular
		//list.sort(comp2);//Versao 3 chamando objeto com expressao lambda
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		//Passando a expressao lambda direto como argumento de list.sort()
		
		
		list.forEach(System.out::println);

	}

}
