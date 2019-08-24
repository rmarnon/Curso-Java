package examples;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class HashSetCompare {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("Xbox", 1200.00));
		set.add(new Product("PS4", 1500.00));
		
		Product p = new Product("PS4", 1500.00);
		
		System.out.println(set.contains(p));//Se Equals e HahsSet estiver implementado, retorna true
		//Senao, retorna falso, pois nao ira comparar conteudos, e sim referencias de objetos e sao !=

	}

}
